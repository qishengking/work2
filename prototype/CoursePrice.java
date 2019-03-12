package com.gupao.prototype;


import java.io.*;

public class CoursePrice implements Serializable {

    private String javaprice;

    private String pythonprice;

    private String cprice;

    public String getJavaprice() {
        return javaprice;
    }

    public void setJavaprice(String javaprice) {
        this.javaprice = javaprice;
    }

    public String getPythonprice() {
        return pythonprice;
    }

    public void setPythonprice(String pythonprice) {
        this.pythonprice = pythonprice;
    }

    public String getCprice() {
        return cprice;
    }

    public void setCprice(String cprice) {
        this.cprice = cprice;
    }

    public CoursePrice(){
        this.javaprice = "10000";
        this.pythonprice = "10000";
        this.cprice = "10000";
    }

    public CoursePrice shadowClone(){
        CoursePrice cs = new CoursePrice();
        cs.setJavaprice(this.javaprice);
        cs.setPythonprice(this.pythonprice);
        cs.setCprice(this.cprice);
        return cs;
    }



    public Object deepClone(){
        try{

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            CoursePrice cd = (CoursePrice)ois.readObject();
            return cd;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
