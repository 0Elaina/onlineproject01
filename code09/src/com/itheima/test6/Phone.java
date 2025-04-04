package com.itheima.test6;

public class Phone {
    //属性
    private String brand;
    private int price;
    private String color;


    //空参构造
    public Phone(){}

    //带全部参数的构造
    public Phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //get set

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
