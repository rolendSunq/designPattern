package chain_of_responsibility.part1;

public class Casanova extends Expert {
	/** default Constructor
	 * Expert�� ��� ������ expertName�� ���� �����Ѵ�.
	 */
	public Casanova() {
		expertName = "ī����";
	}

	@Override
	protected boolean solve(Problem problem) {
		return problem.getProblemName().contains("����") || problem.getProblemName().contains("����");
	}
}
