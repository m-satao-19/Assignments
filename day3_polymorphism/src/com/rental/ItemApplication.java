package com.rental;

import java.util.Scanner;

import com.rental.Computer;
import com.rental.Furniture;
import com.training.ifaces.Item;

public class ItemApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RentShop helloShop = new RentShop();
		Item item =null;
		do {
			//int key = Integer.parseInt(args[0]);
			System.out.println("1 for Computer");
			System.out.println("2. for Furniture");
			System.out.println("Enter key");
			int key = sc.nextInt();
		    System.out.println("Enter no of days");
		    int noDays=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the model");
		    String Model = sc.nextLine();
			item = helloShop.getItem(key, Model);
			
			if(item!=null) {
				System.out.println("Total rent is ");
				helloShop.printEstimation(item,noDays);
			}
			else {
				System.out.println("Invalid choice (1/2)");
			}
		}while(item==null);
		sc.close();
	}
}
