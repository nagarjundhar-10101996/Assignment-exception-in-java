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
			try {
				for(int i = 0;i<5;++i) {
                    			num=sc.nextInt();
					a[i]=num;	
				}
				for (int j = 0; j < 5; j++) {
					for (int j2 = j; j2 < 5; j2++) {
						if(a[j] == a[j2+1])
						{
							throw new CustomException(a[j]);
						}
					}
				}
			System.out.println("No duplicate numbers!");
		}catch(CustomException e) {
			System.out.println("Error: Duplicate number found: "+e.getN());
		}
	}
}
