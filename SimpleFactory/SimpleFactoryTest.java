package com.gupao.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args){
        PhoneFactory factory = new PhoneFactory();
        factory.create("Apple").phoneName();
    }
}
