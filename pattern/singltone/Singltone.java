package singltone;

public class Singltone {
private static  Singltone instance;

private Singltone(){
	
}
public static synchronized Singltone getInstance(){
	if(instance==null){
		instance=new Singltone();
	}
	return instance;
}
}
