package memento.part2;

public class FileWriterCaretaker<T> {
	private T t;
	
	@SuppressWarnings("unchecked")
	public void save(FileWriterUtil fileWriterUtil) {
		t = (T) fileWriterUtil.save();
	}
	
	public void undo(FileWriterUtil fileWriterUtil) {
		fileWriterUtil.undoToLastSave(t);
	}
}
