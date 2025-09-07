package oops;

public class ScopePassBy {
	
	public static void post(int a, int b) {
		
		System.out.println("Output: "+ a++ +" "+ b++);// after print it 
// incresed
		System.out.println(a + " " + b);
	}
		
	public static void pre(int a , int b) {
		
		System.out.println("Output: " + ++a + " " + ++b);// first increment 
// then its prined 
		System.out.println(a + " " + b);
		
	}
	
	public static void main(String[] args){
		
		
		// Primitive Datatypes
		int x = 3;
		int y = 4;
		System.out.println("Before the call: " + x + " " + y);
		post(y,x);// in the value of x , y are copied to
//		new memory and then function is called 
		System.out.println("After the call: " + x + " " + y);
		
		int e = 34;
		int f = 45;
		System.out.println("Before the call: " + e + " " + f);
		post(e,f);// in the value of x , y are copied to
//		new memory and then function is called 
		System.out.println("After the call: " + e + " " + f);
		
		
		// Non-Primitives Datatypes
		int[] arr = {1,2,3,4};
		System.out.println("Before the updation: ");
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] ++;
			System.out.println(arr[i]);
		}
		
		System.out.println("After the updation: ");
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] ++;
			System.out.println(arr[i]);
		}
		
		
		
	}
	
}
