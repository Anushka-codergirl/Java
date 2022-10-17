class Google{
String firstName;
String middleName;
String lastName;

void setName(String f) { firstName=f;}


void setName(String f, String m) { firstName=f; middleName=m; }

void setName(String f, String m, String l) { firstName=f; middleName=m;lastName=l; }

String getName() 
{ return firstName + middleName + lastName;}

public static void main(String args[]){
Google n1;
n1 = new Google();
n1.setName("Irshad", "Ahmed", "Jumani");
n1.getName();
}
}

