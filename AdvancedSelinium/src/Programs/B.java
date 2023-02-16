package Programs;

public class B extends PalindromeSeries {

	
	 public void display() {
		 
		 System.out.println("Overloading method");
	 }
	 public static void main(String[] args) {
		 PalindromeSeries p = new B();
		 p.display();
		 
	}
}
