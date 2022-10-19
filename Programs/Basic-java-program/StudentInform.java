 class StudentInform{

String name;
byte age;
char gender;
String rollNum;
String departmentName;
int section;

public void setAge(byte a)
{ age=a;}

 public void setName(String n)
{ name=n;}

  public void setGender(char  g)
{ gender=g;}
 public void setRollnum(String rn)
{ rollNum=rn;} 
public void setDepname(String d)
{ departmentName=d;}
 public void setsection(int s)
{ section=s;}

public String getname( ){ return name;}
 public byte getage( ) { return age;}
 public char getgender( ) { return gender;}
 public String getrollNum( ) { return rollNum; }
public  String getdepName( ) { return departmentName; }
public int getsection() { return section; }

 public void display( ){
System.out.print("Name is : " + name );
System.out.println( );

System.out.print("Age  is : " + age );
System.out.println( );

System.out.print("Gender  is : " + gender );
System.out.println( );

System.out.print("Roll number  is : " + rollNum);
System.out.println( );

System.out.print("Department is  : " + departmentName );
System.out.println( );

System.out.print("Section is  : " + section);
}


public static void main(String args []){
StudentInform Student1 ;
 Student1= new StudentInform( );
Student1.setName=("Zobiya");
}
}