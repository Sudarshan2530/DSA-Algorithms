package weekDays;

import java.util.*;

public class Main{
    public static void weekDay(int num){
        
        switch(num){
            case 1: System.out.print("Monday");
            break;
            case 2: System.out.print("Tuesday");
            break;
            case 3: System.out.print("Wednesday");
            break;
            case 4: System.out.print("Thursday");
            break;
            case 5: System.out.print("Friday");
            break;
            case 6: System.out.print("Saturday");
            break;
            case 7: System.out.print("Sunday");
        }
        
    }
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
        	System.out.println("Enter Number");
			int num = input.nextInt();
			
			weekDay(num);
		}
    }
}