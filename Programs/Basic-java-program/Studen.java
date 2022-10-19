class Studen{

String name;
int age;
String rollNum;

Studen( ) { name="ABC";
age=000;
rollNum="00000";
}
Studen(String n, int a, String r){
name=n;
age=a;
rollNum=r;
}

Studen(Studen s){
this.name =s.name;
this.age = s.age;
this.rollNum=s.rollNum;
}


 public static void main(String args []){

Studen s1,s2, s3;
s1 = new Studen();

s2 = new Studen( "Zobiya", 123, "21sw140");
s3 = new Studen(s2);


}
}

