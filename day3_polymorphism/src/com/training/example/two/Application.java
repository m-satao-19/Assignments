package com.training.example.two;
import java.io.*;
import java.util.*;
import com.training.ifaces.Automobile;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShowRoom saiCars = new NewShowRoom();
		Automobile selected =null;
		do {
			//int key = Integer.parseInt(args[0]);
			System.out.println("Enter key");
			int key = sc.nextInt();
			selected = saiCars.getProduct(key);
			
			if(selected!=null) {
				saiCars.printEstimation(selected);
			}
			else {
				System.out.println("Invalid choice (1-3)");
			}
		}while(selected==null);
		sc.close();
	}
}
