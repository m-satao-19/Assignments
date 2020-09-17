package com.training.example.two;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom{

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		if(key==3) {
			return new Tractor();
		}
		return super.getProduct(key);
	}

	@Override
	public void printEstimation(Automobile polyAuto) {
		// TODO Auto-generated method stub
		super.printEstimation(polyAuto);
	}
	
}
