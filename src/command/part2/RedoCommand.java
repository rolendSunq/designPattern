package command.part2;

public class RedoCommand<T> extends AbstractCommand<T>implements Redo {

	@Override
	public boolean execute() {
		return false;
	}

	@Override
	public boolean undo() {
		return false;
	}

}
