package pr1;

public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i,j,n1=0;
		int m=4;
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println();
		for(i=n;i>0;i--) {
			for(j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println();
		for(i=0;i<n;i++) {
				for(j=0;j<n-i;j++) {
					System.out.print(" ");
				}
		for(j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println();
			for(i=0;i<n;i++) {
				for(j=0;j<i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			System.out.println();
			for(i=0;i<n;i++) {
				for(j=0;j<n-i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			for(i=0;i<n;i++) {
				for(j=0;j<i;j++) {
					System.out.print(n1);
					n1++;
				}
				System.out.println();
			}
			System.out.println();
			for(i=0;i<n;i++) {
				for(j=0;j<i;j++) {
					int sum=i+j;
					if(sum%2==0) {
						System.out.print("1");
					}
					else {
						System.out.print("0");
					}
					
				}
				System.out.println();
			}
	

}
}
}
