package selfreview;

public abstract class Animal {
	//cannot declare abstract static
	abstract void testClassMethod();
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal.");
	}
}
class Cat extends Animal {
	//static not allowed
	public void testClassMethod() {
		System.out.println("The class method in Cat.");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat.");
	}
	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		//can't call from Animal
		myAnimal.testClassMethod(); //classmethod in cat
		myAnimal.testInstanceMethod(); //instancemethod in cat
	}
}
