package javapackage;

      public class Inheritance8 extends Inheritance7 {

	
		Inheritance8(int x) {
			super(x);
			System.out.println("Inheritance8 const");
		}



		public void check() {
			System.out.println(x);
			m4();
		}
		
		
		
		public static void main(String[] args) {
			Inheritance8 i8 = new Inheritance8(1);
			i8.check();
	}

}
