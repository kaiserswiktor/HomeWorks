package command;

public class StopComputer extends CommandComp {

	public StopComputer(Comp computer) {
		super(computer);
	}

	@Override
	public void execute() {
		computer.stop();
	}

}
