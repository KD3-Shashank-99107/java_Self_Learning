package Question3;

class Animal{
	private String name;
	private int age;
	
	public Animal(){
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	 public void eat() {
	        System.out.println(name + " is eating.");
	    }
	 
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
}

class Lion extends Animal{
	Lion(String name, int age){
		super(name, age);
	}
	
	public void roar() {
        System.out.println("Lion is roaring.");
    }
	
}

class Address{
	private String city;
	private String state;
	
	Address(){
		
	}
	
	Address(String city, String state){
		this.city = city;
		this.state = state;
	}
	
	public void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

public class zoo {
	 private String name;

	    // Composition
	    private Address address;

	    // Composition
	    private Animal animal;

	    public  zoo(String name, String city, String state,
	               String animalName, int animalAge) {

	        this.name = name;

	        this.address = new Address(city, state);

	        this.animal = new Animal(animalName, animalAge);
	    }

	    public void displayZoo() {
	        System.out.println("Zoo Name: " + name);

	        System.out.println("\nZoo Address:");
	        address.displayAddress();

	        System.out.println("\nAnimal:");
	        animal.display();
	    }
	    
	    public static void main(String[] args) {
	    	 zoo zoo = new zoo(
	    	            "Green Valley Zoo",
	    	            "Pune",
	    	            "Maharashtra",
	    	            "Tiger",
	    	            5
	    	        );
	    	 
	    	 
	    	 System.out.println("Has A Relation");
	    	 zoo.displayZoo();
	    	 
	    	 System.out.println();
	    	 System.out.println("Is a relation");

	         Lion lion = new Lion("Simba", 4);

	         lion.display();
	         lion.eat();
	         lion.roar();
	    }
}
