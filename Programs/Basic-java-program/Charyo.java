import java.util.ArrayList;
 class University {

    String uname;
    ArrayList<Students> studentsList = new ArrayList<Students>();
    ArrayList<Departments> deptList = new ArrayList<Departments>();

    // one argunment Constructer when we pass the name of student in return the object
    University(String uni, String[] snames, String[] dnames) {
        uname=uni;
// to find out number of names which are pass in this object we write for loop
        for (int i = 0; i < snames.length; i++) {
            studentsList.add(new Students(snames[i]));
        }
        for (int j = 0; j < dnames.length; j++) {
            deptList.add(new Departments(dnames[j]));
        }
    } // end of constructer

    // students class inside university class
    class Students {
        String snames;
        Departments dept;

        Students(String snames) {
            this.snames = snames;
        }

       void display() {
            System.out.print(" name of the student is : " + snames);

        }
    }

    class Departments {
        String dnames;
        ArrayList<Students>deptstudents = new ArrayList<Students>();

        Departments(String dnames) {
            this.dnames = dnames;
        }

        // display all the students name which are study in that department
        public void displayStudents() {
            for (int i = 0; i < deptstudents.size(); i++) {
                System.out.println(deptstudents.get(i).snames);

            }
        }
    } // end of departments class

    Departments getDepartments(String name) {
        for (int i = 0; i < deptList.size(); i++) {
            if (deptList.get(i).dnames.equals(name))
                return deptList.get(i);
        }
        return null;
    }

    Students getstudents(String name) {
        for (int j = 0; j < studentsList.size(); j++) {
            if (studentsList.get(j).snames.equals(name))
                return studentsList.get(j);
        }
        return null;
    }

    public void enrollIn(Departments d, Students s) {
        s.dept = d;
        d.deptstudents.add(s);
    }

    public void displayStudentsInDept(Departments d) {
        d.displayStudents();
    }

}
 // university class end here
   public class Charyo{
     public static void main(String[] args) {
        String [] snames={ "Ali","Mohsin","Ahsan","Muhsin","Zakir"};
        String [] dept= {"SW","CS"};
        University muet=new University("Mehran UET ",snames,dept);
          muet.enrollIn(muet.getDepartments("SW"),muet.getstudents("Ali") );
         muet.displayStudentsInDept(muet.getDepartments("SW"));
     }
 }
