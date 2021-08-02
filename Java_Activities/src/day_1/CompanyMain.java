package day_1;

import java.util.Scanner;
 
class Company {
    private String name,employees,teamlead;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setemployees(String employees){
        this.employees=employees;
    }
    public String getemployees(){
        return this.employees;
    }

    public void setteamlead(String teamlead){
        this.teamlead=teamlead;
    }
    public String getteamlead(){
        return this.teamlead;
    }
    
}

public class CompanyMain {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        Company c=new Company();
	        System.out.println("Enter the company name:");
	        String name=sc.nextLine();
	        c.setName(name);
	        System.out.println("Enter the employees:");
	        String employees=sc.nextLine();
	        c.setemployees(employees);
	        System.out.println("Enter the TeamLead:");
	        String teamlead=sc.nextLine();
	        if(employees.contains(teamlead)){
	            c.setteamlead(teamlead);
	            System.out.println("Name: "+c.getName());
	            System.out.println("Employees: "+c.getemployees());
	            System.out.println("Lead: "+c.getteamlead());
	        }
	        else {
	            System.out.println("No such employee exists in the team.");
	        }
	        sc.close();
	}
}
