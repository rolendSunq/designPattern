package command.part2;

public abstract class AbstractCommand<T> {
	/**
	 *  static 으로 지정된 이유는 
	 *  Invoker가 단순히 ConcreteCommand 클래스의 인스턴스를 생성만 하면 되도록 하기 위해서이다.
	 *  서로 공유하기 위함. 
	 */
	public final static CommandManager commandManager = new CommandManager();

	/**
	 * 이 객체가 캡슐화하고 있는 명령을 수행하며 명령을 성공하면 true 실패하면 false를 반환한다.
	 * 
	 * @return {@link Boolean}
	 */
	public abstract boolean execute();

	/**
	 * execute()를 통해서 수행된 작업을 취소 성공하면 true 실패하면 false를 반환한다.
	 * 
	 * @return {@link Boolean}
	 */
	public abstract boolean undo();
}
