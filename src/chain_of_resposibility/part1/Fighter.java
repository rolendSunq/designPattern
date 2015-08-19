package chain_of_resposibility.part1;

public class Fighter extends Expert {

	/** Default Constructor
	 * 격투가 클래스 "격투가" 문자열로 설정한다.
	 */
	public Fighter() {
		this.expertName = "격투가";
	}
	
	@Override
	protected boolean solve(Problem problem) {
		return problem.getProblemName().contains("깡패");
	}

}
