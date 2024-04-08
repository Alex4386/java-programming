package me.alex4386.gachon.sw14462.day11.ex6_6;

public class Person
{
    private String name;
    private int age;

    /* Start of Exercise 10 */
    public Person() {
        this("No name yet", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static Person createAdult() {
        return new Person("An adult", 21);
    }
    /* End of Exercise 10 */

    /* From the Self-Test Question 16 */

    /*
        // Commented-out since due to duplicate requirement
        // from Programming Project 6

        public void setName(String newName)
        {
            name = newName;
        }

        public void setAge(int newAge)
        {
            if (newAge >= 0)
                age = newAge;
            else
            {
                System.out.println("ERROR: Age is " +
                        "negative.");
                System.exit(0);
            }
        }
     */

    public void setPerson(String newName, int newAge)
    {
        setName(newName);
        setAge(newAge);
    }
    /* End of Self-Test Question 16 */


    /* Start of Programming projects 6 */
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String first, String last) {
        this.name = first + " " + last;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (this.age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = age;
    }

    public static Person createToddler() {
        return new Person("A toddler", 2);
    }

    public static Person createPreschooler() {
        return new Person("A preschooler", 5);
    }

    public static Person createAdolescent() {
        return new Person("An adolescent", 9);
    }

    public static Person createTeenager() {
        return new Person("A teenager", 15);
    }
}
