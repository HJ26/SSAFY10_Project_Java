package fit.ui;

import fit.test.SsafitApplication;
import fit.util.*;

public class MainUi {
	

	public void service() {
		
		int menu;
		VideoUi videoUi = VideoUi.getInstance();		
		SsafitUtil.printLine();
		SsafitUtil.printLine("1.영상정보 ");
		SsafitUtil.printLine("0.종료 ");
		SsafitUtil.printLine();
		menu = SsafitUtil.inputInt("메뉴를 선택하세요: ");
		
		if(menu == 1) {
			videoUi.service();
		} else {
			exit();
		}
	}
	
	private void exit() {
		SsafitUtil.screenClear();
	}
	
}
