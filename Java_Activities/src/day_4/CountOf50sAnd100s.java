package day_4;

import java.io.*;
import java.util.*;

public class CountOf50sAnd100s {
	public static void main(String[] args)throws Exception{
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br =new BufferedReader(r);
			int n = Integer.parseInt(br.readLine());
			ArrayList<Integer> scores = new ArrayList<Integer>(n);
			int countOf50s=0, countOf100s=0;
			for(int i=0;i<n;i++) {
				scores.add(Integer.parseInt(br.readLine()));
				if(scores.get(i)>=50 && scores.get(i)<100) {
					countOf50s++;
				}
				else if(scores.get(i)>=100) {
					countOf100s++;
				}
			}
			System.out.println("50s scored: "+countOf50s);
			System.out.println("100s scored: "+countOf100s);
		}catch(Exception ee) {
			System.out.println(ee);
		}
	}
}
