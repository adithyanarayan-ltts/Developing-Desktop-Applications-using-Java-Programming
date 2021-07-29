package activity_4_exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

class TeamNameNotFoundException extends Exception{
	TeamNameNotFoundException(String s){
		super(s);
	}
}
public class TeamNameNotFoundExceptionMain {
	public static void main(String[] args) throws Exception {
		List<String> teams = Arrays.asList("CHENNAI SUPER KINGS","MUMBAI INDIANS","SUN RISERS HYDERABAD","DELHI CAPITALS","RAJASTHAN ROYALS","ROYAL CHALLENGERS BANGALORE","KOLKOTA NIGHT RIDERS","KINGS XI PUNJAB");
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    try {
	    	System.out.println("Enter the expected winner team of IPL Season 13:");
			String teamName1 = br.readLine();
			if(teams.contains(teamName1.toUpperCase())) {
				System.out.println("Enter the expected runner team of IPL Season 13:");
				String teamName2 = br.readLine();
				if(teams.contains(teamName2.toUpperCase())) {
					System.out.println("Expected IPL Season 13 winner: "+ teamName1);
					System.out.println("Expected IPL Season 13 runner: "+ teamName2);
				}
				else {
					throw new TeamNameNotFoundException("Entered team '"+teamName2+"' is not a part of IPL Season 13");
				}
			}
			else {
				throw new TeamNameNotFoundException("Entered team '"+teamName1+"' is not a part of IPL Season 13");
			}
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	    
		
	}
}
