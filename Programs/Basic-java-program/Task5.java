class Student { 
    private String name; 
    private String rollNo; 
    private String dept; 
    private int age; 
    Student (String rollNo, int age) 
    { 
        this.rollNo=rollNo; 
        this.age=age; 
    } 
    public void setData (String name, String dept) 
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
 public class Task5{
     public static void main (String[] args){ 
        Student s1=new Student ("21SW129",19); 
        s1.setData("Sawera Saeed","Software"); 
        s1.getData(); 
} 
}