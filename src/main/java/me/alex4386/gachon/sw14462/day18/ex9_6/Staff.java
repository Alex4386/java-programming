package me.alex4386.gachon.sw14462.day18.ex9_6;

public class Staff extends Employee {
    private int payGrade;

    public Staff(String name, int employeeID, String department, int payGrade) {
        super(name, employeeID, department);
        this.payGrade = payGrade;
    }

    public void setPayGrade(int newPayGrade) {
        payGrade = newPayGrade;
    }

    public int getPayGrade() {
        return payGrade;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Pay Grade: " + payGrade);
    }

    @Override
    public String toString() {
        return "Staff - Name: " + getName() + ", Pay Grade: " + payGrade;
    }
}
