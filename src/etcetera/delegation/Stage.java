package etcetera.delegation;

public class Stage {
	private Foo foo = new Foo();

	public void change() {
		foo = new Boo();
	}

	public void play() {
		foo.aPlayer();
	}
}
