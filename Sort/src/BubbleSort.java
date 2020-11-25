
public class BubbleSort {
	public static void main(String[]args) {
		int[] array= {3,80,22,78,55};
		BubbleSort Sorter=new BubbleSort();
		Sorter.sort(array);
	}
	
	
	
	
	public void sort(int[] array) {
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<array.length-i;i++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		showArray(array);
	}
	
	public void showArray(int[]array) {
		for(int i:array) {
			System.out.print(">"+i);
			System.out.print(" ");
		}
	}
}
