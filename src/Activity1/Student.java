package Activity1;

public class Student extends Client {
String course;
 void insertstudentdetails(String course)
 {

	 this.course=course;
	;
 }
	
void displaystudentdetails()
{
	System.out.println("Student's first name is :" +firstname);
	System.out.println("Student's last name is " +lastname);
	System.out.println("Student's age is " +age);
	System.out.println("Applied course is " +course);
	System.out.println("Student id is :" +id);
}
}
