		import java.util.*;

		class student2{
		Scanner sc= new Scanner (System.in);

		String name;
		char batch;
		int roll_num;

		void student_info()
		{
		System.out.println("name");
	     name= sc.next();

		System.out.println("batch");
		batch= sc.next().charAt(0);

		System.out.println("roll num");
		roll_num= sc.nextInt();
		}

		void studentinfo_print()
		{
		System.out.println(name+ " "+ batch +" "+roll_num + " ");
		}
		}

		class student1 {

		public static void main (String [] args ){

		student2 st= new student2();
		st.student_info();
		st.studentinfo_print();

		student2 st2= new student2();
		st2.student_info();
		st2.studentinfo_print();


}}

