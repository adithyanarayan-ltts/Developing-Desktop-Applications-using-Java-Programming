package day_5;

import java.util.*;
import java.io.*;

class Team {
	private String name;
	private long numberOfMatches;
	
	public Team() {
		
	}
	public Team(String teamName, long num) {
		this.name = teamName;
		this.numberOfMatches = num;
	}
	
	public void setName(String s) {
		this.name = s;
	}
	public void setNumberOfMatches(long s) {
		this.numberOfMatches = s;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public String getName() {
		return name;
	}
}
public class TeamComparatorMain implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		// TODO Auto-generated method stub
		if(o1.getNumberOfMatches()>o2.getNumberOfMatches()) {
			return 1;
		}
		else if(o1.getNumberOfMatches()<o2.getNumberOfMatches()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) throws Exception{
		try{
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Enter number of teams:");
			int n = Integer.parseInt(br.readLine());
			ArrayList<Team> teams = new ArrayList();
			for(int i=0;i<n;i++) {
				Team t = new Team();
				System.out.println("Enter team "+(i+1)+" detail");
				System.out.println("Enter Name");
				t.setName(br.readLine());
				System.out.println("Enter number of matches");
				t.setNumberOfMatches(Long.parseLong(br.readLine()));
				teams.add(t);
			}
			Collections.sort(teams, new TeamComparatorMain());
			System.out.println("Team list after sort by number of matches");
			for( Team t : teams) {
				System.out.println(t.getName() + "-"+ t.getNumberOfMatches());
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
