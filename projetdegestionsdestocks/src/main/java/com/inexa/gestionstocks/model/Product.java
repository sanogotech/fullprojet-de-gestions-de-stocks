package com.inexa.gestionstocks.model;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Myproduct")
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    //@Column
    @NotNull
    @Size(min=2, max=30)
    private String numberProduct;

    //@Column
    @NotNull
    @Size(min=10, max=50)
    private String name;

    //@Column
    @NotNull
    @Min(3)
    private Integer price;

    //@Column
    @NotNull
    @Size(min=20, max=500)
    private String description;

    private String fileName;

    @OneToMany(mappedBy = "product")
    private Set<Order> commandes;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(String numberProduct) {
        this.numberProduct = numberProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
