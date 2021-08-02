package day_3;

import java.io.*;

public class RunsPerOverMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    System.out.println("Enter the number of overs: ");    
	    int overs =Integer.parseInt(br.readLine());
	    int a[]=new int[overs];
	    System.out.println("Enter the number of runs for each over: ");
	    for(int i=0;i<overs;i++) {
	    	a[i]=Integer.parseInt(br.readLine());
	    }
	    System.out.println("Enter the over number: ");
	    int index = Integer.parseInt(br.readLine());
		    System.out.println("Runs scored in the over: "+a[index-1]);
	    }catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    
	}
}
