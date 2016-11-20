package lesson7;

import java.util.*;

public class Main  {
	
	public static void main(String args[]) {
		Rose rose1 = new Rose("Rosa Evropa", "red", 550, 3, 5, 5, 30, 1, 1);
		Rose rose2 = new Rose("Rosa Azia", "white", 500, 4, 3, 6, 40, 1, 1);
		Rose rose3 = new Rose("Rosa Afrika", "black", 580, 2, 1, 3, 10, 1, 0);
		Rose rose4 = new Rose("Rosa Evropa", "red", 600, 3, 5, 5, 30, 1, 1);
		Rose rose5 = new Rose("Rosa Evropa", "red", 600, 3, 5, 5, 30, 1, 1);
		Tulip tulip1 = new Tulip("Tulpan", "red", 500, 3, 2, 35, 3, 1);
		Tulip tulip2 = new Tulip("Tulpan", "red", 550, 3, 3, 35, 3, 1);
		Tulip tulip3 = new Tulip("Tulpan", "white", 550, 2, 5, 50, 2, 1);
		Tulip tulip4 = new Tulip("Tulpan", "white", 500, 2, 5, 50, 3, 1);
		Camomile camomile1 = new Camomile("Gerber", "white", 550, 2, 5, 30, 8, 2, 1);
		Camomile camomile2 = new Camomile("Gerber", "white", 650, 2, 5, 30, 8, 2, 1);
		Camomile camomile3 = new Camomile("Gerber", "white", 500, 2, 5, 30, 8, 2, 1);
		Camomile camomile4 = new Camomile("Gerber", "white", 500, 2, 5, 30, 8, 2, 1);
		CornFlower cornflower1 = new CornFlower("CornFlower", "blue", 300, 3, 5, 10, 6, 5, 1);
		CornFlower cornflower2 = new CornFlower("CornFlower", "blue", 300, 3, 2, 10, 6, 5, 1);
		CornFlower cornflower3 = new CornFlower("CornFlower", "blue", 300, 2, 2, 10, 6, 5, 1);
		CornFlower cornflower4 = new CornFlower("CornFlower", "blue", 300, 1, 2, 10, 6, 05, 1);
		ArrayList<Flowers> flower = new ArrayList<Flowers>();
		flower.add(rose1);
		flower.add(rose2);
		flower.add(rose3);
		flower.add(rose4);
		flower.add(rose5);
		flower.add(tulip1);
		flower.add(tulip2);
		flower.add(tulip3);
		flower.add(tulip4);
		flower.add(camomile1);
		flower.add(camomile2);
		flower.add(camomile3);
		flower.add(camomile4);
		flower.add(cornflower1);
		flower.add(cornflower2);
		flower.add(cornflower3);
		flower.add(cornflower4);
		
		for (Flowers o :flower) {
				
		if(o.dlinnaSteblij>500&o.dlinnaSteblij<600){
	 System.out.println(o.toString());
		
		}	
	}
}}
