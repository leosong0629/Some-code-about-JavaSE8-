
public class quickSort1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a= {3,1,3,4,6,7,8,2,1,2,3,4,3};
		quickSo(a);
		for(int arr:a)
		System.out.print(arr+" ");
	}
	
	public static void sort(int[]a,int low,int high) {
		int i,j,pivot;
		if(low>high)
			return;
		i=low;
		j=high;
		pivot=a[i];
		while(i<j) {
		while(i<j&&a[j]>=pivot) {
			j--;
			}
			if(i<j) {
				a[i++]=a[j];
			}
			while(i<j&&a[i]<pivot) {
				i++;
			}
				if(i<j) {
					a[j--]=a[i];
				}
			}
			
			a[i]=pivot;
			sort(a,low,i-1);
			sort(a,i+1,high);
	}
	
	public static void quickSo(int a[]) {
		sort(a,0,a.length-1);
	}

}
