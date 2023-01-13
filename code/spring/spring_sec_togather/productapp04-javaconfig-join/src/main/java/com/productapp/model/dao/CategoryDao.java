package com.productapp.model.dao;
import com.productapp.model.dao.entities.Category;

import  java.util.*;
public interface CategoryDao {
    public List<Category> getAllCategories();
    public void addCategory(Category category);
    public void deleteCategory(int cid);
    public void updateCategory(Category category);
    public Category getByCategoryId(int cid);
    public Category getByCategoryType(String categoryType);
}
