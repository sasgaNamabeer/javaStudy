package laterMiddle;

//
//abstract class Animal{
//	String name;
//	int age;
//	
//	abstract public void speak();
//	abstract public void walk();
//}
//class Animal2 extends Animal {    
//	String name;     
//	String color;   
//	
//	public void speak() {System.out.println("Animal2 speak");}
//	public void walk() {System.out.println("Animal2 walk");}
//} 
//public class hjh181031 {
//	public static void main(String[] args) {
//		Animal myAnimal;
//		Animal2 myAnimal2 = new Animal2();
//		
////		myAnimal.speak();
////		myAnimal.walk();
//		myAnimal2.speak();
//		myAnimal2.walk();
//		
//		myAnimal = myAnimal2;	//upCasting
//		myAnimal.speak();
//		myAnimal.walk();
//		myAnimal2.speak();
//		myAnimal2.walk();
//		
//		
//}}

//
//
//abstract class Animal{
//	String name;
//	int age;
//	
//	abstract public void speak();
//	abstract public void walk();
//}
//class Animal2 extends Animal {    
//	String name;     
//	String color;   
//	
//	public void speak() {System.out.println("Animal2 speak");}
//	public void walk() {System.out.println("Animal2 walk");}
//} 
//class Animal3 extends Animal{
//	public void speak() {System.out.println("Animal3 speak");}
//	public void walk() {System.out.println("Animal3 walk");}
//}
//public class hjh181031 {
//	public static void main(String[] args) {
//		Animal myAnimal;
//		Animal2 myAnimal2 = new Animal2();
//		Animal3 myAnimal3 = new Animal3();
////		myAnimal.speak();
////		myAnimal.walk();
//		myAnimal2.speak();
//		myAnimal2.walk();
//		
//		myAnimal = myAnimal2;	//upCasting
//		myAnimal.speak();
//		myAnimal.walk();
//		myAnimal2.speak();
//		myAnimal2.walk();
//		
//		myAnimal = myAnimal3;
//		myAnimal.speak();
//		myAnimal.walk();
//		myAnimal3.speak();
//		myAnimal3.walk();
//		
//		
//		
//}}


interface Fun{
	public static final int YEAR = 2019;
	abstract public void speak();
}
interface Fun2 extends Fun{
	abstract public void walk();
}
interface Fun3 extends Fun2{
	abstract public void dance();
}
class Animal{
	String name;
	int age;
	
}
class Animal2 extends Animal implements Fun3{   
	String color;   
	
	public void speak() {System.out.println(this.name + " is speak" + YEAR);}
	public void walk() {System.out.println(this.name + " is walk" + this.color);}
	public void dance() {System.out.println(this.name + " is dance" + YEAR);}
} 
public class hjh181031 {
	public static void main(String[] args) {
		Animal2 call = new Animal2();
		call.name = "kitty";
		call.age = 3;
		call.color = "white";
		call.speak();		
		
		Fun f = new Animal2();
		f.speak();
//		f.walk();		//���ٿ���
//		f.dance();
		
		Fun3 f3 = new Animal2();
		f3.speak();
		f3.walk();
		f3.dance();
}}
 