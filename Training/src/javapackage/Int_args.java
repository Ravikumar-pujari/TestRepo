package javapackage;

public class Int_args {
	public int m1(int x) {
		if (x==0) {
		return x;}
		return m1(x-1)+x; 
	}

	public static void main(String[] args) {
		Int_args d = new Int_args();
		System.out.println(d.m1(3));

	}

}
