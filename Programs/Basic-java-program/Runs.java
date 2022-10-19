class Student{
    private String name;
    private int age;
    private int section;
    private  String rollNumber;
    private String department;

    public  void setName(String name){ this.name=name;}
    public  void setAge(int age){ this.age=age;}
    public void setSection(int section){ this.section=section;}
    public  void setRollNumber(String rollNumber) {
        this.rollNumber=rollNumber;
    }
    public void  setDepartment(String department){ this.department=department;}

    public String getName(){ return  name;}
    public  int getAge() { return  age;}
    public int getSection() { return section;}
    public  String getRollNumber() { return rollNumber;}
    public String getDepartment() { return  department;}

    Student( String name ,int age, int section, String rollNumber, String department) {
        System.out.println("Parameterizez constructor called ");
       // System.out.print(" Name is : " );
      //  System.out.println( this.name = name);
 this.name = name;
        //System.out.print(" Age is : " );
      //  System.out.println(this.age = age);
this.age = age;
       // System.out.print(" Section is : " );
        //System.out.println(this.section = section);
this.section = section;
      //  System.out.print(" Roll number is : " );
       // System.out.println(this.rollNumber = rollNumber);
this.rollNumber = rollNumber;
       // System.out.print(" Department  is : " );
      //  System.out.println(this.department = department);
this.department = department;
    }
    public class Runs{

    }
    public static void main(String[] args) {
        Student str =new Student("Zobiya", 20, 01, "21sw140,","Software");

  System.out.println(" Name is : " +str.getName());
        System.out.println(" Age is : " +str.getAge());
        System.out.println(" Section  is : " +str.getSection());
        System.out.println(" RollNumber is : " +str.getRollNumber());
        System.out.println(" Depatment  is : " +str.getDepartment());

 System.out.println(" ");

str.setName("Yusra");
str.setAge(19);
str.setSection(01);
str.setRollNumber("21sw034");
str.setDepartment("Software");

 System.out.println(" Name is : " +str.getName());
        System.out.println(" Age is : " +str.getAge());
        System.out.println(" Section  is : " +str.getSection());
        System.out.println(" RollNumber is : " +str.getRollNumber());
        System.out.println(" Depatment  is : " +str.getDepartment());

       
       
    }
}