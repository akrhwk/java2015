package entity;


public class CMemberDAO {
	//Data Access Object:or write data from persistance storage
	public CMember read(){return null;}
	public void write (CMember member){
		System.out.println("�����ID:"+member.getUserID());
		System.out.println(",��й�ȣ:"+member.getPassword());
	};
	

}
