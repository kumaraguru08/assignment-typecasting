package typeCasting;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		String inputvalue = "";
		Boolean canclose = true;
		while(canclose) {
			 try 
		        { 
				 	System.out.print(System.lineSeparator()+"Enter an integer value : ");
				 	
					Scanner scan = new Scanner(System.in);
				 	inputvalue =scan.nextLine();
				 	int input = Integer.parseInt(inputvalue); 
		            
					Cast objref = new Cast();
					objref.convertToAllDataTypes(input);
					objref.printAllValues();
					
					scan.close();
					
					canclose = false; 
		        }  
		        catch (NumberFormatException e)  
		        { 
		            System.out.println(inputvalue + " is not a valid integer number"); 
		        } 
		}
		
		
	}

}
