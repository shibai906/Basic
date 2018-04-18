package com.zhao.design.patterns.combination.pattern;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private String name = null ;
    private String desc = null ;
    private List<MenuComponent> menuComponents = null ;

    public Menu(String name ,String desc) {
        this.name = name ;
        this.desc = desc ;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void print() {
        System.out.println("\n Menu:{" + name + "," + desc + "}");
        if( menuComponents == null ) {
            return;
        }
        System.out.println("-------------------------");

        for(MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        if(menuComponent == null ) {
            menuComponents = new ArrayList<>() ;
        }
        menuComponents.add(menuComponent) ;
    }

    @Override
    public MenuComponent getChild(int childIndex) {
        if (menuComponents == null || menuComponents.size() <= childIndex) {
            return null ;
        }

        return menuComponents.get(childIndex) ;
    }
}
