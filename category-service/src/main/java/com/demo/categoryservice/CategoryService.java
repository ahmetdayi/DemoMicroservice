package com.demo.categoryservice;

import com.demo.client.categoryclient.CategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryResponse create(CategoryRequest categoryRequest){
        Category category = new Category(categoryRequest.name());

        Category save = categoryRepository.save(category);

        return new CategoryResponse(save.getId(), save.getName());

    }

    public CategoryResponse findById(String id){
        Category category = categoryRepository.findById(id).orElseThrow(()->new RuntimeException("Not found"));

        return new CategoryResponse(category.getId(), category.getName());
    }
}
