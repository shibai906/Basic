package com.zhao.Test;

import com.zhao.design.patterns.template.method.BaoMaCar;
import com.zhao.design.patterns.template.method.CarModel;

public class TestCarModel {

    public static void main(String[] args){

        CarModel carModel = new BaoMaCar();
        carModel.excet();

    }

}
