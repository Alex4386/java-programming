package me.alex4386.gachon.sw14462.day11;

import me.alex4386.gachon.sw14462.utils.Chainloader;

public class Main {
    public static String chainloadTarget = "ex6_7";

    public static void main(String[] args) throws Throwable {
        String packageName = Main.class.getPackage().getName();
        String chainLoadTargetClass = packageName + "." + chainloadTarget + ".Main";

        try {
            Chainloader.chainloadTarget(chainLoadTargetClass, args);
        } catch (Exception e) {
            throw e;
        }
    }
}
