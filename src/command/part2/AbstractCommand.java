package command.part2;

public abstract class AbstractCommand<T> {
	/**
	 *  static ���� ������ ������ 
	 *  Invoker�� �ܼ��� ConcreteCommand Ŭ������ �ν��Ͻ��� ������ �ϸ� �ǵ��� �ϱ� ���ؼ��̴�.
	 *  ���� �����ϱ� ����. 
	 */
	public final static CommandManager commandManager = new CommandManager();

	/**
	 * �� ��ü�� ĸ��ȭ�ϰ� �ִ� ����� �����ϸ� ����� �����ϸ� true �����ϸ� false�� ��ȯ�Ѵ�.
	 * 
	 * @return {@link Boolean}
	 */
	public abstract boolean execute();

	/**
	 * execute()�� ���ؼ� ����� �۾��� ��� �����ϸ� true �����ϸ� false�� ��ȯ�Ѵ�.
	 * 
	 * @return {@link Boolean}
	 */
	public abstract boolean undo();
}
