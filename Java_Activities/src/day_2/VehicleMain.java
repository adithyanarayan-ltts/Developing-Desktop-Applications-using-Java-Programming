package day_2;

import java.util.*;

class Vehicle {
    protected String make,vechileNumber,fuelType;
    protected int fuelCapacity,cc;
    
    Vehicle(String make,String vechileNumber,String fuelType,int fuelCapacity,int cc){
        this.make=make;
        this.vechileNumber=vechileNumber;
        this.fuelType=fuelType;
        this.fuelCapacity=fuelCapacity;
        this.cc=cc;
    }
    public void displayMake(){
        System.out.println("***"+make+"***");
        
    }
    public void displayBasicInfo(){
        System.out.println("---Basic Information---");
        System.out.println("Vehicle Number: "+vechileNumber);
        System.out.println("Fuel Capacity: "+fuelCapacity);
        if(fuelType.equals("1"))
        System.out.println("Fuel Type: "+"Petrol");
        else System.out.println("Fuel Type: "+"Diesel");
        System.out.println("CC: "+cc);
    }
    public void displayDetailInfo(){

    }
    
}

class TwoWheeler extends Vehicle{
    private boolean kickStartAvailable;
    TwoWheeler(String make,String Vnumber,String fType,int cap,int cc,boolean kickStartAvailable){
        super(make,Vnumber,fType,cap,cc);
        this.kickStartAvailable=kickStartAvailable;
    }
    public void displayDetailInfo(){
        System.out.println("---Detail Informaion---");
        if(kickStartAvailable)
        System.out.println("Kick Start AVAILBLE: "+"YES");
        else{
            System.out.println("Kick Start AVAILBLE: "+"NO");
        }
    }
   
}

class FourWheeler extends Vehicle {
    private String audioSystem;
    private int numberOfDoors;
    
     FourWheeler(String make,String Vnumber,String fType,int cap,int cc,String audioSyste,int numberOfDoors){
    super(make,Vnumber,fType,cap,cc);
    this.audioSystem=audioSyste;
    this.numberOfDoors=numberOfDoors;
}
    public String getAudio(){
        return this.audioSystem;
    }
    public int getNumber(){
        return this.numberOfDoors;
    }
    
       public void displayDetailInfo(){
        System.out.println("---Detail Informations---");
        System.out.println("Audio System: "+audioSystem);
        System.out.println("Number of Doors "+numberOfDoors);
    }
    
}
public class VehicleMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Four Wheeler");
        System.out.println("2. Two Wheeler");
        System.out.println("Enter Vehicle Type");
        int type=sc.nextInt();
        if(type==1){
            System.out.println("Vehicle Make:");
            String make=sc.nextLine();
            sc.nextLine();
            System.out.println("Vehicle Number:");
            String Vnumber=sc.nextLine();
            System.out.println("Fuel type:");
            System.out.println("1. Petrol");
            System.out.println("2. Diesel");
            String fType=sc.nextLine();
            System.out.println("Fuel Capacity:");
            int cap=sc.nextInt();
            System.out.println("Engine CC:");
            int cc=sc.nextInt();
           
           System.out.println("Audio System: ");
           String au=sc.nextLine();
           sc.nextLine();
           System.out.println("Number of Doors: ");
           int doo=sc.nextInt();
          Vehicle c=new FourWheeler(make,Vnumber,fType,cap,cc,au,doo);
           c.displayMake();
           c.displayBasicInfo();;
           c.displayDetailInfo();
        }
        else{
            System.out.println("Vehicle Make:");
            String make=sc.next();
            sc.nextLine();
            System.out.println("Vehicle Number:");
            String Vnumber=sc.nextLine();
            System.out.println("Fuel type:");
            System.out.println("1. Petrol");
            System.out.println("2. Diesel");
            String fType=sc.next();
            System.out.println("Fuel Capacity:");
            int cap=sc.nextInt();
            System.out.println("Engine CC:");
            int cc=sc.nextInt();
           
            System.out.println("Kick Start Available(yes/no):");
            boolean ans= (sc.next().equals("yes"))?true:false;
            Vehicle v=new TwoWheeler(make, Vnumber, fType, cap, cc, ans);
            v.displayMake();
            v.displayBasicInfo();
            v.displayDetailInfo();


        }
        sc.close();
    }
    
}