package me.alex4386.gachon.sw14462.day11.ex6_6;

public class PersonTest {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 20);
        System.out.println("Person alex = new Person(\"Alex\", 20);");

        System.out.println("alex.getName() = " + alex.getName());
        System.out.println("alex.getAge() = " + alex.getAge());
        System.out.println("alex.setAge(21)");
        alex.setAge(21);
        System.out.println("alex.getAge() = " + alex.getAge());

        System.out.println("alex.setName(\"Alexey Pajitnov\")");
        alex.setName("Alexey Pajitnov");

        System.out.println("alex.getName() = " + alex.getName());
        System.out.println("alex.setName(\"Alexander\")");
        alex.setName("Alexander");
        System.out.println("alex.getName() = " + alex.getName());

        System.out.println("alex.setName(\"Alexey\", \"Pajitnov\")");
        alex.setName("Alexey", "Pajitnov");
        System.out.println("alex.getName() = " + alex.getName());

        System.out.println("alex.setPerson(\"Alex\", 42)");
        alex.setPerson("Alex", 42);
        System.out.println("alex.getName() = " + alex.getName());
        System.out.println("alex.getAge() = " + alex.getAge());

        Person toddler = Person.createToddler();
        System.out.println("Person toddler = Person.createToddler();");
        System.out.println("toddler.getName() = " + toddler.getName());
        System.out.println("toddler.getAge() = " + toddler.getAge());

        Person adult = Person.createAdult();
        System.out.println("Person adult = Person.createAdult();");
        System.out.println("adult.getName() = " + adult.getName());
        System.out.println("adult.getAge() = " + adult.getAge());

        Person preSchooler = Person.createPreschooler();
        System.out.println("Person preSchooler = Person.createPreschooler();");
        System.out.println("preSchooler.getName() = " + preSchooler.getName());
        System.out.println("preSchooler.getAge() = " + preSchooler.getAge());

        Person teenager = Person.createTeenager();
        System.out.println("Person teenager = Person.createTeenager();");
        System.out.println("teenager.getName() = " + teenager.getName());
        System.out.println("teenager.getAge() = " + teenager.getAge());

        Person adolescent = Person.createAdolescent();
        System.out.println("Person adolescent = Person.createAdolescent();");
        System.out.println("adolescent.getName() = " + adolescent.getName());
        System.out.println("adolescent.getAge() = " + adolescent.getAge());

        System.out.println("End of test.");
    }
}
