package me.alex4386.gachon.sw14462.day18.ex9_6;

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        Person[] people = new Person[4];
        people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
        people[1] = new Faculty("Dent, Arthur", 6102, "Physics", "Distinguished Professor");
        people[2] = new Student("DeBanque, Robin", 8812);
        people[3] = new Staff("Bugg, June", 9901, "Computer Science", 3);
        for (Person p : people)
        {
            p.writeOutput();
            System.out.println();
        }
    }
}
