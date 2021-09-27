package day2;

class Animal {
	
	public void eat () {
		System.out.println("Animal is eating");
	}
	
}

class Dog extends Animal {
	
	public void eat() {
		System.out.println("Dog is eating");
	}
}

public class UpcastingDemo {

	public static void main(String[] args) {
		
		Dog d = new Dog(); // Static binding 
			
		// Upcasting
		
		Animal a = new Dog();
		a.eat();
		
		//Downcasting
		
		//Dog d1 = new Animal(); this is not possible
		
		Dog d1=(Dog) new Animal();
		
		
	}

}
