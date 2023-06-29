package com.glsoft.demo.models;

// OrderModel & OrderListModel

public class OrderModel {
    private String id;
    private String product;
    private String count;
    private String price;

    // getters and setters
    public String getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public String getCount() {
        return count;
    }

    public String getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    // constructors
    public OrderModel() {
    }

    public OrderModel(String id, String product, String count, String price) {
        this.id = id;
        this.product = product;
        this.count = count;
        this.price = price;
    }
}