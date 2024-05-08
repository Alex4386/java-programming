package me.alex4386.gachon.sw14462.day20.ex10_7;

public class Student extends Person implements Comparable
{
    private int studentNumber;
    public Student()
    {
        super();
        studentNumber = 0;//Indicating no number yet
    }
    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }
    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }
    public int getStudentNumber()
    {
        return studentNumber;
    }
    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }
    public boolean equals(Student otherStudent)
    {
        return this.hasSameName(otherStudent) &&
                (this.studentNumber == otherStudent.studentNumber);
    }

    @Override
    public int compareTo(Object o) {
        Student otherStudent = (Student) o;
        if (this.studentNumber < otherStudent.studentNumber) {
            return -1;
        } else if (this.studentNumber == otherStudent.studentNumber) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Student Number: " + studentNumber;
    }
}


