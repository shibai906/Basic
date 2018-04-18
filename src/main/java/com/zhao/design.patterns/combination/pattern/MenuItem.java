package com.zhao.design.patterns.combination.pattern;

public class MenuItem extends MenuComponent {

    private String name = null ;
    private String desc = null ;
    private boolean vegetarian = false ;
    private double price = 0.0d ;

    public MenuItem(String name, String desc, boolean vegetarian, double price) {
        this.name = name;
        this.desc = desc;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return desc ;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print() {
        System.out.println("MenuItem:{" + name + "," + desc + "," + vegetarian + "," + price);
    }
}
