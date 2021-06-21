/*
2. Assign and print the roll number, phone number and address of two students having names "Sam"
and "John" respectively by creating two objects of class 'Student'.
*/


class student{
String name;
int roll_no;
String add;
long ph_no;	

student (String name, long ph_no, int roll_no, String add)
{
	this.name= name;
	this.roll_no= roll_no;
	this.add= add;
	this.ph_no= ph_no;
	System.out.println(name +" "+  roll_no+ " " + add + " " + ph_no+ " " );	
}
}
class clsobj2{
	public static void main (String [] args){
		
student s1= new student ("sam", 99889989 , 21 , "badlapur");
student s2= new student("John" , 615848664 , 98 , "kalyan ");

		
}}
