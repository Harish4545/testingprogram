package testingprogram;

public class SubArrayWithGivenSum {


	public static void main(String[] args)
	{
		
		int arr[] = {12,5,8,7,33,5};
		int n=arr.length;
		int sum=20;
		
		  subarray(arr,n,sum);
	}

	private static void subarray(int[] arr, int n, int sum) {

		for (int i = 0; i < n; i++) {
			
			int sum1=arr[i];
			
			if (sum1==sum) {
				System.out.println("the sum at the position "+i);
			} 
			
			else {

				for (int j = i+1; j < n; j++) {
					sum1=sum1+arr[j];
					
					if (sum1==sum) {
						System.out.println("sum find bw indexes "+i+" and "+j);
					}
				}
			}
			
		}
		
	}
}

