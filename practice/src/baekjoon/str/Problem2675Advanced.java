package baekjoon.str;

public class Problem2675Advanced {

	public static void main(String[] args) {
		/**
		 * 개선 포인트
		 * 	
			1. newStr += ...는 비효율적
				- 문자열 덧셈(+=)은 내부적으로 매번 새로운 문자열을 생성하므로 성능이 나쁩니다.
			    → StringBuilder 사용이 훨씬 효율적입니다. (문자열 누적 성능이 좋음)
			2. str.substring(j, j+1)은 charAt(j)로 바꾸는 게 더 직관적
				- substring(j, j+1)은 부분 문자열 추출이지만 여기서는 문자 하나이므로 charAt()이 더 적절합니다.
			3. 변수명 간소화 및 가독성 개선
			
		 * 
		 */
	}
}
