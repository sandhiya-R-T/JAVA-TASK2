package OOPSinJava;

public class Person {

			
			private String name;
		    private int age;

		    
		    public Person() {
		        this.age = 18; 
		    }

		    
		    public Person(String name, int age) {
		        this.name = name;
		        this.age = age;
		    }

		    
		    public void displayDetails() {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		    }

		    
		    public static void main(String[] args) {
		       
		        Person person1 = new Person("Bhuvana", 52);
		        System.out.println("Person 1:");
		        person1.displayDetails();

		        
		        Person person2 = new Person("Sandhiya", 25);
		        System.out.println("\nPerson 2:");
		        person2.displayDetails();
		    }
		


	}


