/*
 * Class: CMSC203 
 * Instructor: 
 * Description: (Assignment 1
 * Due: 02/06/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Adoni Agbogbe__________
*/


import java.util.Scanner;

public class WifiDiagnosis {
public static void main (String [] args) {
	
	
	System.out.println ("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
	System.out.println ("Reboot the computer and try to connect");
	System.out.println ("Did that fix the problem?(Yes or No)");
	Scanner input;
	input = new Scanner(System.in) ;
	String answer = input.next();
	

	if (answer.equalsIgnoreCase("yes")) 
	{
		System.out.println ("Done");
		System.out.println ("Programmer: Adoni Agbogbe");
	
	}
	else if (answer.equalsIgnoreCase("no"))
		{
			
			System.out.println ("Reboot the router and try to connect");
			System.out.println ("Did that fix the problem? (Yes or No)");
			answer = input.next();
		
			
				if (answer.equalsIgnoreCase("yes")) 
				{
					System.out.println ("Done");
					System.out.println ("Programmer: Adoni Agbogbe");
				
				}
		
					else if (answer.equalsIgnoreCase("no"))
					{
				
						System.out.println ("Make sure the cableconnesting the router are firmly plugged in and power is getting to the router");
						System.out.println ("Did that fix the problem? (Yes or No)");
						answer = input.next();
							if (answer.equalsIgnoreCase("yes")) 
								{
									System.out.println ("Done");
									System.out.println ("Programmer: Adoni Agbogbe");
								}
								
										else if (answer.equalsIgnoreCase("no")) 
										{
											System.out.println ("Move the computer closer to the router and try to connect");
											System.out.println ("Did that fix the problem? (Yes or No)");
											answer = input.next();
				
												 if (answer.equalsIgnoreCase("yes")) 
													{
														System.out.println ("Done");
														System.out.println ("Programmer: Adoni Agbogbe");
													}
												
															else if (answer.equalsIgnoreCase("no")) {
																System.out.println ("Contact your ISP");
																System.out.println ("Done");
																System.out.println ("Programmer: Adoni Agbogbe");
					
																	 if (answer.equalsIgnoreCase("OK")) 
																		{
																		 System.out.println ("Invalid answer; try again");
																		 System.out.println ("Programmer: Adoni Agbogbe");
																		}
							
																				
																		}
															}
													}
					}
}
}

				

		
			
						


	

