package chap10.examples.sec100204;

public class ClassCastExceptionExample {
	static class Animal{}
	static class Dog extends Animal{}
	static class Cat extends Animal{}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat =  new Cat();
		changeDog(cat);
		
	}

	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
		
	}
	
	

}
