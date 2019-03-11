package com.gupao.AbstractFactory;

public class XiaoMiFactory implements PhoneFactory{
    @Override
    public Call createCall() {
        return new XiaoMiCall();
    }

    @Override
    public Message createMessige() {
        return new XiaoMiMessage();
    }
}
