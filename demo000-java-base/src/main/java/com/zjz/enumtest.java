package com.zjz;

public enum enumtest {


    a("name", 1);

    private String name;
    private Integer c;
    enumtest(String name, Integer c){
        this.name = name;
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public Integer getC() {
        return c;
    }
}
