class Question50 {
	public static void main(String[] args) {
		// 50. Write a program to find the majority element in an array.
		int[] arr = {1, 1, 2, 1, 3, 5, 1};
		
		boolean find = false;
		int n = arr.length; 
		for (int i = 0; i < n; i++) 
		{
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > n / 2) 
			{
				System.out.println("the majority element is " + arr[i]);
				find = true;
				break;
			}
		}
		if(find == false)
		{
			System.out.println("There is no the majority element");
		}
	}
}