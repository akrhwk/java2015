package 성적처리v0;

import view.CGwamokView;
import view.CLoginView;
import control.CGwamokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGangjwaDAO;
import entity.CGwamok;
import entity.CGwamokDAO;
import entity.CMember;
import entity.CMemberDAO;

public class CMain {

	public static void main(String[] args) {
	
//login
		CLoginView loginView =new CLoginView();
		CMember member=loginView.login();
		CLoginControl loginControl=new CLoginControl();
		member=loginControl.login(member);
		CMemberDAO memberDAO=new CMemberDAO();
		memberDAO.write(member);
		
		//과목개설
		CGwamokView gwamokView =new CGwamokView();
		CGwamok gwamok=gwamokView.getGwamok();
		CGwamokControl gwamokControl =new CGwamokControl();
		gwamok=gwamokControl.processGwamok(gwamok);
		CGwamokDAO gwamokDAO=new CGwamokDAO();
		gwamokDAO.write(gwamok);
		//강좌개설
		CGangjwaView GangjwaView =new CGangjwaView();
		CGangjwa Gangjwa=GangjwaView.getGangjwa();
		CGangjwaControl GangjwaControl =new CGangjwaControl();
		Gangjwa=GangjwaControl.processGangjwa(Gangjwa);
				
		CGangjwaDAO GangjwaDAO=new CGangjwaDAO();
		GangjwaDAO.write(Gangjwa);


	}

}
