package Arrays;

public class selectionSort {

	public static void main(String[] args) {
		int a[]= {1,2,-3,23,54,-33,34,44};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			int minInd=i;
			for(int j=i;j<n-1;j++) {
				if(a[j]<a[minInd]) {
					minInd=j;
				}
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(a[i]);
		}

	}

}
