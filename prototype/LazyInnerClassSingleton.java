package com.gupao.prototype;



//懒汉式单例


//因为单例模式和原型模式是一个相反的过程，所以单例模式要么不实现Cloneable要么实现Cloneable后
//重写clone()方法 不让它被序列化
public class LazyInnerClassSingleton implements Cloneable{
    private LazyInnerClassSingleton(){
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }


    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

    //默认不加载1
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    //这里让clone()方法返回getInstance()方法获取实例
    @Override
    public Object clone() throws CloneNotSupportedException{
        return getInstance();
    }
}
