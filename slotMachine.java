import java.util.Scanner;

class slotMachine {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Would you like to start a new game?");
			String y = sc.nextLine();
			
			if(y.equals("yes") || y.equals("Yes")){
				System.out.println("You're starting with a $100!");
				int c = 100;
				
				while(c>0){
					System.out.println("How much would you like to bet!");
					int b = sc.nextInt();
					
					if(b>c || b==0){
						System.out.println("Invalid");
					}
						else if(b<=c){
						c -= b;
						int num1 = (int)Math.floor(Math.random()*10);
						int num2 = (int)Math.floor(Math.random()*10);
						int num3 = (int)Math.floor(Math.random()*10);
						
						System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " | ");
						
						if(num1 == num2 && num1 == num3){
							b = b*3;
						}
						else if(num1 == num2 || num2 == num3 || num1 == num3 ){
							b = b*2;
						}
						else{
							b = 0;
						}
						}
						c=c+b;
						System.out.println("Money Currently: "+c+"$");
							
			        }
			
		    }
		}
	}
}


