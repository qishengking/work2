package com.gupao.Factory;

public class XiaoMiPhoneFactory implements PhoneFactory{
    @Override
    public Phone create() {
        return new XiaoMi();
    }
}
