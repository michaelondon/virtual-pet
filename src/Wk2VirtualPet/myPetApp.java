package Wk2VirtualPet;
 
import java.util.Scanner;
 
public class myPetApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		myPet Shiva=new myPet();
do{
// Start Status of my pet	
	System.out.println("This is my pet tiger Shiva #TWD");
	System.out.println("Currently Shiva's hunger level is at "+ Shiva.hungry); 		
	System.out.println("Currently Shiva's thirst level is at "+ Shiva.thirst);
	System.out.println("Currently Shiva's boredom level is at "+ Shiva.boredom);
		
 
// What do you want to do
		System.out.println("\nHow would you like to interact with Shiva?");
		System.out.println("Enter 1 To feed Shiva ");
		System.out.println("Enter 2 To water Shiva");
		System.out.println("Enter 3 To play with Shiva");
		String interact=input.nextLine();
		System.out.println();
		
			  switch (interact){
		  case"1":
			  Shiva.feed();
			  writeline("You just feed Shiva.");
			  break;
					  
		  case"2":
			  Shiva.water();
			  writeline("You just gave Shiva water.");
			  break;
		  case"3":
			  Shiva.played();
			  writeline("Shiva loves playtime.");
			  break;
		  case"4":
			  Shiva.nothing();
			  writeline("Sometime she just likes being alone.");
			  break;
		  }
				
			Shiva.tick();	 
}
while (Shiva.hungry>0 && Shiva.thirst>0 && Shiva.boredom>0);
 
// Dead message
	if (Shiva.hungry>0){
		System.out.println("Shiva died of hunger");}
	
	else if (Shiva.thirst>0){
		System.out.println("Shiva died of thirst");
	
	}else if (Shiva.hungry>0){
		System.out.println("Shiva died of pure boredom");}
	
}
	private static void writeline(String string) {
	
		
	}
	}
