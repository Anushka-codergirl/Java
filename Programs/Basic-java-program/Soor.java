import java.util.ArrayList;


public class University{
 
String uname;

ArrayList <Students> studentList = new ArrayList <Students>( );
ArrayList <Departments> deptList = new ArrayList <Departments>( );

// and we have to initialized the Studentlist and arraylist so one thing is that we pass the array list in main that is the way we intialized the student and dept list
University(String univ, String[] snames, String[] dnames{

uname=univ;

// For loop to find out number of names which are pass in this object means how many
for(int i=0; i<snames.length; i++)
//we call the constructer of students class
studentList.add(new Students (snames [i]));

for(int i=0; i<dnames.length; i++){
deptList.add(new Departments (dnames [i]));

}
// end of Constructer



class Students{

String sname;
// Students are in which departments that why we have to creat the object of department
// students is only in one department but in department there are many students so we have to make arrayList.
Departments dept;

Students(String sname){ this.sname=sname;
System.out.println(" Name is : " + sname);

}

  } 
// end of student class 

class Departments{

String dname;
ArrayList <Students> deptstudents = new ArrayList <Students> ( );
Departments(String dname) { this.dname=dname;}


// we make now method  in which print the students name that study in which department 
void displayStudents(){
for(int i=0; i<deptstudents.size(); i++)
System.out.print(deptstudents.get(i).sname);
}
}
// end class Department

Departments getDepartments(String name){
for(int i=0; i<deptList.size(); i++){
if(deptlist.get(i).dname.equals(name)){
return deptList.get(i);
   }


else {
null;
}
}
}
Students getStudents(String kame){
for(int i=0; i<studentList.size(); i++){
if(studentlist.get(i).sanmes.equals (kame)){
return studentList.get(i);
}

else
 {
null;

}
}
}

// relation is students and department 
public void enrollIn(Departments d, Students s){
s.dept=d;
d.deptstudents.add(s);
}

public void displayStudentsIndept(Departments d )
{
d.displaystudents();
}
}
class Soor{
public static void main(String args [])

String[] snames={"zobiya", "sadaf","dua"};

String[] dept={"sw", "cs", "tl"};
University muet=new University ("mehran UET", sname, dept);

muet.enrollIn(muet.getDepartment("SW"),muet.getStudents("Ali"));
muet.enrollIn(muet.getDepartment("SW"),muet.getStudents("zobiya"));
muet.displayStudentsIndept(muet.getDepartment("SW"));
}
}





