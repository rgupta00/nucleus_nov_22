class Dog{
	
	private String color;
	
	Dog(String dogColor){
		color=dogColor;
	}
	
	public void printDogValues() {
		System.out.println("dog color is : "+ color);
	}
}

public class DemoArrayOfObjects {
	
	public static void main(String[] args) {
		
		Dog[]dogs=new Dog[4];
		dogs[0]=new Dog("black");
		
		
		dogs[1]=new Dog("white");
		dogs[2]=new Dog("black");
		dogs[3]=new Dog("brown");
		//dogs[4]=new Dog("black");
		
		for(Dog dog: dogs) {
			dog.printDogValues();
		}
		
	}

}



