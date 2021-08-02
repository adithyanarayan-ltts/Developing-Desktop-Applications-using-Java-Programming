package day_3;
import java.io.*;  

class RunRateCalculator{
	private float runRate;
	private int runsScored;
	private int oversFaced;
	
	public void setRuns(int r) {
		runsScored = r;
	}
	public void setOvers(int o) {
		oversFaced = o;
	}
	public float calculateRunRate() {
		if(oversFaced == 0) {
			throw new ArithmeticException();
		}
		else {
			runRate = (float) runsScored/oversFaced;
		}
		return runRate;
	}
}
public class RunRateCalculatorMain {
	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    RunRateCalculator rrc = new RunRateCalculator();
	    System.out.println("Enter the total runs scored: ");    
	    String runs=br.readLine(); 
	    System.out.println("Enter the total overs faced: ");    
	    String overs=br.readLine(); 
	    try {
		    int rs = Integer.parseInt(runs);
		    int ov= Integer.parseInt(overs);
		    rrc.setRuns(rs);
		    rrc.setOvers(ov);
		    System.out.println("Current Run Rate: "+rrc.calculateRunRate());
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	    
	    
	    
	}

}
