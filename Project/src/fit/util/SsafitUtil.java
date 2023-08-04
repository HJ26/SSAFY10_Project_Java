package fit.util;

import java.util.Scanner;

public class SsafitUtil {
	private static Scanner sc = new Scanner(System.in);
	
	private SsafitUtil() {
		
	}
	
	public static String input(String msg) {
		return null;
	}

	public static int inputInt(String msg) {
		System.out.print(msg);
		int n = sc.nextInt();
		return n;
	}
	public static void printLine() {
		System.out.println("------------------------------------------------");
	}
	
	public static void printLine(String str) {
		System.out.println(str);
	}
	
	public static void printLine(String str, int len) {
		
	}
	
	public static void screenClear() {
		for(int i = 0; i < 50; i++) {
			System.out.println("\n");
		}
	}
}
