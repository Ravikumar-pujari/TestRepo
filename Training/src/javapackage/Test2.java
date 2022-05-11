package javapackage;

public class Test2 {

	public static void main(String[] args) {
		int i=2;
		while(makeDecision(i))  {

		i=i*i;
		System.out.println(i);  }
	}

		public static boolean makeDecision(int i) {
			System.out.println(i);
		if(i%3 != 0){   return true;   }
		else        {   return false;  }           }
	}


