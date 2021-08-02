package day_1;

import java.util.Scanner;
class Innings {
    private String teamname,inningsname;
    private int runs;

    public void setTeamName(String name){
        teamname=name;
    }
    public String getTeamName(){
        return teamname;
    }

    public void setinningsname(String name){
        inningsname=name;
    }
    public String getinningsname(){
        return inningsname;
    }
    
    public void setruns(int runs){
        this.runs=runs;
    }
    public int getruns(){
        return runs;
    }
    public void displayInningsDetails(){
        System.out.println("Name: "+teamname);
        System.out.println("Scored: "+runs);
        if(inningsname.equals("First")){
            runs++;
            System.out.println("Need "+runs+" to win");
        }
        else{
            System.out.println("Match ended.");
        }

    }
   
}
public class InningsMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Innings i=new Innings(); 
        System.out.println("Enter the team name:");
        String tname=sc.next();
        i.setTeamName(tname);
        System.out.println("Enter session:");
        String s=sc.next(); //Enter only First and Second
        i.setinningsname(s);
        System.out.println("Enter runs:");
        int runs=sc.nextInt();
        i.setruns(runs);
        i.displayInningsDetails();
        sc.close();
    }
    
}
