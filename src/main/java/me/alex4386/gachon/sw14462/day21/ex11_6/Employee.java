package me.alex4386.gachon.sw14462.day21.ex11_6;

public class Employee extends Person {
    private String ssn;
    private int salary;

    public Employee(String name, String ssn, int salary) throws SSNLengthException, SSNCharacterException, InvalidSalaryException {
        super(name);

        validateSSN(ssn);
        this.ssn = ssn;

        if (salary < 0) {
            throw new InvalidSalaryException();
        }
        this.salary = salary;
    }

    private static boolean validateSSN(String ssn) throws SSNLengthException, SSNCharacterException {
        String strippedSSN = stripSSN(ssn);
        if (strippedSSN.length() != 9) {
            throw new SSNLengthException();
        }

        // check [0-9]{9} regex against strippedSSN
        if (!strippedSSN.matches("[0-9]{9}")) {
            throw new SSNCharacterException();
        }

        return true;
    }

    private static String stripSSN(String ssn) {
        return ssn.replaceAll("-", "").replaceAll(" ", "");
    }

    public String getSSN() {
        return this.ssn;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) throws InvalidSalaryException {
        if (salary < 0) throw new InvalidSalaryException();
        this.salary = salary;
    }

    public void setSSN(String ssn) throws SSNLengthException, SSNCharacterException {
        validateSSN(ssn);
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "[Employee] Name: "+this.getName()+", SSN: " + this.ssn + ", Salary: " + this.salary;
    }
}

class SSNLengthException extends Exception {
    public SSNLengthException() {
        this("Invalid SSN Length");
    }

    public SSNLengthException(String message) {
        super(message);
    }
}

class SSNCharacterException extends Exception {
    public SSNCharacterException() {
        this("Invalid SSN Character");
    }

    public SSNCharacterException(String message) {
        super(message);
    }
}

class InvalidSalaryException extends Exception {
    public InvalidSalaryException() {
        this("Invalid Salary Range");
    }

    public InvalidSalaryException(String message) {
        super(message);
    }
}