package lesson7;

	public class Singltone {
	    private static volatile Singltone instance;

	    private Singltone() {}
	    
	    public static Singltone getInstance() {
	        Singltone localInstance = instance;
	        if (localInstance == null) {
	            synchronized (Singltone.class) {
	                localInstance = instance;
	                if (localInstance == null) {
	                    instance = localInstance = new Singltone();
	                }
	            }
	        }
	        return localInstance;
	    }
	}

