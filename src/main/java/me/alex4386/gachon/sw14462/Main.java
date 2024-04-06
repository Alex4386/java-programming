package me.alex4386.gachon.sw14462;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static String currentTarget = "day10";
    public static boolean fallbackToLatest = true;

    public static Map<String, Class<?>> getAvailableTargetClassNames() {
        Map<String, Class<?>> classes = new TreeMap<>();

        for (int i = 1; i <= 99; i++) {
            String className = String.format(Main.class.getPackage().getName() + ".day%02d.Main", i);

            try {
                Class<?> klass = Class.forName(className);
                classes.put(String.format("day%02d", i), klass);
            } catch(ClassNotFoundException e) {
                continue;
            }
        }

        return classes;
    }

    public static void launchCurrentTarget(String[] args) {
        Map<String, Class<?>> classes = Main.getAvailableTargetClassNames();

        if (classes.containsKey(currentTarget)) {
            Class<?> klass = classes.get(currentTarget);
            if (klass != null) {
                Main.launchGivenClass(klass, args);
            }
        }
    }

    public static void launchGivenClass(Class<?> klass, String[] args) {
        Method mainMethod;

        try {
            mainMethod = klass.getMethod("main", String[].class);
        } catch (NoSuchMethodException e) {
            System.err.println("Main method not found in the target class.");
            return;
        }

        try {
            mainMethod.invoke(null, (Object) args);
        } catch (InvocationTargetException e) {
            e.getTargetException().printStackTrace();
            return;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return;
        }
    }

    public static void main(String[] args) {
        Class<?> klass;
        if (currentTarget.length() > 0) {
            Main.launchCurrentTarget(args);
            return;
        }

        if (args.length >= 1) {
            Map<String, Class<?>> classes = Main.getAvailableTargetClassNames();
            currentTarget = args[0];

            if (classes.containsKey(currentTarget)) {
                klass = classes.get(currentTarget);
                List<String> newArgs = new ArrayList<>();
                if (args.length >= 1) {
                    for (int i = 1; i < args.length; i++) {
                        newArgs.add(args[i]);
                    }
                }

                String[] newArgsArray = (String[]) newArgs.toArray();
                Main.launchGivenClass(klass, newArgsArray);
                return;
            }
        }

        if (fallbackToLatest) {
            Map<String, Class<?>> classes = Main.getAvailableTargetClassNames();
            List<String> keys = new ArrayList<>(classes.keySet());

            if (keys.size() > 0) {
                currentTarget = keys.get(keys.size() - 1);
                klass = classes.get(currentTarget);
                Main.launchGivenClass(klass, args);
                return;
            }
        }

        if (System.console() != null) {
            askUserForLaunch(args);
        } else {
            System.err.println("Console not available for loading specific class. Exiting.");
            System.exit(1);
        }
    }

    public static void askUserForLaunch(String[] args) {
        Map<String, Class<?>> classes = Main.getAvailableTargetClassNames();

        // list all classes and make user select one
        System.out.println("Available classes:");
        for (String className : classes.keySet()) {
            System.out.println("* " + className);
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("");
            System.out.print("Class name to launch (Enter \"exit\" to exit): ");
            String input = scanner.nextLine();
            scanner.close();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (classes.containsKey(input)) {
                System.out.println("Launching " + input + "...");
                System.out.println("");

                currentTarget = input;
                Main.launchCurrentTarget(args);
                break;
            } else {
                System.out.println("Invalid class name.");
            }
        }
    }
}
