package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Pen p = new Pen();
		Headphones h = new Headphones();
		
		System.out.println("PEN ATTRIBUTES");
		System.out.println("-----------------------------");
		System.out.println(p.clicked);
		
		System.out.println("Color: " + p.color);
		System.out.println("Point: " + p.point);
		System.out.println("Type: " + p.type);

		System.out.println("Clicked Status: " + p.clicked);
		
		p.click();
		
		System.out.println("HEADPHONE ATTRIBUTES");
		System.out.println("-----------------------------");
		
		
		System.out.println("Charge Port: " + h.charge);
		System.out.println("Color: " + h.color);
		System.out.println("Controls: " + Arrays.toString(h.controls));
		h.powerOff();
		System.out.println("Power Status: " + h.power);
		h.powerOn();
		System.out.println("Power Status: " + h.power);
		
		
	}

}
