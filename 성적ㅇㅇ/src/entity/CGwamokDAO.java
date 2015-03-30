package entity;


import java.io.FileOutputStream;


public class CGwamokDAO {
	public CGwamok read(){return null;}
	public void write (CGwamok gwamok){
		System.out.println("과목ID:"+gwamok.getID());
		System.out.println(",과목명:"+gwamok.getName());
		//serialize
		try {
			ObjectOutputStream out =
					new ObjectOutputStream(new FileOutputStream("GWAMOK"));
			out.writeObject(gwamok);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	
	
}
	