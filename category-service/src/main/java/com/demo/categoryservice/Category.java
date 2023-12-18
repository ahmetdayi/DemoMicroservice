package com.demo.categoryservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {

    @Id
    private String id;

    private String name;

    public Category(String name) {
        this.name = name;
    }
}
