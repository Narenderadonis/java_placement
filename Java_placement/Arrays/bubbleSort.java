package Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		int a[]= {12,2,34,-2,-9,8,1};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
			}
			}
		}
		for(int i=0;i<n-1;i++) {
			System.out.println(a[i]);
		}

	}

}
