
class apple {
	int apple1;
	int mango1; 
	 int fruit1;
	
}
	class mango extends apple {
		
	}
	
	class fruit extends mango{
		
		void summer(int a, int b){
			 super.apple1=a;
			super.mango1= b;
			int c= apple1+mango1;
			System.out.println(c);
		}
	}
class manfru{
	public static void main (String [] args){
		
		fruit obj= new fruit();
		obj.summer(15,15);
		
		
}}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		