package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView {
	//private String userID,password;

	public CMember  login() {
		Scanner scanner=new Scanner(System.in);
		
		//Input from keyboard
		CMember member=new CMember();
		System.out.println("����� ���̵� �Է��ϼ���.: ");
		String userID=scanner.next();
		member.setUserID("userID");
		
		System.out.println("��й�ȣ �� �Է��ϼ���.: ");
		String password=scanner.next();
		member.setPassword("password");
		
		//close scannser
		scanner.close();
		return member;
	}

}
