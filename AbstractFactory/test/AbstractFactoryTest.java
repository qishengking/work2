package com.gupao.AbstractFactory.test;

import com.gupao.AbstractFactory.XiaoMiFactory;
import com.gupao.Factory.XiaoMi;

public class AbstractFactoryTest {


    public static void main(String[] args){
        XiaoMiFactory factory = new XiaoMiFactory();
        factory.createCall().call();
        factory.createMessige().messige();

    }
}
