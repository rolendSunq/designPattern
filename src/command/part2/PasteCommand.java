package command.part2;

public class PasteCommand<T> extends AbstractCommand<T> {
	private Document document;
	private int position;
	private String pasteString;

	@SuppressWarnings("unchecked")
	public PasteCommand(Document document, int position) {
		this.document = document;
		this.position = position;
		commandManager.executeCommand(this);
	}

	@Override
	public boolean execute() {
		try {
			document.insertStringCommand(position, pasteString);
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean undo() {
		try {
			document.deleteStringCommand(position, pasteString.length());
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

}
