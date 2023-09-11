package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "sellPrice")
    private Float sellPrice;

    @Column(name = "originPrice")
    private Float originPrice;

    @Column(name = "[description]")
    private String description;

    @Column(name = "statusId")
    private Long statusId;

    @Column(name = "subCategory")
    private String subCategory;

    @Column(name = "brand")
    private String brand;

}
