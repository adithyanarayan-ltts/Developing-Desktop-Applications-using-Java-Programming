package day_5;

import java.io.*;
import java.util.*;

class SortScores implements Runnable{
	private String matchType;
	private String scoreString;
	private int[] scores;
	
	public SortScores(String matchType, String scoreString) {
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	public void setMatchType(String s) {
		matchType = s;
	}
	public void setScores() {
		String[] sc = scoreString.split(",");
		scores = Arrays.asList(sc).stream().mapToInt(Integer::parseInt).toArray();
	}
	public String getMatchType() {
		return matchType;
	}
	public String getScoreString() {
		return scoreString;
	}
	public int[] getScores() {
		return scores;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Arrays.sort(scores);
		
	}
}
public class SortScoresMain {
	 static void printArray(SortScores sortScores) {
	        System.out.println("Match: "+ sortScores.getMatchType());
	        int a[] = sortScores.getScores();
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }

	    }
	public static void main(String[] args) throws Exception {
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Enter the Match:");
			String match = br.readLine();
			System.out.println("Enter the Scores:");
			String scores=br.readLine();
			SortScores s1 = new SortScores(match,scores);
			s1.setScores();
			Thread t1 = new Thread(s1);
			t1.start();
			System.out.println("Enter the Match:");
			String match2 = br.readLine();
			System.out.println("Enter the Scores:");
			String scores2=br.readLine();
			SortScores s2 = new SortScores(match2,scores2);
			s2.setScores();
			Thread t2 = new Thread(s2);
			t2.start();
			System.out.println("Enter the Match:");
			String match3 = br.readLine();
			System.out.println("Enter the Scores:");
			String scores3=br.readLine();
			SortScores s3 = new SortScores(match2,scores3);
			s3.setScores();
			Thread t3 = new Thread(s3);
			t3.start();
			t1.join();
			t2.join();
			t3.join();
			System.out.println("Ordered Score List");
			printArray(s1);
	        printArray(s2);
	        printArray(s3);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}

}
