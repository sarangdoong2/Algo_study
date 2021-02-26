package feb_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine(), " ");
		
		// a -> up b -> down v -> hight && a>b
		
		int up = Integer.parseInt(str.nextToken());
		int down = Integer.parseInt(str.nextToken());
		int hight = Integer.parseInt(str.nextToken());
		
		int day = (hight - down) / (up - down);		// -> day - 0부터라고 가정 사실상 올라간 길이 -> h-d
		
		if(((hight - down) % (up - down)) != 0) day++;

		System.out.println(day);
	}

}
