package capgtraining;
import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//rxc . cxk
		//mone 2 6 5 1 9 0
		//mtwo 5 4 8 1 0 9
		int mone[][]=new int[2][3];
		int mtwo[][]=new int[3][2];
		System.out.println("Enter elements of first matrix");
		int i,j,k;
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				mone[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of second matrix");
		for(i=0;i<3;i++) {
			for(j=0;j<2;j++) {
				mtwo[i][j]=sc.nextInt();
			}
		}
		int res[][]=new int[2][2];
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				int sum=0;
				for(k=0;k<3;k++) {
					sum+=mone[i][k] * mtwo[k][j];
				}
				res[i][j]=sum;
			}
		}
		System.out.println("Resultatnt Matrix after multplication");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
