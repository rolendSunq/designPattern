package chain_of_responsibility.part1;

public abstract class Expert {
	private Expert next;
	protected String expertName;

	// support �޼ҵ��� final�� override�� ���ϰ� �Ѵ�. Expert�� ���� �������� support�� override�� �����ȴ�.
	public final void support(Problem problem) {
		if (solve(problem)) {
			System.out.println(expertName + "��(��) " + problem.getProblemName() + "��(��) �ذ��� ���ȳ�.");
		} else {
			if (next != null) {
				next.support(problem);
			} else {
				System.out.println(problem.getProblemName() + "��(��) �ذ��� ���� ����.");
			}
		}
	}

	public Expert next(Expert expert) {
		this.next = expert;
		return expert;
	}

	/**
	 * @return the next
	 */
	public Expert getNext() {
		return next;
	}
	
	/**
	 *                                                                
	 * Export ���� �������� Export�� ���� Ŭ������ solve �޼ҵ带 ���� �ϵ��� �ߴ�.           
	 * �� ���� �������� �����ϵ��� �ϱ� �����̴�.                                       
                                                               
	 * @param Problem problem
	 * 
	 * @return boolean
	 */
	protected abstract boolean solve(Problem problem);
}
