package memento.part2;

public class Memento2Main {

	public static void main(String[] args) {
		FileWriterCaretaker<Memento> caretaker = new FileWriterCaretaker<Memento>();

		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter + "\n\n");

		// ������ ������ �� �ִ�.
		caretaker.save(fileWriter);
		// ���Ͽ� ���� ����.
		fileWriter.write("Second Set of Data\n");

		// ������ �������� �˻��Ѵ�.
		System.out.println(fileWriter + "\n\n");

		// ������ ���� �۾����� �ǵ�����.
		caretaker.undo(fileWriter);

		// ������ �������� �˻��Ѵ�.
		System.out.println(fileWriter + "\n\n");
	}

}
