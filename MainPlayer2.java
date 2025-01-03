/*
Q6. Player Performance Tracker
• POJO Class: Player
o Attributes: playerId, name, team, matchesPlayed, runsScored.
o Constructor: Initializes all attributes.
• Operations:
1.Add multiple players.
2.Calculate the average runs scored by players in a specific team.
3.Find the player with the highest strike rate (calculated as runsScored /
matchesPlayed).
*/
import java.util.*;

class Player
{
	int playerId, matches, runs;
	String name, team;
	double strikerate;
	
	Player(int playerId, String name, String team, int matches, int runs )
	{
		this.playerId=playerId;
		this.name=name;
		this.team=team;
		this.matches=matches;
		this.runs=runs;
	}
	
	int getPlayerId()
	{
		return playerId;
	}

	String getName()
	{
		return name;
	}
	String getTeam()
	{
		return team;
	}
	
	int getMatches()
	{
		return matches;
	}
	
	int getRuns()
	{
		return runs;
	}
	
	double getStrikeRate()
	{
		return strikerate=(double) runs/matches;
	}
	
	
}
public class MainPlayer2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of player: ");
		int size=sc.nextInt();
		
		Player[] player = new Player[size];
		addPlayers(player,sc);
		
		sc.nextLine();
		System.out.println("\nEnter team for calcualting avearge ");
		String searchTeam=sc.nextLine();
		
		double avg=avgRuns(player, searchTeam);
		System.out.println("\nAverage runs for "+searchTeam+" is:"+avg);
		
		heighestStrikeRate(player);
		
	}	
	
	static void addPlayers(Player[] player, Scanner sc)
	{
			for(int i=0;i<player.length;i++)
		{
			System.out.println("\nEnter information of Player: "+(1+i));
			
			System.out.println("Enter playerId ");
			int playerId= sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Name: ");
			String name=sc.nextLine();
			
			System.out.println("Enter Team: ");
			String team=sc.nextLine();
			
			System.out.println("Enter matches: ");
			int matches=sc.nextInt();
			
			System.out.println("Enter Runs: ");
			int runs= sc.nextInt();
			
			player[i]=new Player(playerId, name, team, matches, runs);
		}
	}
	
		static double avgRuns(Player[] player,String searchTeam)
		{
			int totalRuns=0;
			int totalPlayers=0;
			for(int i=0;i<player.length;i++)
			{
				if(player[i].getTeam().equalsIgnoreCase(searchTeam))
				{
					totalRuns += player[i].getRuns();
					totalPlayers++;
				}
			}
			
			if(totalPlayers>0)
			{
				return (double) (totalRuns/totalPlayers);
			}
			else
			{
				return 0;
			}
		}
	
		static void heighestStrikeRate(Player[] player)
		{
			Player bestPlayer=null;
			double HighStrikerate=0;
			for(int i=0;i<player.length;i++)
			{
				if(HighStrikerate<player[i].getStrikeRate())
				{
					HighStrikerate=player[i].getStrikeRate();
					bestPlayer=player[i];
				}
			}
			
				System.out.println("\nPlayer With Highest Strike rate: ");
				System.out.println("Id:"+bestPlayer.getPlayerId());
				System.out.println("Name:"+bestPlayer.getName());
				System.out.println("Team:"+bestPlayer.getTeam());
				System.out.println("Matches:"+bestPlayer.getMatches());
				System.out.println("Runs:"+bestPlayer.getRuns());
				System.out.println("Strike Rate:"+HighStrikerate);
				
		}
}