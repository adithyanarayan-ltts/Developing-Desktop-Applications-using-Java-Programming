package day_5;

import java.util.*;

class Bowler {

    private String name;

    public Bowler(String name) {
    	this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Wicket {

    private String playerName;
    private Bowler bowler;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Bowler getBowler() {
        return bowler;
    }

    public void setBowler(Bowler bowler) {
        this.bowler = bowler;
    }

    public Wicket() {
    }

    public Wicket(String playerName, Bowler bowler) {
        this.playerName = playerName;
        this.bowler = bowler;
    }

}
public class HashMapMain {

	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
//	        System.out.println("Enter the player name");
//	        String playerName = scanner.nextLine();
//	        System.out.println("Enter wickets - seperated by \"|\" symbol");
//	        String wickets = scanner.next();

	        HashMap<String, List<Wicket>> hashMap = new HashMap<>();

	        boolean addPlayer = true, search=true;
	        while (addPlayer) {
	            System.out.println("Enter the player name");
	            String playerName = scanner.nextLine();
	            System.out.println("Enter wickets - seperated by \"|\" symbol");
	            String wickets = scanner.nextLine();
	            ArrayList<Wicket> list = new ArrayList();
	            String bowlersWickets[] = wickets.split("\\|");
	            for (int i = 0; i < bowlersWickets.length; i++) {
	            	list.add(new Wicket(bowlersWickets[i], new Bowler(playerName)));
	            }
	            hashMap.put(playerName, list);
	            System.out.println("Do you want to add another player (yes/no)");
	            addPlayer = (scanner.nextLine().equals("yes")?true:false);           
	        }
	        while(search) {
	        	System.out.println("Enter the player name to search");
	            String searchName = scanner.nextLine();
	            if(hashMap.containsKey(searchName)) {
	            	System.out.println("Player Name:" + searchName);
	            	System.out.println("Wickets:");
	            	for(Wicket w: hashMap.get(searchName)) {
	            		System.out.println(w.getPlayerName());
	            	}
	            }
	            else {
	            	System.out.println("No player found with the name "+searchName);
	            }
	            System.out.println("Do you want to search another player (yes/no)");
	            search = (scanner.nextLine().equals("yes")?true:false);  
	        }
	        System.out.println("Successfully Terminated...");
	    }
}
