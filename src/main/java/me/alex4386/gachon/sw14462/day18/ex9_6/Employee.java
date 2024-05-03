package me.alex4386.gachon.sw14462.day18.ex9_6;

public class Employee extends Person {
    private int employeeID;
    private String department;

    public Employee(String name, int employeeID, String department) {
        super(name);
        this.employeeID = employeeID;
        this.department = department;
    }

    public void writeOutput() {
        super.writeOutput();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public boolean equals(Employee otherEmployee) {
        return this.hasSameName(otherEmployee) && (this.employeeID == otherEmployee.employeeID) && this.department.equalsIgnoreCase(otherEmployee.department);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee - Name: " + getName() + ", Employee ID: " + employeeID + ", Department: " + department;
    }
}
