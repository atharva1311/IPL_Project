package com.aj.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.aj.dao.IPL_dao;
import com.aj.entity.Players;

public class IPL_Service {
	static IPL_dao id = new IPL_dao();
	static Map<String, List<Players>> allTeamsservice = id.allteams();
	static Set<String> allTeamsName = allTeamsservice.keySet();
	
	//All team names
	public Set<String> allTeamsService()
	{
		return allTeamsName;
	}
	
	//Palyers of team
	public Set<String> playersofTeamService(Scanner sc)
	{
		System.out.println("Enter team name: ");
		String team=sc.nextLine();
		Set<String> playersofteam=new HashSet<String>();
		for(Players name:allTeamsservice.get(team))
		{
			playersofteam.add(name.getName());
		}
		return playersofteam;	
	}
//	
//	public List<Players> playersofteamService(String team)
//	{
//		List<Players> playersofteam = new ArrayList<Players> ();
//		
//	}
	
	//Players statastics
	
	public Players playersStatsService(Scanner sc)
	{
		System.out.println("Enter player name: ");
		String name=sc.nextLine();
		Players p1=new Players();
		for(String team:allTeamsName)
		{
			for(Players player:allTeamsservice.get(team))
			{
				if(player.getName().equals(name))
				{
					p1=player;
					break;			
				}
			}
		}
		return p1;
	}
	
	//Best Batsmen
	
	public Set<String> bestBatsmenService()
	{
		Set<String> bestbatters=new HashSet<String>();
		for(String team:allTeamsName)
		{
			for(Players player:allTeamsservice.get(team))
			{
				if(player.getTotal_runs() >= 2000 && player.getSpecialization().equals("Batter"))
				{
					bestbatters.add(team+": "+player.getName());
				}
				
			}
			
		}
		return bestbatters;
	}
	
	//Best Bowlers
	public Set<String> bestBowlersService()
	{
		Set<String> bestbowlers=new HashSet<String>();
		for(String team:allTeamsName)
		{
			for(Players player:allTeamsservice.get(team))
			{
				if(player.getTotal_wickets() >= 50 && player.getSpecialization().equals("Bowler"))
				{
					bestbowlers.add(team+": "+player.getName());
				}
				
			}
			
		}
		return bestbowlers;
	}
	
	//Indian players
	
	public List<String> allIndiansPlayersService(Scanner sc)
	{
		System.out.println("Enter team name: ");
		String team=sc.nextLine();
		List<String> allIndianplayer = new ArrayList<String>();
		for(Players player:allTeamsservice.get(team))
		{
			if(player.getNationality().equals("Indian"))
			{
				allIndianplayer.add(player.getName());
			}
			
		}
		
		return allIndianplayer;
	}
	
	// Other country players
	public List<String> allOtherPlayersService(Scanner sc)
	{
		System.out.println("Enter team name: ");
		String team=sc.nextLine();
		List<String> allOtherplayer = new ArrayList<String>();
		for(Players player:allTeamsservice.get(team))
		{
			if(!player.getNationality().equals("Indian"))
			{
				allOtherplayer.add(player.getName());
			}
			
		}
		
		return allOtherplayer;
	}
	
	//Add player
	public void addPlayerService(Scanner sc)
	{
		System.out.println("Enter team name: ");
		String team=sc.nextLine();
		System.out.println("Enter Player's name: ");
		String name=sc.nextLine();
		System.out.println("Enter Player's jersy number: ");
		int jn=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Player's nationality: ");
		String nationality=sc.nextLine();
		System.out.println("Enter Player's specialization: ");
		String specialization=sc.nextLine();
		System.out.println("Enter player's debut year: ");
		int year =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter player's total matches: ");
		int matches =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter player's total runs: ");
		int runs =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter player's total wickets: ");
		int wickets =sc.nextInt();
		sc.nextLine();
		
		allTeamsservice.get(team).add(new Players(name,jn,nationality,specialization,year,matches,runs,wickets));
		System.out.println("New player added successfully...!");
		
	}
	
	//Remove player
	
	public void removePlayerService(Scanner sc)
	{
		System.out.println("Enter team name: ");
		String team=sc.nextLine();
		System.out.println("Enter player name: ");
		String name=sc.nextLine();
		boolean flag =false;
		for(Players p1 :allTeamsservice.get(team))
		{
			if(p1.getName().equalsIgnoreCase(name))
			{
				allTeamsservice.get(team).remove(p1);
				flag=true;
				System.out.println("Player removed successfully...!");
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Player do not exist..!");
		}
	}
	
	

}
