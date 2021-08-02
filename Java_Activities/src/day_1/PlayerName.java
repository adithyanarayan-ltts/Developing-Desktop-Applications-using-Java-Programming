package day_1;

import java.io.*;
import java.util.*;

class Player{
    private String firstName;
    private String lastName;
    
    public void setFirstName(String fname){
        fname = fname.substring(0,1).toUpperCase() + fname.substring(1).toLowerCase();
        this.firstName=fname;
    }
    public void setLastName(String lname){
        lname = lname.toUpperCase();
        this.lastName=lname;
    }
    public String getFullName(){
        return firstName+" " + lastName;
    }
}

public class PlayerName{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        Player p = new Player();
        try{
            System.out.println("Enter first name: ");
            String fname = sc.nextLine();
            p.setFirstName(fname);
            System.out.println("Enter last name: ");
            String lname = sc.nextLine();
            p.setLastName(lname);
            System.out.println(p.getFullName());
        }
        catch(Exception ex){
            System.out.println("Invalid Input");
        }
    }
}
