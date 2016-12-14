package command;

public class ResetComputer extends CommandComp {

	public ResetComputer(Comp computer) {
		super(computer);

	}

	@Override
	public void execute() {
		computer.reset();
	}

}
