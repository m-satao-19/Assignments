package com.rental;

import com.rental.Computer;
import com.rental.Furniture;
import com.training.ifaces.Item;
import java.util.*;
public class RentShop {
	
public Item getItem(int key, String Model) {
		Scanner sc = new Scanner(System.in);
		switch(key) {
		case 1: 
			return new Computer(Model);
		
		case 2:  return new Furniture(Model);
		
		default: return null;
		}
	}
	
	public void printEstimation(Item item, int noDays) {
		//System.out.println(polyAuto.APPNAME);
		System.out.println(item.getModel());
		System.out.println(item.calculateRentPrice(noDays));
	}
	
}
