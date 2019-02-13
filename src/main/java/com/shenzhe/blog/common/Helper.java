package com.shenzhe.blog.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Helper {
    public static void varDump(Object o, int sum) {
        String className = o.getClass().getName();
        if ((sum & 1) == 1) {
            Field[] fields = o.getClass().getDeclaredFields();
            System.out.println("类" + className + "中声明的field属性");
            for (int i = 0; i < fields.length; ++i) {
                fields[i].setAccessible(true);
                try {
                    System.out.println(fields[i].getName() + "-" + fields[i].toString() + "-" + fields[i].get(o));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

        if ((sum & 2) == 2) {
            Class[] classes = o.getClass().getDeclaredClasses();
            System.out.println("类" + className + "中声明的类");
            for (int i = 0; i < classes.length; ++i) {
                try {
                    System.out.println(classes[i].getName() + "-" + classes[i].toString());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }

        if ((sum & 4) == 4) {
            Method[] methods = o.getClass().getDeclaredMethods();
            System.out.println("类" + className + "中声明的方法");
            for (int i = 0; i < methods.length; ++i) {
                try {
                    System.out.println(methods[i].getName() + "-" + methods[i].toString());
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
