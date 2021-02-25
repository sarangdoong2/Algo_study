package feb_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_7568 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());	//5명
		
		int[][] rank = new int[n][2];	// 키, 몸무게 담을 배열 생성
		
		String[] str;
		for(int i = 0; i < n; i++) {
	
			str = br.readLine().split(" ");
			rank[i][0] = Integer.parseInt(str[0]);	//키
			rank[i][1] = Integer.parseInt(str[1]);	//몸무게
						
		}


		for(int i = 0; i < n; i++) {	
			int num = 1;
			for(int j = 0; j < n; j++) {
				if(rank[i][0] < rank[j][0] && rank[i][1] < rank[j][1])	num++;
				if(i == j) continue;
			}
			System.out.print(num + " ");			
		}


	}

}
