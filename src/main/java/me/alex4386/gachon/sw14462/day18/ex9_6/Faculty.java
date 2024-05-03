package me.alex4386.gachon.sw14462.day18.ex9_6;

public class Faculty extends Employee {
    private String title;

    public Faculty(String name, int employeeID, String department, String title) {
        super(name, employeeID, department);
        this.title = title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Title: " + title);
    }

    @Override
    public String toString() {
        return "Faculty - Name: " + getName() + ", Title: " + title;
    }
}
