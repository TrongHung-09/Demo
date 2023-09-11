package com.example.demo.controller;


import com.example.demo.data.CategoryData;
import com.example.demo.data.StatusIDData;
import com.example.demo.model.Product;
import com.example.demo.service.ProductServiceImpl;
import com.example.demo.data.BrandData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @Autowired
    BrandData brandData;

    @Autowired
    CategoryData categoryData;

    @Autowired
    StatusIDData statusIDData;

    @GetMapping("/home")
    public ModelAndView test(Model model){
        ModelAndView modelAndView = new ModelAndView("home");
        model.addAttribute("list", productServiceImpl.getAllProducts());
        model.addAttribute("list_Brand", brandData.getAll());
        model.addAttribute("list_Category", categoryData.getAll());
        model.addAttribute("list_StatusID", statusIDData.getAll());
        model.addAttribute("product", new Product());
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView add(@ModelAttribute Product product){
        product.setStatusId(Long.parseLong("1"));
        productServiceImpl.addProduct(product);
        ModelAndView modelAndView = new ModelAndView("redirect:home");
        return modelAndView;
    }

    @PostMapping("/add1")
    public Product add1(@RequestBody Product product){
        return productServiceImpl.addProduct(product);
    }

    @GetMapping("/show")
    public List<Product> getAll(){
        return productServiceImpl.getAllProducts();
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Long id){

        return "";
    }

    @PutMapping("/edit/{id}")
    public Product edit(@PathVariable Long id, @RequestBody Product product){
        return productServiceImpl.updateProduct(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id){
        return productServiceImpl.deleteProduct(id);
    }

}
