package lesson7;
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.*;
import java.text.DateFormat;
import java.util.*;

/**
 * class vhoda v prilochenie
 * 
 * @author User
 * 
 */
public class Main {
		
	 static  Locale locale1 = new Locale("ru","RU") ;
	 static  Locale locale2 = new Locale("en","EN");
      static  Locale current = locale1;	
		
	static  ResourceBundle rb = ResourceBundle.getBundle("resource.MessageBundle", current);


	private static Scanner scanner;// variable class Scanner

	
	

	public static void main(String args[]) throws MyException, Exception {
		int scannerForMain;// variable
		 Date currentDate = new Date();
		 DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, current);
	   
		Main m= new Main();
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
		System.out.println(df.format(currentDate));
		System.out.println(rb.getString("s1"));
		System.out.println(rb.getString("s2"));
		System.out.println(rb.getString("s3"));
		System.out.println(rb.getString("s4"));
		System.out.println(rb.getString("s5"));
		System.out.println(rb.getString("s6"));
		System.out.println(rb.getString("s7"));
		System.out.println(rb.getString("s17"));
		scanner = new Scanner(System.in);
		
      while(true){
    	  scannerForMain = scanner.nextInt();
		try {
			
			if (scannerForMain == 1) {
				m.aksesuar(flower);
			
				
			} else if (scannerForMain == 2) {
				m.cena(flower);
				
				

			} else if (scannerForMain == 3) {
				m.diapazon(flower);
			
				
			} else if (scannerForMain == 4) {
				m.swechest(flower);
				
				}
			else if (scannerForMain == 5) {
				m.write(flower);
				
			} else if (scannerForMain == 6) {

				m.read(flower);
				

			} else if (scannerForMain == 8) {
				 return;
			} else if(scannerForMain == 7){
				m.i18n();
				Main.main(args);
			}
			

		
				throw new MyException(scannerForMain);
			}
		
		 catch (MyException l) {
			
		}}
	}
		
	
	/**
	 * selection by freshness
	 * 
	 * @param flower
	 * @throws Exception 
	 * @throws MyException 
	 */

	
	
	public void i18n() throws MyException, Exception{
	
		int scanneri18n;
		System.out.println(rb.getString("s18"));
		System.out.println(rb.getString("s19"));
		scanneri18n = scanner.nextInt();
		if (scanneri18n == 1) {
			current=locale1;
	  rb = ResourceBundle.getBundle("resource.MessageBundle", locale1);	
		}
		else if(scanneri18n == 2){
			current=locale2;
	  rb = ResourceBundle.getBundle("resource.MessageBundle", locale2);
		}
	}
	
	public  void swechest(ArrayList<Flowers> flower) {
			
		int Scannerforswechtes;
		System.out.println(rb.getString("s8"));
		Scannerforswechtes = scanner.nextInt();
		for (Flowers o : flower) {
			if (o.swechest >= Scannerforswechtes) {
				System.out.println(o.toString());
			}
		}
	}

	/**
	 * selection by dlinnaSteblij
	 * 
	 * @param flower
	 */
	public  void diapazon(ArrayList<Flowers> flower) {
		int variableScannerfordowndlinnaSteblij, variableScannerforhighdlinnaSteblij;
		System.out.println(rb.getString("s9"));
		variableScannerfordowndlinnaSteblij = scanner.nextInt();
		System.out.println(rb.getString("s10"));
		variableScannerforhighdlinnaSteblij = scanner.nextInt();
		for (Flowers o : flower) {
			if (o.dlinnaSteblij > variableScannerfordowndlinnaSteblij
					& o.dlinnaSteblij < variableScannerforhighdlinnaSteblij) {
				System.out.println(o.toString());
			}
		}
	}

	/**
	 * add accessories
	 * 
	 * @param flower
	 */
	public  void aksesuar(ArrayList<Flowers> flower) {
		int Scannerforaksesuar;
		int firstprice = 0;
		System.out.println(rb.getString("s11"));
		System.out.println(rb.getString("s12"));
		System.out.println(rb.getString("s13"));
		ArrayList<Aksesuar> floweraksesuar = new ArrayList<Aksesuar>();
		Aksesuar aksesuar1 = new Aksesuar("Bumaga", 3);
		Aksesuar aksesuar2 = new Aksesuar("Lentochka", 2);
		Aksesuar aksesuar3 = new Aksesuar("Blestki", 1);
		Scannerforaksesuar = scanner.nextInt();
		if (Scannerforaksesuar == 1) {

			floweraksesuar.add(aksesuar1);
			for (Flowers o : flower) {

				firstprice = firstprice + o.getPrice();
			}
			int t = aksesuar1.getPrice();
			firstprice += t;

			System.out.println(rb.getString("s14") + firstprice + "������");

		} else if (Scannerforaksesuar == 2) {

			floweraksesuar.add(aksesuar2);
			for (Flowers o : flower) {

				firstprice = firstprice + o.getPrice();
			}
			int t = aksesuar2.getPrice();
			firstprice += t;
			System.out.println(rb.getString("s14") + firstprice + "������");

		} else if (Scannerforaksesuar == 3) {

			floweraksesuar.add(aksesuar3);
			for (Flowers o : flower) {

				firstprice = firstprice + o.getPrice();
			}
			int t = aksesuar3.getPrice();
			firstprice += t;
			System.out.println(rb.getString("s14") + firstprice + "������");

		}
	}

	/**
	 * Serializabl collection
	 * 
	 * @param flower
	 * @throws IOException
	 */
	public  void write(ArrayList<Flowers> flower) throws IOException {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Infa.txt"));

			out.writeObject(flower);
			out.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(rb.getString("s15"));
	}

	/**
	 * Unserializabl collection
	 * 
	 * @param flower
	 * @throws IOException
	 */
	public  void read(ArrayList<Flowers> flower) throws IOException {
		ArrayList<Flowers> newflowerslist = null;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Infa.txt"))) {
			newflowerslist = (ArrayList<Flowers>) ois.readObject();
			ois.close();
		} catch (Exception ex) {

			System.out.println(ex.getMessage());
		}

		System.out.println(rb.getString("s16") + newflowerslist);
	}

	/**
	 * look Price Collection
	 * 
	 * @param flower
	 */
	public  void cena(ArrayList<Flowers> flower) {
		int firstprice = 0;
		for (Flowers o : flower) {

			firstprice = firstprice + o.getPrice();
		}
		System.out.println(rb.getString("s16") + firstprice + "������.");

	}

}
