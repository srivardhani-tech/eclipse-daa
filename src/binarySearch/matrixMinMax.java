package binarySearch;
import java.util.*;
public class matrixMinMax {

	public static void main(String[] args) {
		int matrix[][]= {{3,7,8},{9,11,13},{15,16,17}};
		ArrayList<Integer>rowstore=new ArrayList<Integer>();
		for(int i=0;i<matrix.length;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]<min) {
					min=matrix[i][j];
				}
				rowstore.add(min);
			}
		}
		for(int i=0;i<matrix.length;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[j][i]>max) {
					max=matrix[j][i];
				}
			}
			if(rowstore.contains(max)) {
				System.out.println(max);
				break;	
			}
		}
	}

}
