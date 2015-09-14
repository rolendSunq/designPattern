package chain_of_responsibility.part1;

public class Casanova extends Expert {
	/** default Constructor
	 * Expert의 멤버 변수인 expertName에 값을 설정한다.
	 */
	public Casanova() {
		expertName = "카사노바";
	}

	@Override
	protected boolean solve(Problem problem) {
		return problem.getProblemName().contains("여자") || problem.getProblemName().contains("여성");
	}
}
