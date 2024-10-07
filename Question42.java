class Question42 {
	public static void main(String[] args) 
	{
		// 42. Write a program to swap two numbers without using a third variable. 
		int a = 2;
		int b = 3;
		System.out.println("a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + ", b = " + b);
		
	}
}