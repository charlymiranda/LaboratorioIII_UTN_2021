package com.miranda.test;

import com.miranda.clases.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rc = new Rectangle(5.2, 4.8);
        String rec = rc.toString();
        System.out.println(rec);

        double area = rc.calculateArea();
        System.out.println("the area is: " + area);

        double perimeter = rc.calculatePerimeter();
        System.out.println("The perimeter is: " + perimeter);

        rc.setLength(5.0);
        rc.setWidth(4.0);
        area = rc.calculateArea();
        System.out.println("the area is: " + area);
        perimeter = rc.calculatePerimeter();
        System.out.println("The perimeter is: " + perimeter);

        Rectangle rc1 = new Rectangle();

        String rec1 = rc1.toString();
        System.out.println(rec1);


    }
}
