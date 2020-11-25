
public class insertSort {
	
	public static void main(String[]args) {
		int[] a= {3,1,3,5,1,2,3,1,1,1,1,2,3,4,5,6,8};
		new insertSort(a);
	}
	
	public insertSort(int[]arr) {
			int note,i,j;
			for(i=1;i<arr.length;i++) {
				j=i-1;
				note=arr[i];
				while(j>=0&&note<arr[j]) {
					arr[j+1]=arr[j];
					j--;
					}
				arr[j+1]=note;
				
				}
			
			for(int arr1:arr) {
				System.out.print(arr1+" ");
			}
	}

}
