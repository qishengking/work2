package com.gupao.Factory;

public class HuaWeiPhoneFactory implements PhoneFactory{
    @Override
    public Phone create() {
        return new HuaWei();
    }
}
