package com.gupao.SimpleFactory;

public class PhoneFactory {
    public Phone create(String name){
        if("Apple".equals(name)){
            return new ApplePhone();
        }else if("Huawei".equals(name)){
            return new HuaweiPhone();
        }else if("Samsung".equals(name)){
            return new SamsungPhone();
        }else {
            return null;
        }
    }
}
