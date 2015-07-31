package memento.part2;

public class Memento {
	private String name;
	private StringBuilder content;

	public Memento(String name, StringBuilder content) {
		this.name = name;
		this.content = content;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the content
	 */
	public StringBuilder getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(StringBuilder content) {
		this.content = content;
	}

}
