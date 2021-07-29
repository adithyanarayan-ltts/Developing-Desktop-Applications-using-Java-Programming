package activity_5;

import java.io.*;
import java.util.*;
public class PlayerOfTheMatch {
	public static void main(String[] args) throws Exception{
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Enter number of players:");
			int n = Integer.parseInt(br.readLine());
			System.out.println("Enter players:");
			TreeSet<String> set = new TreeSet<String>();
			for(int i = 0 ;i<n;i++) {
				set.add(br.readLine());
			}			
			System.out.println("The players are: ");
			for(String s:set) {
				System.out.println(s);

			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
