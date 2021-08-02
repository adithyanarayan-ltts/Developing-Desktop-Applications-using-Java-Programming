package day_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CustomException extends Exception
{
 CustomException(String s){
	 super(s);
 }
}
public class CustomExceptionMain {

	public static void main(String[] args) throws Exception {
	
		try {
			String playerName;
			int playerAge;
			InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader br=new BufferedReader(r);
		    System.out.println("Enter the player name:");
			playerName = br.readLine();
			System.out.println("Enter the player age :");
			playerAge = Integer.parseInt(br.readLine());
			if(playerAge < 19) {
				throw new CustomException("InvalidAgeRangeException");
			}
			else {
				System.out.println("Player name : "+playerName);
				System.out.println("Player age : "+playerAge);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

