package com.gupao.Factory.test;

import com.gupao.Factory.HuaWeiPhoneFactory;
import com.gupao.Factory.Phone;
import com.gupao.Factory.PhoneFactory;

public class FactoryTest {
    public static void main(String[] args){
        PhoneFactory factory = new HuaWeiPhoneFactory();
        Phone phone = factory.create();
        phone.phoneName();
    }
}
