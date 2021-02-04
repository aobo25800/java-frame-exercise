package com.zjz;

import com.zjz.lei.Lei;
import com.zjz.zhujie.ZhuJie;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) throws Exception {
        Lei lei = new Lei();
//        Class leiClass = lei.getClass();

        Class<?> leiClass = Class.forName("com.zjz.lei.Lei");


        Method[] leiClassDeclaredMethods =  leiClass.getDeclaredMethods();

        for (Method m : leiClassDeclaredMethods ){
            System.out.println(m);

            Annotation a = m.getAnnotation(ZhuJie.class);
            System.out.println(a.annotationType());

            if (m.isAnnotationPresent(ZhuJie.class)){
                m.invoke(leiClass.newInstance(), ((ZhuJie) a).name());
            }
        }
    }
}
