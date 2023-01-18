package Start;

public class Array {
	
	public static void main(String[] args) {
		int arr[] = {10,40,35,69,15,60};
		
		
		for(int i=0;i<arr.length;i++)
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
		
		}
		for(int i=0;i<arr.length;i++)
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			
			}
		
	}
}
