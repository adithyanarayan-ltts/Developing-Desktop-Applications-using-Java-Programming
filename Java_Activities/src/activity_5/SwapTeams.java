package activity_5;

import java.io.*;
import java.util.*;

public class SwapTeams {

	public static void main(String[] args) throws Exception {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Enter the 5 teams:");
			ArrayList teams = new ArrayList();
			for(int i=0;i<5;i++) {
				teams.add(br.readLine());
			}
			System.out.println("Enter swap positions:");
			int from = Integer.parseInt(br.readLine());
			int to = Integer.parseInt(br.readLine());
			Collections.swap(teams, from, to);
			for(int i=0;i<5;i++) {
				System.out.println(teams.get(i));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
