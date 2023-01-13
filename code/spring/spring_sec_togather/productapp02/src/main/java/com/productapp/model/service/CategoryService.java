package com.productapp.model.service;

import com.productapp.model.dao.entities.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategories();
    public void addCategory(Category category);
    public void deleteCategory(int cid);
    public void updateCategory(Category category);
    public Category getByCategoryId(int cid);
    public Category getByCategoryType(String categoryType);
}
