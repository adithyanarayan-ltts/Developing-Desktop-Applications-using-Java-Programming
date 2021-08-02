package day_4;

import java.io.*;
import java.util.*;
public class HashSetMain {

	public static void main(String[] args) throws Exception{
		try {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Enter number of players:");
			int n = Integer.parseInt(br.readLine());
			System.out.println("Enter players:");
			HashSet<String> set = new HashSet<String>();
			for(int i = 0 ;i<n;i++) {
				set.add(br.readLine());
			}
			System.out.println(set.size());
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
