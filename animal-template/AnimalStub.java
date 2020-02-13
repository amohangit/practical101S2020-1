import java.util.Scanner;
public class AnimalStub{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Animals obj;
		System.out.println("Welcome to the Animal Sounds App ...");
		System.out.println("--------------------------------------");
		System.out.println("Enter 1 for Cat");
		System.out.println("Enter 2 for Dog");
		System.out.println("Enter 3 for Horse");
		System.out.println("Enter 4 for Lion");
		System.out.println("--------------------------------------");
		while(true){
			/*
			Prompt the user for the input and create an object
			based on it and call the make sound() method. 
			*/

			System.out.println("Do you want to repeat? y/n");
			char repeat = scan.next().charAt(0);
			repeat = Character.toLowerCase(repeat);
			if (repeat == 'n')
				break;
			else
				continue;
		}

		

	}
}