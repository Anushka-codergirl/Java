package com.more.classes;

public class ExamPaper
{
    private Student student;
    private Subject subject;
    private int marks;

    public ExamPaper(Student student, Subject subject, int marks) {
        this.student = new Student(student);
        this.subject = new Subject(subject);
        this.marks = marks;
    }

    public Student getStudent() {
        return new Student(student);
    }

    public void setStudent(Student student) {
        this.student = new Student(student);
    }

    public Subject getSubject() {
        return  new Subject(subject);
    }

    public void setSubject(Subject subject) {
        this.subject =  new Subject(subject);
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString()
    {
        return "Exam paper information:\n" +
                student + "\n" + subject + "\n" + "Marks: " + marks;
    }
}
