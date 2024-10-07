package com.aj.controller;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.aj.entity.Players;
import com.aj.service.IPL_Service;

public class IPL_Controller {
	
	IPL_Service is=new IPL_Service();
	
	public Set<String> allTeamsService()
	{
		Set<String> s1=is.allTeamsService();
		return s1;
	}
	
	public Set<String>playersofTeamController(Scanner sc)
	{
		Set<String> s2=is.playersofTeamService(sc);
		return s2;
	}
	
	public Players playersStatsController(Scanner sc)
	{
		Players p1 =is.playersStatsService(sc);
		return p1;
	}
	
	//Best batsmen
	public Set<String>bestBatsmenController()
	{
		Set<String> s3=is.bestBatsmenService();
		return s3;
	}
	
	//Best bowler
	public Set<String>bestBowlersController()
	{
		Set<String> s4=is.bestBowlersService();
		return s4;
	}
	
	//Add player
	public void addPlayerController(Scanner sc)
	{
		is.addPlayerService(sc);
	}
	public List<String> allIndiansPlayersController(Scanner sc)
	{
		List<String> l1=is.allIndiansPlayersService(sc);
		return l1;
	}
	
	public List<String> allOtherPlayersController(Scanner sc)
	{
		List<String> l2=is.allOtherPlayersService(sc);
		return l2;
	}
	
	public void removePlayerController(Scanner sc)
	{
		is.removePlayerService(sc);
	}

}
