import java. util.Scanner;
	
	public class sixth_6{
		
		public static void main(String[] args){
			
			Scanner Input= new Scanner(System.in);
			
			System.out.println("input first number ");
			int num1= Input.nextInt();
			System.out.println("input second number");
			int num2= Input.nextInt();
			int num3=num1+num2;
			System.out.println("addition is "+num3);
			int num4=num1-num2;
			System.out.println("substract is "+num4);
			int num5=num1*num2;
		System.out.println("multiple is "+num5);
			int num6= num1/num2;
			System.out.println("division is "+num6);
			int num7=num1%num2;
			System.out.println("mod is "+num7);