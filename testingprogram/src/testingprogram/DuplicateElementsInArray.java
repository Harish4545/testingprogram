package testingprogram;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int arr[]={1,5,4,7,8,3,6,3};

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if (arr[i]==arr[j]) 
					System.out.println(arr[j]);
				}
			}
		}
	}

