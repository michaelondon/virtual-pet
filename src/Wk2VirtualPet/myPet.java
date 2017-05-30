package Wk2VirtualPet;
 
public class myPet {
	
// Define how he is doing
		int hungry=50;
		int thirst=70;
		int boredom=40;
 
// Users input action
 void feed(){
	 hungry=hungry+5;
	 thirst=thirst+1;
	 boredom=boredom-5;
	 System.out.println("Great you fed Shiva, but she's still thirsty and wants to play");
 }		
 	
 void water(){
 		hungry=hungry+2;
 		thirst=thirst+5;
 		boredom=boredom-8;
 		System.out.println("Shiva really enjoyed the water, but she's still wants to play.");
 }
 void played(){
 	 	hungry=hungry-10;
 	 	thirst=thirst-15;
 	 	boredom=boredom+5;
 	 	System.out.println("I hope Shiva didn't try you out, I'm sure she's thirsty now.");
 
 }
 
 void nothing(){
 	 	 hungry=hungry-5;
 	 	 thirst=thirst-5;
 	 	 boredom=boredom-5;
  		System.out.println("Not a go idea.");
 
 		 }
		// Passage of time
		void tick(){
			hungry=hungry+3;
			thirst=thirst+5;
			boredom=boredom-2;
			
			
		}
 
 
}

