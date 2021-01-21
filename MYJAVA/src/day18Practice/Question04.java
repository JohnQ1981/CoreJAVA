package day18Practice;

public class Question04 {

	public static void main(String[] args) {

		int numbofbananas = 165 ,survivalDays=1;
				//boolean monkeyAlive = true;
				
		
				
				for(int i =165; i>4; i=i-4) {
					System.out.println("Monkeys eat 4 bananas everyday ");
					numbofbananas -= 4;
					System.out.println("number of Bananas left "+ numbofbananas);
					survivalDays++;
					if(numbofbananas<4) {
						
						System.out.println("Today is day "+ survivalDays + "and there is no more bananas so it has died");
					}
					else if(numbofbananas>4) {
						
						System.out.println("Still Alive, day is : "+ survivalDays);
					}
					
				}
				
				
				
				
		
			
			
			
			
				
		
		
		

	}

}
