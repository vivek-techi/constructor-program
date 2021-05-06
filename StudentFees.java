package vive;


public class StudentFees {
String studentname;
int rollnumber;
int Class;
String section;
String schoolname;
boolean result;
public StudentFees(String studentname,int rollnumber,int Class,String section, String schoolname,boolean result) {
this.studentname=studentname;
this.rollnumber=rollnumber;
this.Class=Class;
this.section=section;
this.schoolname=schoolname;
this.result=result;
}
 public void displaydata() {
System.out.println("the student name is:"+studentname);
System.out.println(" roll  number is:"+rollnumber);
System.out.println(" class is:"+Class);
System.out.println("section is:"+section);
System.out.println("the school name is:"+schoolname);
System.out.println("the result is:"+result);
}
 public void displayprofileof(String studentName) {
if(studentName==this.studentname) {
System.out.println("need student name is:"+studentname);
System.out.println("need roll  number is:"+rollnumber);
System.out.println(" new class is:"+Class);
System.out.println(" newsection is:"+section);
System.out.println("the new school name is:"+schoolname);
}else {
System.out.println("user not found");
}
 }
public boolean ispass()
{
if(this.result) {
return true;
}
else
{
return false;}
}
public static void main(String[] args) {
// TODO Auto-generated method stub
StudentFees s1= new StudentFees("raj",1,12,"c","selvam",true);
s1.displaydata();
s1.displayprofileof("ramesh");
System.out.println("is student pass:"+s1.ispass());
StudentFees s2= new StudentFees("kumar",3,10,"d","mechnet",false);
s2.displaydata();
s2.displayprofileof("kumar");
System.out.println("is student pass:"+s2.ispass());


}

}



