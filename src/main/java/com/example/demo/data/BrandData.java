package com.example.demo.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BrandData {
    public List<String> list = new ArrayList<>();

    public List<String> getAll(){
        list.clear();
        list.add("ABC");
        list.add("BCD");
        list.add("CDE");
        return list;
    }
}
