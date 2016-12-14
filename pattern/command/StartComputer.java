package command;

public class StartComputer extends CommandComp {
	
	public StartComputer(Comp computer) {
		super(computer);
	}

	public void execute() {
		computer.start();
	}

}
