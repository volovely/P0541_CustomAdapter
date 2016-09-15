package com.example.roman.p0541_customadapter;

/**
 * Created by Roman on 15.09.2016.
 */
public class Product {
    String name;
    int price;
    int image;
    boolean box;


    Product(String _describe, int _price, int _image, boolean _box) {
        name = _describe;
        price = _price;
        image = _image;
        box = _box;
    }
}
