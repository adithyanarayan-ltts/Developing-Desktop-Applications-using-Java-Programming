package day_1;
import java.lang.Math;
import java.util.Scanner;
public class PrimeSum {
	static boolean checkPrime(int a) {
		if(a==1||a==0)	return false;
		else if(a==2) 	return true;
		else {
			for(int i=2;i<=Math.sqrt(a);i++) {
				if(a%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	static int sumPrimeArray(int array[], int size) {
		int sum=0;
		for(int i=0;i<size;i++) {
			if(checkPrime(array[i])==true) {
				sum+=array[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("\nEnter the size:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n<0) {
			System.out.println("Invalid array size");
			System.exit(0);
		}
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid input.");
				System.exit(0);
			}
		}
		System.out.println("Sum: "+sumPrimeArray(arr,n));
	}

}
