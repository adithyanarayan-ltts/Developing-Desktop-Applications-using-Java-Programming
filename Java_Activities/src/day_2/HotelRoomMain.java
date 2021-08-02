package day_2;
import java.util.*;
class HotelRoom {
    protected String hotelName;
    protected int numberOfSqFeet;
    protected boolean hasTV;
    protected boolean hasWifi;

    public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        this.hotelName=hotelName;
        this.numberOfSqFeet=numberOfSqFeet;
        this.hasTV=hasTV;
        this.hasWifi=hasWifi;
    }
    public int calculateTariff(int rate){
        return rate*numberOfSqFeet;
    }
    public int getRatePerSqFeet(){
        return 0;
    }
    
}

class DeluxeRoom extends HotelRoom {
    protected int ratePerSqFeet;
    
    public  DeluxeRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        super(hotelName,numberOfSqFeet,hasTV,hasWifi);
        ratePerSqFeet=10;
        
       
    }
    public int getRatePerSqFeet(){
        if(hasWifi){
            return ratePerSqFeet+2;
        }
        else{
            return ratePerSqFeet;
        }
    }


    
}

class DeluxeAcRoom extends DeluxeRoom {
    public DeluxeAcRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet=12;
    }
}

class SuiteACRoom extends HotelRoom {
    private int ratePerSqFeet;
    public SuiteACRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet=15;
        

    }
    public int getRatePerSqFeet(){
        if(hasWifi){
            return ratePerSqFeet+2;
        }
        else{
            return ratePerSqFeet;
        }
    }
    
}
    
public class HotelRoomMain {
	public static void main(String[] args) {
        System.out.println("Hotel Tariff Calculator");
        System.out.println("1. Deluxe Room");
        System.out.println("2. Deluxe AC Room");
        System.out.println("3. Suite AC Room");
        System.out.println("Select Room Type:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Hotel Name:");
            String name=sc.next();
            System.out.println("Room Square Feet Area:");
            int area=sc.nextInt();
            System.out.println("Room has TV(yes/no):");
            boolean tv=(sc.next().equals("yes"))?true:false;;
            System.out.println("Room has Wifi(yes/no):");
            boolean wifi=(sc.next().equals("yes"))?true:false;;
            DeluxeRoom r= new DeluxeRoom(name,area,tv,wifi);
            int rate=r.getRatePerSqFeet();
            System.out.println("Room Tariff per day is:"+r.calculateTariff(rate));

        }
        else if(n==2){
            System.out.println("Hotel Name:");
            String name=sc.next();
            System.out.println("Room Square Feet Area:");
            int area=sc.nextInt();
            System.out.println("Room has TV(yes/no):");
            boolean tv= (sc.next().equals("yes"))?true:false;
            System.out.println("Room has Wifi(yes/no):");
            boolean wifi= (sc.next().equals("yes"))?true:false;
            DeluxeAcRoom d=new DeluxeAcRoom(name,area,tv,wifi);
            int rate=d.getRatePerSqFeet();
            System.out.println("Room Tariff per day is:"+d.calculateTariff(rate));
            
        }
        else if(n==3){
            System.out.println("Hotel Name:");
            String name=sc.next();
            System.out.println("Room Square Feet Area:");
            int area=sc.nextInt();
            System.out.println("Room has TV(yes/no):");
            boolean tv=(sc.next().equals("yes"))?true:false;
            System.out.println("Room has Wifi(yes/no):");
            boolean wifi=(sc.next().equals("yes"))?true:false;
            SuiteACRoom s=new SuiteACRoom(name,area,tv,wifi);
            int rate=s.getRatePerSqFeet();
            System.out.println("Room Tariff per day is:"+s.calculateTariff(rate));
            


        }
        sc.close();
    }
}
