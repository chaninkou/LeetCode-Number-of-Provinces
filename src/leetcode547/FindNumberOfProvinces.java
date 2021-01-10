package leetcode547;

public class FindNumberOfProvinces {
	public int findCircleNum(int[][] M) {
		boolean[] visited = new boolean[M.length];

		int totalProvinces = 0;

		for (int i = 0; i < M.length; i++) {
			if (!visited[i]) {
				dfs(M, visited, i);
				totalProvinces++;
			}
		}

		return totalProvinces;
	}

	private void dfs(int[][] M, boolean[] visited, int person) {
		for (int other = 0; other < M.length; other++) {
			if (M[person][other] == 1 && !visited[other]) {
				visited[other] = true;
				dfs(M, visited, other);
			}
		}
	}
}
