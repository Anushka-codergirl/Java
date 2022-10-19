class Employee{
    private String eName;
    private  String eDepartment;
    private  double ePhonenNum;

    public void setEName(String eName){ this.eName=eName;}
     public void seteDepartment (String eDepartment){ this.eDepartment=eDepartment;}
     public void  setePhonenNum(double ePhonenNum){ this.ePhonenNum=ePhonenNum;}

     public String geteName(){ return eName;}
     public String geteDepartment(){ return  eDepartment;}
     public double getePhonenNum(){ return ePhonenNum;}

     public static void main(String args []){
        Employee obj = new Employee();
        obj.setEName("Mubeen");
        obj.seteDepartment("Berozgar");
        obj.setePhonenNum(9234567891d);

System.out.println(obj.geteName());
         System.out.println(obj.geteDepartment());
         System.out.println(obj.getePhonenNum());
     }
 }