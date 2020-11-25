
public class quickSort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a= {3,1,3,4,6,7,8,2,1,2,3,4,3};
		quickSort q=new quickSort(a);
		q.showSort(a);

	}
	
	public quickSort(int[] arr) {
		int k=4;
		try {
			int c=arr[k];
		}
		catch(RuntimeException ex) {
			System.out.println("4個以上の要素数を入力してください");
			
		}
		
		int top=0;
		int last=(arr.length-1);
		Outer:
		while(top<last) {
			int pivot=arr[k];
			int i=top;
			int j=last;
			Inner:
			while(true) {
				while(arr[i]<pivot) {
					i++;
				}
				while(arr[j]>pivot) {
					j--;
				}
				if(i>=j) {
					break Inner;
				}
				
				int work=arr[i];
				arr[i]=arr[j];
				arr[j]=work;
				i=i+1;
				j=j-1;
				for(int arr2:arr) {
					System.out.print(arr2+" ");
				}
				System.out.println("\n");
			}
			if(i<=k) {
				top=j+1;
			}
			
			if(j>=k) {
				last=i-1;
			}
		}
	}
	
	void showSort(int arr[]) {
		for(int arr1:arr) {
			System.out.print(arr1+" ");
		}
	}

}
