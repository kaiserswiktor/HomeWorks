package command;

public class User {
Command start;
Command stop;
Command reset;
User(Command start,Command stop,Command reset){
	this.start=start;
	this.stop=stop;
	this.reset=reset;	
}
void startComputer(){
	start.execute();
}
void stopComputer(){
	stop.execute();
}
void resettComputer(){
	reset.execute();
}
}
