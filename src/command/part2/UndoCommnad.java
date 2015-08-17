package command.part2;

public class UndoCommnad<T> extends AbstractCommand<T>implements Undo {

	@Override
	public boolean execute() {
		return false;
	}

	@Override
	public boolean undo() {
		return false;
	}

}
