import java.util.Scanner;

public class Calculator {
	
	public Calculator(){
	  }
	
	public void display() {
		System.out.println("Welcome to my Calculator");
		System.out.println("Select the Operation");
		System.out.println("Press 1: For Addition");
		System.out.println("Press 2: For Subtraction");
		System.out.println("Press 3: For Multiplication");
		System.out.println("Press 4: For Division");
		System.out.println("Press 5: For Modulus Operation");
	}
	
	 public int add(int a,int b){
		    int sum = a+b;
		  System.out.println(sum);
		  return sum;
		  }
	 
	 public int sub(int a , int b){
		    int sub = a-b;
		    System.out.println(sub);
		    return sub;
		  }
	 
	 public int mul(int a , int b){
		    int mul = a*b;
		    System.out.println(mul);
		    return mul;
		  }
	 
	 public int div(int a , int b){
		    int div = a/b;
		    System.out.println(div);
		    return div;
		  }
	 
	 public int mod(int a , int b){
		    int mod = a%b;
		    System.out.println(mod);
		    return mod;
		  }
	public static void main(String[] args) 
	{
		
			  Calculator myCalculator = new Calculator();
			  myCalculator.display();
		        int n = 0;
			    Scanner sc = new Scanner(System.in);
			    n = sc.nextInt();
			    switch (n) {
			    case 1:
			    	int add1 = 0; int add2 =0;
			    	System.out.println("Enter two values to Add");
			    	add1 = sc.nextInt();
			    	add2 = sc.nextInt();
			    	myCalculator.add(add1,add2);
			    	break;
			    case 2:
			    	int sub1 = 0; int sub2 =0;
			    	System.out.println("Enter two values to Subtract");
			    	sub1 = sc.nextInt();
			    	sub2 = sc.nextInt();
			    	myCalculator.sub(sub1, sub2);
			    	break;
			    case 3:
			    	int mul1 = 0; int mul2 =0;
			    	System.out.println("Enter two values to Multiply");
			    	mul1 = sc.nextInt();
			    	mul2 = sc.nextInt();
			    	myCalculator.mul(mul1, mul2);
			    	break;
			    case 4:
			    	int div1 = 0; int div2 =0;
			    	System.out.println("Enter two values to Divide");
			    	div1 = sc.nextInt();
			    	div2 = sc.nextInt();
			    	myCalculator.div(div1 , div2);
			    	break;
			    case 5:
			    	int mod1 = 0; int mod2 =0;
			    	System.out.println("Enter two values to Modulus");
			    	mul1 = sc.nextInt();
			    	mul2 = sc.nextInt();
			    	myCalculator.mod(mod1, mod2);
			    	break;
			    default:
					System.out.println("No Match");
			    }
	}
}
