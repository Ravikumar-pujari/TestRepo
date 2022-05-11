package javapackage;

public class SumofN_numbers {

	int x = 10, sum = 0, count = 1;

	public void sum() {
		if (count <= x) {
			sum = sum + count;        //1,3,6,10,15,21,28
			System.out.println(sum);
			count++;                  //2,3,4,5,6,7
			System.out.println(count);
		}
		if (count != (x + 1)) {
			sum();      
		}
	}

	public static void main(String[] args) {
		SumofN_numbers n = new SumofN_numbers();
		n.sum();
      System.out.println("addition of numbers "+ n.sum);
	}
}
