package memento.part2;

public class Memento2Main {

	public static void main(String[] args) {
		FileWriterCaretaker<Memento> caretaker = new FileWriterCaretaker<Memento>();

		FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
		fileWriter.write("First Set of Data\n");
		System.out.println(fileWriter + "\n\n");

		// 파일을 저장할 수 있다.
		caretaker.save(fileWriter);
		// 파일에 무언가 쓴다.
		fileWriter.write("Second Set of Data\n");

		// 파일의 컨텐츠를 검사한다.
		System.out.println(fileWriter + "\n\n");

		// 파일의 이전 작업으로 되돌린다.
		caretaker.undo(fileWriter);

		// 파일의 컨텐츠를 검사한다.
		System.out.println(fileWriter + "\n\n");
	}

}
