package chain_of_resposibility.part1;

public class Fighter extends Expert {

	/** Default Constructor
	 * ������ Ŭ���� "������" ���ڿ��� �����Ѵ�.
	 */
	public Fighter() {
		this.expertName = "������";
	}
	
	@Override
	protected boolean solve(Problem problem) {
		return problem.getProblemName().contains("����");
	}

}
