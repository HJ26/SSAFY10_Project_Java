package fit.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import com.google.gson.Gson;


public class Parsing {

	public static void main(String[] args) throws IOException {
		// 파싱해오기
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/video.json")));
		StringBuilder sb = new StringBuilder();
		String str = null;
		while((str = br.readLine()) != null) {
			sb.append(str).append("\n"); // sb에 문자열이 모여있음
		}
		
		Gson gson = new Gson();
		Video[] arr = gson.fromJson(sb.toString(), Video[].class);
		System.out.println(Arrays.toString(arr));
		
		
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("data/video-new.json)));
//		String str2 = gson.toJson(arr);
//		bw.write(str2);
//		bw.close();
	}

}
