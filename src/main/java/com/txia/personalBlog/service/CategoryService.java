package com.txia.personalBlog.service;

import com.txia.personalBlog.entity.Category;
import com.txia.personalBlog.payload.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto addCategory(CategoryDto categoryDto);
    CategoryDto getCategory(long categoryId);
    List<CategoryDto> getAllCategories();
    CategoryDto updateCategory(CategoryDto categoryDto, long categoryId);

    void deletCategory(long categoryId);
}
