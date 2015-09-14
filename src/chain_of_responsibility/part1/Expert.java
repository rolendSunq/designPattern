package chain_of_responsibility.part1;

public abstract class Expert {
	private Expert next;
	protected String expertName;

	// support 메소드의 final은 override를 못하게 한다. Expert의 계층 구조에서 support는 override가 금지된다.
	public final void support(Problem problem) {
		if (solve(problem)) {
			System.out.println(expertName + "이(가) " + problem.getProblemName() + "을(를) 해결해 버렸네.");
		} else {
			if (next != null) {
				next.support(problem);
			} else {
				System.out.println(problem.getProblemName() + "은(는) 해결할 넘이 없다.");
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
	 * Export 계층 구조에서 Export의 하위 클래스는 solve 메소드를 정의 하도록 했다.           
	 * 각 각의 전문가를 구현하도록 하기 위함이다.                                       
                                                               
	 * @param Problem problem
	 * 
	 * @return boolean
	 */
	protected abstract boolean solve(Problem problem);
}
