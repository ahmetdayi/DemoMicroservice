package com.demo.client.categoryclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "category-service", url = "localhost:8222/api/v1/category")
public interface CategoryClient {

    @GetMapping("/{id}")
    CategoryResponse findById(@PathVariable("id") String id);
}
