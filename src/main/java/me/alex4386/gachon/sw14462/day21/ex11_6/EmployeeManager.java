package me.alex4386.gachon.sw14462.day21.ex11_6;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    private int maxEmployeeCount;

    public EmployeeManager() {
        this(100);
    }

    public EmployeeManager(int maxEmployeeCount) {
        this.maxEmployeeCount = maxEmployeeCount;
    }

    private boolean isInsertable() {
        return employees.size() < maxEmployeeCount;
    }

    public void addEmployee(Employee employee) throws EmployeeFullException {
        if (isInsertable()) {
            employees.add(employee);
        } else {
            throw new EmployeeFullException();
        }
    }

    public Employee registerEmployee(String name, String ssn, int salary) {
        try {
            Employee employee = new Employee(name, ssn, salary);
            this.addEmployee(employee);
            return employee;
        } catch (SSNLengthException e) {
            System.out.println("Invalid SSN Length");
        } catch (SSNCharacterException e) {
            System.out.println("Invalid SSN Character");
        } catch (InvalidSalaryException e) {
            System.out.println("Invalid Salary Range");
        } catch (EmployeeFullException e) {
            System.out.println("Employee List is Full");
        }
        return null;
    }

    private double getAverageSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }

    public void printEmployees() {
        double average = this.getAverageSalaries();
        for (Employee employee : employees) {
            System.out.print(employee);
            System.out.print(" ");

            if (employee.getSalary() > average) {
                System.out.print("(Above Average)");
            } else if (employee.getSalary() < average) {
                System.out.print("(Below Average)");
            } else {
                System.out.print("(Average)");
            }
            System.out.println();
        }
    }


}

class EmployeeFullException extends Exception {
    public EmployeeFullException() {
        this("Employee List is Full");
    }

    public EmployeeFullException(String message) {
        super(message);
    }
}
