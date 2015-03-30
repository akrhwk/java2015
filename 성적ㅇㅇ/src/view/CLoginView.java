package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	//private String userID,password;

	public CMember  login() {
		Scanner scanner=new Scanner(System.in);
		
		//Input from keyboard
		CMember member=new CMember();
		System.out.println("사용자 아이디를 입력하세요.: ");
		String userID=scanner.next();
		member.setUserID("userID");
		
		System.out.println("비밀번호 를 입력하세요.: ");
		String password=scanner.next();
		member.setPassword("password");
		
		//close scannser
		scanner.close();
		return member;
	}

}
