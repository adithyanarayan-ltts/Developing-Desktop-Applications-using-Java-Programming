package activity_3_abstract_class;

import java.util.Scanner;

abstract class Match {
    private static int currentScore;
    private static float currentOver;
    private static int target;
    public void  setValue(int curr,float cur,int t){
        currentScore=curr;
        currentOver=cur;
        target=t;
    }
    public int getScore(){
        return currentScore;
    }
    public static float getOver(){
        return currentOver;
    }
    public static int getTarget(){
        return target;
    }

    abstract public float calculateRunRate();
    abstract public int calculateBalls();
    abstract public void display(double reqRunrate,int balls);
    
}
class ODIMatch extends Match{
    
    public float calculateRunRate(){
        float rr=getTarget()-getScore();
        return (rr/calculateBalls())*6;
        
    
    }
    public int calculateBalls(){
        return 300-((int)getOver()*6);
    }
    public void display(double reqRunrate,int balls){
        System.out.println("Requirements:");

        System.out.println("Need "+(getTarget()-getScore())+" runs in "+balls+" balls");
      
        System.out.println("Required Runrate: "+String.format("%.2f", reqRunrate));
    }
}
class T20Match extends Match{
    
    public float calculateRunRate(){
        float rr=getTarget()-getScore();
        return (rr/calculateBalls())*6;
        
    
    }
    public int calculateBalls(){
        return 120-((int)getOver()*6);
    }
    public void display(double reqRunrate,int balls){
        System.out.println("Requirements:");

        System.out.println("Need "+(getTarget()-getScore())+" runs in "+balls+" balls");
      
        System.out.println("Required Runrate: "+String.format("%.2f", reqRunrate));
    }
}
class TestMatch extends Match{
    
    public float calculateRunRate(){
        float rr=getTarget()-getScore();
        return (rr/calculateBalls())*6;
        
    
    }
    public int calculateBalls(){
        return 540-((int)getOver()*6);
    }
    public void display(double reqRunrate,int balls){
        System.out.println("Requirements:");

        System.out.println("Need "+(getTarget()-getScore())+" runs in "+balls+" balls");
      
        System.out.println("Required Runrate: "+ String.format("%.2f", reqRunrate));
    }
}
public class MatchMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the match format");
        System.out.println("1. ODI");
        System.out.println("2. T20");
        System.out.println("3. Test");
        int op=sc.nextInt();
        Match match;
        if(op==1){
            ODIMatch o=new ODIMatch();
            match=o;
            System.out.println("Enter the Current Score: ");
            int curr=sc.nextInt();
            System.out.println("Enter the Current Over: ");
            float over=sc.nextFloat();
            System.out.println("Enter the Target Score: ");
            int score=sc.nextInt();
            match.setValue(curr, over, score);
            float rrr=match.calculateRunRate();
            int ball=match.calculateBalls();
            match.display(rrr, ball);

            
        }
        else if(op==2){
            T20Match t=new T20Match();
            match=t;
            System.out.println("Enter the Current Score: ");
            int curr=sc.nextInt();
            System.out.println("Enter the Current Over: ");
            float over=sc.nextFloat();
            System.out.println("Enter the Target Score: ");
            int score=sc.nextInt();
            match.setValue(curr, over, score);
            float rrr=match.calculateRunRate();
            int ball=match.calculateBalls();
            match.display(rrr, ball);

        }
        else if(op==3){
            TestMatch o=new TestMatch();
            match=o;
            System.out.println("Enter the Current Score: ");
            int curr=sc.nextInt();
            System.out.println("Enter the Current Over: ");
            float over=sc.nextFloat();
            System.out.println("Enter the Target Score: ");
            int score=sc.nextInt();
            match.setValue(curr, over, score);
            float rrr=match.calculateRunRate();
            int ball=match.calculateBalls();
            match.display(rrr, ball);

        }
        else{
            System.out.println("Invalid Input");
        }
        sc.close();
        
    }
    
}