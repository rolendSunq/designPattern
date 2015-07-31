package memento.part2;

public class FileWriterUtil {
	private String fileName;
	private StringBuilder content;

	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		content = new StringBuilder();
	}

	public void write(String str) {
		content.append(str);
	}

	public Memento save() {
		return new Memento(fileName, content);
	}

	public <T> void undoToLastSave(T t) {
		Memento memento = (Memento) t;
		fileName = memento.getName();
		content = memento.getContent();
	}
	
	@Override
	public String toString() {
		return content.toString();
	}

}
