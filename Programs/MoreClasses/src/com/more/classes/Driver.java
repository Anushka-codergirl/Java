package com.more.classes;

public class Driver
{
    public static void main(String[] args)
    {
        Subject subject1 = new Subject("TPG10AB","Technical Programming 1");

        Student student1 = new Student("Anushka Raj",12594684);

        ExamPaper paper = new ExamPaper(student1,subject1,100);

        System.out.println(paper);
        System.out.println("Subject code:" + paper.getSubject().getSubjectCode());
        System.out.println("Student number: " + paper.getStudent().getStudentNumber());

    }
}
