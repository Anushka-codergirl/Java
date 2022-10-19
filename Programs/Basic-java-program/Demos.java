class Students{

String name;
int age;
String rollNum;

Students( ) { name="ABC";
age=000;
rollNum="00000";
}
Students(String n, int a, String r){
name=n;
age=a;
rollNum=r;
}

Students(Students s){
this.name=s.name;
this.age=s.age;
this.rollNum=s.rollNum;
}

public static void main(String args []){

Students s1,s2,s3,s4,s5;
s1 = new Students();

System.out.print(s1.Students());

s2 = new Students();

System.out.println(s2.Students("Zobiya", 123, "21sw140"));
}
}

