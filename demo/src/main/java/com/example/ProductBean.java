package com.example;

import java.io.Serializable;

public class ProductBean implements Serializable {
  private String name;
  private double price;

  public ProductBean() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
