public class Student { 
    private String name; 
    private String rollNo; 
    private String dept; 
    private int age; 
    Student (String rollNo, int age) 
    { 
        this.rollNo=rollNo; 
        this.age=age; 
    } 
    punlic void setData (String name, String dept) 
    { 
        this.name=name; 
        this.dept=dept; 
    } 
    public void getData() 
    { 
        System.out.println("Name: "+name); 
        System.out.println("Roll number: "+rollNo); 
        System.out.println("Age: "+age); 
    } 
} 
class OOP_Task_3rd 
{ 
    public static void main (String[] args){ 
        student s1=new student ("21SW129",19); 
        s1.setData("Sawera Saeed","Software"); 
        s1.getData(); 
} 
}