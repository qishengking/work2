package com.gupao.prototype;

public class CoursePriceTest {
    public static void main(String[] args){
        CoursePrice coursePrice = new CoursePrice();

        //浅克隆
        CoursePrice cs = coursePrice.shadowClone();
        //通过判断发现cs的属性对应的只是原来对象的引用 通过==判断发现为true 同一个引用地址
        System.out.println("coursePrice.javaprice:"+coursePrice.getJavaprice());
        System.out.println("cs.javaprice:"+cs.getJavaprice());
        System.out.println("两个属性对比："+(coursePrice.getJavaprice()==cs.getJavaprice()));




        //深克隆
        CoursePrice cd = (CoursePrice)coursePrice.deepClone();
        //通过判断发现cd的属性为真正的值而非原用对象的引用 通过==判断发现为false 两个不同的引用地址
        System.out.println("coursePrice.javaprice:"+coursePrice.getJavaprice());
        System.out.println("cd.javaprice:"+cd.getJavaprice());
        System.out.println("两个属性对比："+(coursePrice.getJavaprice()==cd.getJavaprice()));


    }
}
