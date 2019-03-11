package com.gupao.AbstractFactory;

public class HuaWeiFactory implements PhoneFactory{
    @Override
    public Call createCall() {
        return new HuaWeiCall();
    }

    @Override
    public Message createMessige() {
        return new HuaWeiMessage();
    }
}
