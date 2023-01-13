package com.productapp.model.dao.impl;

import com.productapp.model.dao.CategoryDao;
import com.productapp.model.dao.entities.Category;
import com.productapp.model.exception.ResourceNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Primary
public class CategoryDaoImpl implements CategoryDao {

    private SessionFactory sessionFactory;

    @Autowired
    public CategoryDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private Session getSeession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Category> getAllCategories() {
        return getSeession().createQuery("select c from Category c").getResultList();
    }

    @Override
    public void addCategory(Category category) {
        getSeession().persist(category);
    }

    @Override
    public void deleteCategory(int cid) {
        Category categoryToDelete= getByCategoryId(cid);
        getSeession().remove(categoryToDelete);
    }

    @Override
    public void updateCategory(Category category) {
        //update vs merge ?
        getSeession().merge(category);
    }

    @Override
    public Category getByCategoryId(int cid) {
        Category category= getSeession().get(Category.class, cid);
        if(category==null)
            throw  new ResourceNotFoundException("category "+ cid+ " is not found");
        return category;
    }

    @Override
    public Category getByCategoryType(String categoryType) {
        Category category=getSeession().createQuery
                ("select c from Category c where c.categoryType=:categoryType",Category.class)
                .setParameter("categoryType", categoryType)
                .getSingleResult();

        //uniqueResult vs getSingleResult

        List<Category> categories=getSeession().createQuery
                        ("select c from Category c where c.categoryType=:categoryType",Category.class)
                .setParameter("categoryType", categoryType)
                .getResultList();
       if( categories.size()==0){
           throw  new ResourceNotFoundException("category "+ categoryType+ " is not found");
       }
        return categories.get(0);
    }
}
