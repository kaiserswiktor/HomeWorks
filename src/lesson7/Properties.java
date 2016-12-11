package lesson7;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
public class Properties {
private static final String FILENAME = "resources/LabelsBundle";
	
	static public void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		//Locale locale = new Locale("be","BY");
		Locale locale1 = new Locale("ru","RU");
		Locale locale2 = new Locale("en","EN");
		
		
		
		
		/*Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		System.out.println(df.format(currentDate));*/
		
		
		
		/*Collator collator = Collator.getInstance(locale);
		System.out.println(collator.compare("abc", "def"));*/




		
		System.out.println(locale1.getLanguage());
		System.out.println(locale1.getCountry());
		System.out.println(locale1.getDisplayName());

		Locale[] supportedLocales = { 
				Locale.GERMAN, 
				Locale.ENGLISH,
		};
		
		for (int i = 0; i < supportedLocales.length; i++) {
			displayValue(supportedLocales[i], "s2");
		}

		System.out.println();

		iterateKeys(supportedLocales[0]);

	} 

	static void displayValue(Locale currentLocale, String key) {

		ResourceBundle labels = ResourceBundle.getBundle("MessageBundle", currentLocale);
		String value = labels.getString(key);
		System.out.println("Locale = " + currentLocale.toString() + ", " + "key = " + key + ", " + "value = " + value);

	} 

	static void iterateKeys(Locale currentLocale) {

		ResourceBundle labels = ResourceBundle.getBundle(FILENAME, currentLocale);

		Enumeration<String> bundleKeys = labels.getKeys();

		while (bundleKeys.hasMoreElements()) {
			String key = (String) bundleKeys.nextElement();
			String value = labels.getString(key);
			System.out.println("key = " + key + ", " + "value = " + value);
		}

	} 
}
