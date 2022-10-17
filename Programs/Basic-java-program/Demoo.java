class Students {
    String name;
    int age;
    String rollNum;
    Students(){
 System.out.println( "Default Constructer");
 name="Zobiya";
       System.out.println( name);
        age=22;
 System.out.println( age);
        rollNum = "21sw140";
 System.out.println( rollNum);
    }
   Students(String n, int a, String r){
 System.out.println( "Argunment Constructer");
        name=n;
        age=a;
        rollNum=r;
       //System.out.println(name);
 System.out.println( age);
 System.out.println( rollNum);
    }
Students(Students s){
 System.out.println( "In constructer we pass the Constructer as argunment ");
 this.name=s.name;
 System.out.println( this.name);
this.rollNum=s.rollNum;
Stdudents duplicateStudent(Students s){
return this;}
}
  public   class Demoo{

  public static void main(String args []){
        Students d1,d2,d3,d4;
        d1=new Students();

        d2=new Students("dua",12,"88");
System.out.println(d2.name);
d3=new Students(d2);

d4=new Students(d1.duplicateStudent);

  }
}