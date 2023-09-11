package com.example.demo.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StatusIDData {
    public List<String> list = new ArrayList<>();

    public List<String> getAll(){
        list.clear();
        list.add("Còn hàng");
        list.add("Hết hàng");
        return list;
    }
}
