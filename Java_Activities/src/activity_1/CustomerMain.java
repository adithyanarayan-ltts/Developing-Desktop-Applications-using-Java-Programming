package activity_1;

import java.util.Scanner;

class Customer {
    private String name,address,mobile;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return this.address;
    }

    public void setMobile(String Mobile){
        this.mobile=Mobile;
    }
    public String getMobile(){
        return this.mobile;
    }    
}
public class CustomerMain {
	public static void main(String[] args) {
        Customer c=new Customer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
        String s=sc.nextLine();
        String str[]=s.split("[,]");
        c.setName(str[0]);
        c.setAddress(str[1]);
        c.setMobile(str[2]);
        System.out.println("Name: "+c.getName());
        System.out.println("Address: "+c.getAddress());
        System.out.println("Mobile: "+c.getMobile());
        sc.close();


    }

}
