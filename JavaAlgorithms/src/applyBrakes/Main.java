package applyBrakes;



import java.util.*;

public class Main{
    
    public static void applyBrakes(int distance, int time){
        int speed = distance/time;
        
        if(speed>40){
            System.out.print("Apply Brake");
        }
        else System.out.print("Keep Going");
    }
    public static void main(String[] args){
    	
        try (Scanner input = new Scanner(System.in)) {
        	System.out.println("Enter distance");
			int distance = input.nextInt();
			System.out.println("Enter time");
			int time = input.nextInt();
			
			applyBrakes(distance, time);
		}
    }
}
