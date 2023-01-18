package Start;

//sorting an array without using Arrays.sort method

public class ArraySort2 {

	public static void main(String[] args) {

		int[] arr = new int[] { 1,5,3,4,2,-4,-2,-3 };

		System.out.println("Array elements after sorting:");

		for (int i = 0; i < arr.length; i++) // i=0
		{
			for (int j = i + 1; j < arr.length; j++) // j=1
			{
				int tmp = 0;

				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(arr[i]);
		}
	}

}
