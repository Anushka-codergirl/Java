import java.util.*;

class University{
    String uname;
    ArrayList<Students> studentList = new ArrayList<Students>();
    ArrayList <Departments> deptlist = new ArrayList<Departments>();

    University(String uname, String[] snames,String[] dnames){
        this.uname=uname;
        for (int i=0; i<snames.length; i++){
            studentList.add(new Students(snames[i]));
            deptlist.add(new Departments (dnames[i]));
        }
    }

    class Students{
        String snames;
        Departments dept;
        Students(String snames){
            this.snames=snames;
        }

        public void display(){
            System.out.println("Student name is : "+snames);
            System.out.println("Department is : "+ dept);
        }
    }  // end of students class

    class Departments{
        String dnames;
        ArrayList <Students> deptstudents = new ArrayList<Students>();
        Departments(String dnames){
            this.dnames=dnames;
        }

        public void displayStudents() {
            for (int i = 0; i < deptstudents.size(); i++) {
                System.out.println(deptstudents.get(i).snames);
            }
        }

    }

    Departments getDepartments(String name){
        for (int i=0; i<deptlist.size(); i++) {
            if (deptlist.get(i).dnames.equals(name))
                return deptlist.get(i);
        }
        return null;



}

    Students getStudents(String s) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).snames.equals(s))
                return studentList.get(i);
        }
        return null;
    }

    public void enrollIn(Departments d, Students s){
        s.dept=d;
        d.deptstudents.add(s);
    }

    public void displayStudentindept(Departments d){
        d.displayStudents();
    }
} // end of university class
public class Main4 {
    public static void main(String[] args){
        String[] snames={"ali","mohsin","ahsan","zakir","zobiya","yusra"};
        String[] dept={"SW","CS","TL"};

        University muet = new University("Mehran UET",snames,dept);
        muet.enrollIn(muet.getDepartments("SW"), muet.getStudents("mohsin") );
        muet.displayStudentindept(muet.getDepartments("SW"));
    }
}