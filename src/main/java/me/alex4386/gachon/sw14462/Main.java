package me.alex4386.gachon.sw14462;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static String currentTarget = "day02";

    public static void main(String[] args) {
        String target = currentTarget;
        Class<?> klass = null;

        try {
            klass = Class.forName(Main.class.getPackage().getName()+"."+target+".Main");
        } catch(ClassNotFoundException e) {
            System.err.println("Failed to fetch class");
            System.exit(1);
        }

        Method mainMethod = null;
        try {
            mainMethod = klass.getDeclaredMethod("main", String[].class);
        } catch(NoSuchMethodException ignored) {}

        if (mainMethod != null) {
            try {
                Object[] invokeArgs = { args };
                mainMethod.invoke(klass, invokeArgs);
            } catch(IllegalAccessException | InvocationTargetException e) {
                System.exit(1);
            }
        }
    }
}
