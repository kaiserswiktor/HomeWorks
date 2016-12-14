package command;

public class Main {

	public static void main(String[] args) {
	 Comp c=new Comp();
	 User u=new User(new StartComputer(c), new StopComputer(c), new ResetComputer(c));
      u.startComputer();
      u.stopComputer();
     // u.resettComputer();
      
	}

}
