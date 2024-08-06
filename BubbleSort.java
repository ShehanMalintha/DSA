package Example;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {20, 10, 30, 50, 40};
		int length = arr.length;
		System.out.print("unsorted array :");
		for(int i=0;i<length;i++)
			System.out.print(arr[i] + " ");
		
		for(int i=0;i<length;i++) {
			for(int j=1;j<length-i;j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Sorted array :");
		for(int i=0;i<length;i++)
			System.out.print(arr[i] + " ");

	}

}
