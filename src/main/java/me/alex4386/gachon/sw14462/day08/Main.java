package me.alex4386.gachon.sw14462.day08;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static String chainloadTarget = "ex4_7";

    public static void main(String[] args) {
        String packageName = Main.class.getPackage().getName();
        String chainLoadTargetClass = packageName + "." + chainloadTarget + ".Main";

        try {
            Class<?> klass = Class.forName(chainLoadTargetClass);
            klass.getMethod("main", String[].class).invoke(null, (Object) args);
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to find the chainload target class.");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
