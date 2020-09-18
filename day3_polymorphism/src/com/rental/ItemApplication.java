package com.rental;

import java.util.ArrayList;
import java.util.Scanner;

import com.rental.Computer;
import com.rental.Furniture;
import com.training.ifaces.Item;

public class ItemApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RentShop helloShop = new RentShop();
		Item item =null;
		ArrayList<Item> myList = new ArrayList<Item>();
		int key =0;
		double cost=0.0;
		while(key!=3) {
			//int key = Integer.parseInt(args[0]);
			System.out.println("1 for Computer");
			System.out.println("2. for Furniture");
			System.out.println("3. for exit");
			System.out.println("Enter key");
			key = sc.nextInt();
			
		    System.out.println("Enter no of days");
		    int noDays=sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the model");
		    String Model = sc.nextLine();
		    
			item = helloShop.getItem(key, Model);
			myList.add(item);
			
			if(item!=null) {
				System.out.println("rent is ");
				cost+=helloShop.printEstimation(item,noDays);
				System.out.println(cost);
			}
			System.out.println("enter 3 to exit 0 to continue");
			System.out.println("Enter key");
			key = sc.nextInt();
		}
		System.out.println("Final cost = "+cost);
		System.out.println("Products are -");
		for(Item temp: myList) {
			System.out.println(temp.getModel());
		}
		sc.close();
	}
}
