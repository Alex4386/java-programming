package me.alex4386.gachon.sw14462.day20.ex10_7;

public class StudentLexical extends Student implements Comparable
{

    public StudentLexical(Student student) {
        super(student.getName(), student.getStudentNumber());
    }

    @Override
    public int compareTo(Object o) {
        StudentLexical otherStudent = (StudentLexical) o;
        return this.getName().compareTo(otherStudent.getName());
    }
}


