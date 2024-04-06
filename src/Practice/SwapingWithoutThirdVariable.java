package Practice;

public class SwapingWithoutThirdVariable {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		System.out.println("before swaping \n A="+a+"\n B="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping \n A="+a+"\n B="+b);

	}

}
