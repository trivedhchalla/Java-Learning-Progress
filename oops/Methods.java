package oops;
import java.util.Scanner;

class Algebra {
	Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
	public Algebra() {
	
		System.out.println("Number 1:");
		this.num1 = sc.nextInt();
		System.out.println("NUmber 2:");
		this.num2 = sc.nextInt();
//		sc.close();
	}
	
	public int algebra() {
		int ans;
		System.out.println("Choosse : 1/2/3/4 for add/sub/mul/div");
		int choice = sc.nextInt();
		sc.close();
		switch(choice) {
		case 1:
			ans = this.num1 + this.num2;
//			sc.close();
			return ans;
		case 2:
			ans = this.num1 - this.num2;
//			sc.close();
			return ans;
		case 3:
			ans = this.num1 * this.num2;
//			sc.close();
			return ans;
		case 4:
			ans = this.num1 % this.num2;
//			sc.close();
			return ans;
		default:
			System.out.println("In valid");
//			sc.close();
			return this.algebra();
		}
	}
}

public class Methods {
	
	public static void main(String[] args) {
		
		Algebra a = new Algebra();
		System.out.println("Output:"+a.algebra());
		
//		System.out.println(Math.sqrt(24));
//		System.out.println(Math.sqrt(25));
//		
//		System.out.println(Math.ceil(1.3));
//		System.out.println(Math.sqrt(1));
//		
//		System.out.println(Math.floor(1.3));
//		System.out.println(Math.floor(2));

	}
}














