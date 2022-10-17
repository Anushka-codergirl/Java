class Student {
    String name;
    int section;
    String rollnum;
    Student(){
        name="Zobiya jumani";
        System.out.println(" Name is: " + name);
        section= 01;
        System.out.println("section is :" + section);
        rollnum = "21sw140";  System.out.println("RollNUmber is :" +  rollnum);   }
// we also make overloading Constructor which is have no return type
     Student(String n, int s, String rollnu){
        name=n;
        section=s;
        rollnum=rollnu;
         System.out.println("Overloading Constructor is Called");
         System.out.println(" Name is: " + name);
         System.out.println("section is :" + section);
         System.out.println("RollNUmber is :" +  rollnum);

     }
}
public class Demo4{
        public static void main(String args[]){
            Student s1=new Student();
            System.out.println(" ");
            Student s2=new Student("Sawera",01,"21sw129");
        }
    }

