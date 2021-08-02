package day_4;

import java.io.*;
import java.util.*;
public class ConsistentRunScorers {

	public static void main(String[] args) throws Exception{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		ArrayList players13 = new ArrayList();
		ArrayList players12 = new ArrayList();
		System.out.println("Enter the top 5 scorers of IPL Season 13:");
		for(int i=0;i<5;i++) {
			players13.add(br.readLine());
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12:");
		for(int i=0;i<5;i++) {
			players12.add(br.readLine());
		}
		players13.retainAll(players12);
		System.out.println("Consistent run scorers:");
		for(int i=0;i<players13.size();i++) {
			System.out.println(players13.get(i));
		}
	}
}
