package lesson7;

import java.util.*;

public class Main {

	private static Scanner scanner;

	public static void main(String args[])throws Exception {

		int y, x, z;
		int u=0;
		
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
		CornFlower cornflower4 = new CornFlower("CornFlower", "blue", 300, 1, 2, 10, 6, 5, 1);
		Aksesuar aksesuar1 = new Aksesuar("Bumaga", 3);
		Aksesuar aksesuar2 = new Aksesuar("Lentochka", 2);
		Aksesuar aksesuar3 = new Aksesuar("Blestki", 1);
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
		System.out.println("Добавить в букет аксессуар-введите:            1");
		System.out.println("Узнать цену букета-введите :                   2");
		System.out.println("Провести выборку букета по длинне -введите:    3");
		System.out.print  ("Провести выборку букета по свежести-введите:   4");
		scanner = new Scanner(System.in);
		x = scanner.nextInt();
		if (x == 1) {
			System.out.println("Добавить в букет оберточную бумагу-введите:            1");
			System.out.println("Добавить в букет ленту-введите:                        2");
			System.out.println("Добавить в букет блестки:                              3");
			y = scanner.nextInt();
			if(y==1){
				
			}
		}

		if (x == 2) {
			
			for (Flowers o : flower) {
				
				u=u+o.getCena();}
			System.out.println("Цена букета равна "+u+ "руб.");	
			
		}
		if (x == 3) {
			System.out.println("Введите введите нижнюю грань диапазона в мм  :");
			y = scanner.nextInt();
			System.out.println("Введите введите верхнюю грань диапазона в мм :");
			z = scanner.nextInt();
			for (Flowers o : flower) {
				if (o.dlinnaSteblij > y & o.dlinnaSteblij < z) {
					System.out.println(o.toString());
				}
			}
		}
		if (x == 4) {
			System.out.println("Введите уровень свежести в диапозоне от 0 до 5");
			z = scanner.nextInt();
			for (Flowers o : flower) {
				if (o.swechest >= z) {
					System.out.println(o.toString());
				}
			}
		}
	
	{System.out.println("Введено некоректное значение");
		
	}
		
	}}	