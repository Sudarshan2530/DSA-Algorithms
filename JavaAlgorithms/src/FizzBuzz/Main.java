package FizzBuzz;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter test cases");
	        int T = input.nextInt();
	         int num = 0;
	         System.out.println("Enter number");
	            for(int i = 0; i <T; i++){
	                 num = input.nextInt();
	                
	                for(int j = 1; j <= num; j++){
	                    if(j%3 == 0 && j%5 == 0){
	                      
	                        System.out.println("FizzBuzz");
	                    }
	                    else if(j % 3 == 0)
	                   {
	                       System.out.println("Fizz");
	                 }
	                 else if(j % 5 == 0){
	                  System.out.println("Buzz");
	                }
	               else{
	                System.out.println(j);
	              }
	                    
	            }
	                
	            }

	}

}
