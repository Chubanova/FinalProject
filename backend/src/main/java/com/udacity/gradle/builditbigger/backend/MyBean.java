package com.udacity.gradle.builditbigger.backend;

import com.example.jokejava.MyClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private MyClass myClass;

    public String getData() {
        return myClass.getJoke();
    }

    public void setData(MyClass data) {
        myClass = data;
    }
}