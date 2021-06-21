class Ani{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Ani{  
void eat(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void eat(){System.out.println("weeping...");}  
}  
class Animal{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
    
d.eat();  
}} 