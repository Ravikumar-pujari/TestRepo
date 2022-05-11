package javapackage;

public class Encapsulate4 {
	
	private int registerNum;
	private String Name;
	
	Encapsulate4(int registerNum, String Name) {
		this.registerNum= registerNum;
		this.Name = Name; 
	}
	
	public int getNum() {
		System.out.println("hi");
		return registerNum;	
		
	}
	
	public void setNum(int registerNum) {
        this.registerNum= registerNum;
	}
    
	public String getName() {
		return Name;	
	}
	
	public void setName (String Name) {
     this.Name = Name;
	}
	
	public void set(int registerNum, String Name) {
	
	}
}
