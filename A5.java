import java.util.Scanner;
class CustomException extends Exception{
	private int n;
	CustomException(int n){this.n=n;}
	public int getN(){return n;}
	public void setN(int n) {this.n = n;}
}
public class A5 {
	public static void main(String[] args) throws CustomException {
		int[] a=new int[100001];
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 5 integers ranging from 1 to 100000");
			int i=0;
			try {
				while(i<5) {
                    num=sc.nextInt();
					a[i++]=num;	
				}
				int j = i;
				while (i > 0) {
					--i;
					while (j > 0 ) {
						if (a[i] == a[j]) {
							throw new CustomException(a[j]);
						}
						--j;	
					}
				}
			System.out.println("No duplicate numbers!");
		}catch(CustomException e) {
			System.out.println("Error: Duplicate number found: "+e.getN());
		}
	}
}
