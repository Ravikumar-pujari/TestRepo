package javapackage;

public class New {

	public static void main(String[] args) {
		
		try {
			int a = 5/0;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		};
         
	}

}
