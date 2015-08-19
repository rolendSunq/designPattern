package chain_of_resposibility.part1;
/**
 * 전문가들이 풀어야할 문제 클래스
 * @author 삼실청년
 *
 */
public class Problem {
	private String problemName;

	/** Constructor
	 * 전문가들이 풀어야 될 문제를 문자열로 설정한다.
	 * @param name
	 */
	public Problem(String problemName) {
		this.problemName = problemName;
	}

	public String getProblemName() {
		return problemName;
	}
}
