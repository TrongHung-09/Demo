package com.example.demo.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryData {
    public List<String> list = new ArrayList<>();

    public List<String> getAll(){
        list.clear();
        list.add("Category 1");
        list.add("Category 2");
        list.add("Category 3");
        return list;
    }
}
