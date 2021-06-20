import java.util.*;

class student1{

int student_id;
String student_name;
char batch;

void student_info(int a, String b, char c)
{
this.student_id= a;
this.student_name=b;
this.batch=c;
}

void studentinfo_print()
{
System.out.println(student_id+ " "+ student_name+" "+batch + " ");
}
}

class student {

public static void main (String [] args ){

student1 st= new student1();
st.student_info(123,"shreepad",'A');
st.studentinfo_print();

student1 st1= new student1();
st1.student_info(2560,"sarang",'B');
st1.studentinfo_print();


}}
