package feb_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class baekjoon_1436{

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int t = 666, cnt = 1;
		
		while(cnt != n) {
			t++;
			if(String.valueOf(t).contains("666")) {
				cnt++;
			}
			
		}
		System.out.println(t);

	}

}
