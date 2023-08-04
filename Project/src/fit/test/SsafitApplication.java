package fit.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;

import fit.model.Video;
import fit.ui.*;
import fit.util.SsafitUtil;

public class SsafitApplication {

	public static void main(String[] args) throws IOException {
		
		MainUi main = new MainUi();
		
		
		SsafitUtil.printLine();
		SsafitUtil.printLine("자바로 구현하는 SSAFIT");
		SsafitUtil.printLine();
		
		main.service();
		
	}

}
