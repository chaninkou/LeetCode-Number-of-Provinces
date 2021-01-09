package leetcode547;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[][] M = {{1,1,0}, {1,1,0}, {0,0,1}};
		
		System.out.println("M: " + Arrays.deepToString(M));
		
		FindNumberOfProvinces solution = new FindNumberOfProvinces();
		
		System.out.println("Solution: " + solution.findCircleNum(M));
	}
}
