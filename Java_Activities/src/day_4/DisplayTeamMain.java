package day_4;

import java.util.*;
import java.io.*;

class Player{
	private String name;
	
	public Player() {
		name ="";
	}
	public Player(String playerName){
		name = playerName;
	}
	public void setName(String s) {
		name = s;
	}
	public String getName() {
		return name;
	}
}

class Team extends Player{
	private String name;
	private ArrayList<Player> playerList = new ArrayList<>();
	
	public Team(String s){
		super();
		name = s;
	}
	public void setTeamName(String s) {
		name = s;
	}
	
	public String getTeamName() {
		return name;
	}
	public List<Player> getList(){
		return playerList;
	}
	public void addPlayer(String playerName) {
		Player p = new Player();
		p.setName(playerName);		
		playerList.add(p);
	}
	public List<Player> getPlayerList(){
		Collections.sort(playerList,new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		return playerList;
	}
}
public class DisplayTeamMain {

	public static void main(String[] args) throws Exception {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			int size = Integer.parseInt(br.readLine());
			Map<String, Team> map = new TreeMap();
			for(int i=0;i<size;i++) {
				String input = br.readLine();
				String s[]= input.split("\\|");
				if(map.containsKey(s[0])) {
					map.get(s[0]).addPlayer(s[1]);
				}
				else
				{
					
					map.put(s[0], new Team(s[0]));
					map.get(s[0]).addPlayer(s[1]);
				}
				
			}			
			for( String s : map.keySet()) {
				System.out.println(s);
				List<Player> l = map.get(s).getPlayerList();
				for(Player p:l) {
					System.out.println("--" + p.getName());
				}
				System.out.println();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
