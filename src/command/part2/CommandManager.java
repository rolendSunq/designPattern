package command.part2;

import java.util.LinkedList;

public class CommandManager<T> {
	private static final int MAX_HISTORY_LENGTH;
	private LinkedList<T> history;
	private LinkedList<T> redoList;

	static {
		MAX_HISTORY_LENGTH = 50;
	}

	public CommandManager() {
		history = new LinkedList<T>();
		redoList = new LinkedList<T>();
	}

	public void executeCommand(AbstractCommand<T> command) {
		if (command instanceof Undo) {
			undo();
			return;
		}

		if (command instanceof Redo) {
			redo();
			return;
		}

		if (command.execute()) {
			addToHistory(command);
		} else {
			System.out.println("존재하지 않는 명령어 입니다.");
		}
	}

	@SuppressWarnings("unchecked")
	private void addToHistory(AbstractCommand<T> command) {
		history.addFirst((T) command);
		if (history.size() > MAX_HISTORY_LENGTH)
			history.removeLast();
	}

	@SuppressWarnings("unchecked")
	private void redo() {
		if (redoList.size() > 0) {
			AbstractCommand<T> redoCommand = (AbstractCommand<T>) redoList.removeLast();
			redoCommand.execute();
			history.addFirst((T) redoCommand);
		}
	}

	@SuppressWarnings("unchecked")
	private void undo() {
		if (history.size() > 0) { // 사용자가 실행한 명령어가 있을 경우
			AbstractCommand<T> undoCommand = (AbstractCommand<T>) history.removeFirst();
			undoCommand.undo();
			redoList.addFirst((T) undoCommand);
		}
	}

}
