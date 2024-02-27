package asdas;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is Cat's name?");
		String catName = scan.nextLine();
		System.out.println("What is Dog's name?");
		String dogName = scan.nextLine();
		
		Cat cat1 = new Cat(catName);
		Dog dog1 = new Dog(dogName);
		
		System.out.println(cat1.name + " is meowed");
		System.out.println(dog1.name + " is barked");
		
		System.out.println();
		
		for (int round = 0; round < 1000; round++) {
			System.out.println("Round " + (round + 1));
			
			cat1.xposition = (int)(Math.random()*101);
			cat1.yposition = (int)(Math.random()*101);
			dog1.xposition = (int)(Math.random()*101);
			dog1.yposition = (int)(Math.random()*101);
			System.out.println(cat1.name + "'s position is (" + cat1.xposition + ", " + cat1.yposition + ")");
			System.out.println(dog1.name + "'s position is (" + dog1.xposition + ", " + dog1.yposition + ")");
			
			int xdistance = Math.abs(cat1.xposition - dog1.xposition);
			int ydistance = Math.abs(cat1.yposition - dog1.yposition);
			double distance = Math.sqrt(Math.pow(xdistance, 2) + Math.pow(ydistance, 2));
			if (distance <= 5) {
				System.out.println(cat1.name + " and " + dog1.name + " are fighting now.");
			}
			if ((cat1.xposition == 50 && cat1.yposition == 50) && (dog1.xposition == 50 && dog1.yposition == 50)) {
				System.out.println("Game is over.");
				break;
			}
			System.out.println();
		}
	}
}
