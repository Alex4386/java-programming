package me.alex4386.gachon.sw14462.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Chainloader {
    public static void chainloadTarget(String targetClass, String[] args) throws Throwable {
        try {
            Class<?> klass = Class.forName(targetClass);
            Method mainMethod = klass.getMethod("main", String[].class);

            mainMethod.invoke(null, (Object) args);
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to find the chainload target class.");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
