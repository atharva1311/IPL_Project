package com.aj.client;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.aj.controller.IPL_Controller;
import com.aj.entity.Players;



public class IPL_Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IPL_Controller ic = new IPL_Controller();
		int choice;
		do {
			System.out.println("  ** Welcome to Our Website **   ");
			System.out.println();
			System.out.println("***** IPL Teams Management *****");
			System.out.println();
			System.out.println("1. View Teams");
			System.out.println("2. View Players");
			System.out.println("3. Add Player");
			System.out.println("4. Remove Player");
			System.out.println("5. View Player Statistics");
			System.out.println("6. View Best Batsmen");
			System.out.println("7. View Best Bowlers");
			System.out.println("8. View Indian players of specific team");
			System.out.println("9. View Other country players of specific team");
			System.out.println("10. Exit");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt()	;
			sc.nextLine();
			switch(choice)
			{
			case 1:
				Set<String>s1=ic.allTeamsService();
//				System.out.println(s1);
				System.out.println(" ---------------");
		        System.out.printf("| %-12s |\n", "Name of Teams");
		        System.out.println(" --------------");
				
				for(String name:s1)
				{
					System.out.printf("| %-12s |\n", name);
				}
				
				System.out.println(" ---------------");
				System.out.println();
				break;
			case 2:
				Set<String> s2=ic.playersofTeamController(sc);
//				System.out.println(s2);
				System.out.println(" ----------------------");
		        System.out.printf("| %-20s |\n", "Name of Players");
		        System.out.println(" ----------------------");
				
				for(String name:s2)
				{
					System.out.printf("| %-20s |\n", name);
				}
				
				System.out.println(" ----------------------");
				System.out.println();
				break;
			case 3:
				ic.addPlayerController(sc);
				System.out.println();
				break;
			case 4:
				ic.removePlayerController(sc);
				System.out.println();
				break;
			case 5:
				Players p1=ic.playersStatsController(sc);
//				System.out.println(p1);
				System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("| %-20s | %-9s | %-12s | %-20s | %-5s | %-14s | %-12s | %-15s |\n", "Name", "Jersy No.", "Nationality","Specialization","Debut","Total matches","Total runs","Total wickets");
		        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		        System.out.printf("| %-20s | %-9s | %-12s | %-20s | %-5s | %-14s | %-12s | %-15s |\n", p1.getName(), p1.getJersy_no(), p1.getNationality(),p1.getSpecialization(),p1.getDebut(),p1.getMatches(),p1.getTotal_runs(),p1.getTotal_wickets());
		        System.out.println(" ----------------------------------------------------------------------------------------------------------------------------------");
				System.out.println();
				break;
			case 6:
				Set<String> s3=ic.bestBatsmenController();
//				System.out.println(s3);
				System.out.println(" ----------------------");
		        System.out.printf("| %-20s |\n", "Players");
		        System.out.println(" ----------------------");
				
				for(String name:s3)
				{
					System.out.printf("| %-20s |\n", name);
				}
				
				System.out.println(" ----------------------");
				System.out.println();
				break;
			case 7:
				Set<String> s4=ic.bestBowlersController();
//				System.out.println(s4);
				System.out.println(" --------------------------------");
		        System.out.printf("| %-30s |\n", "Players");
		        System.out.println(" --------------------------------");
				
				for(String name:s4)
				{
					System.out.printf("| %-30s |\n", name);
				}
				
				System.out.println(" --------------------------------");
				System.out.println();
				break;
			case 8:
				List<String> l1 =ic.allIndiansPlayersController(sc);
//				System.out.println(l1);
				System.out.println(" ----------------------");
		        System.out.printf("| %-20s |\n", "Name of Players");
		        System.out.println(" ----------------------");
				
				for(String name:l1)
				{
					System.out.printf("| %-20s |\n", name);
				}
				
				System.out.println(" ----------------------");
				System.out.println();
				break;
			case 9:
				List<String> l2 =ic.allOtherPlayersController(sc);
//				System.out.println(l2);
				System.out.println(" ----------------------");
		        System.out.printf("| %-20s |\n", "Name of Players");
		        System.out.println(" ----------------------");
				
				for(String name:l2)
				{
					System.out.printf("| %-20s |\n", name);
				}
				
				System.out.println(" ----------------------");
				System.out.println();
				break;
			case 10:
				System.out.println("Thank You for visiting our site..!");
				System.out.println();

				return;
			default:
			System.out.println("Invalid choice. Try again..!");
				
			}
			
			if(choice == 10)
			{
				break;
			}
			
		}
		while(true);
	}
}
