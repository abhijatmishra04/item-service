package com.example.purchase.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String pack_unit;
    private String pack_size;
    private String standard_unit;
    private Double sale_price;

    public Item() {}

    public Item(String code, String name, String packUnit, String packSize, String standardUnit, Double salePrice) {
        this.code = code;
        this.name = name;
        this.pack_unit = packUnit;
        this.pack_size = packSize;
        this.standard_unit = standardUnit;
        this.sale_price = salePrice;
    }

    // Getters and Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPack_unit() {
        return pack_unit;
    }

    public void setPack_unit(String pack_unit) {
        this.pack_unit = pack_unit;
    }

    public String getPack_size() {
        return pack_size;
    }

    public void setPack_size(String pack_size) {
        this.pack_size = pack_size;
    }

    public String getStandard_unit() {
        return standard_unit;
    }

    public void setStandard_unit(String standard_unit) {
        this.standard_unit = standard_unit;
    }

    public Double getSale_price() {
        return sale_price;
    }

    public void setSale_price(Double sale_price) {
        this.sale_price = sale_price;
    }
}
