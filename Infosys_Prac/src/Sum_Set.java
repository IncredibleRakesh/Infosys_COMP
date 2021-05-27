import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Sum_Set {
	static Scanner s = new Scanner(System.in);
	static int[] aArr, cArr;
	static TreeSet bArr = new TreeSet();
	static int maxInCArr;
	static int top = -1;
	public static void main(String[] args) {
		// System.out.println("enter size of aArr ");
		int aArrSize = s.nextInt();
		aArr = new int[aArrSize];
		// System.out.println("enter element for aArr ");
		for(int i = 0; i < aArr.length; i++) {
			aArr[i]= s.nextInt();
		}
		
		// System.out.println("enter size of cArr ");
		int cArrSize = s.nextInt();
		cArr = new int[cArrSize];
		// System.out.println("enter element for cArr ");
		for(int i = 0; i < cArr.length; i++) {
			cArr[i]= s.nextInt();
		}	
		bubbleSort(cArr);
		maxInCArr = cArr[cArr.length-1];
		
		for(int i = 0; i < aArr.length; i++) {
			for( int j = 1; j < maxInCArr; j++ ) {
				int tempSum = aArr[i] + j;
				// System.out.println(aArr[i]+" + "+j+" = "+tempSum);
				if( checkExist(tempSum, j, cArr) ) {
					// System.out.println("so added "+j);
					if(bArr.size() > 0 && j >= (int) bArr.first()) {
						bArr.add(j);
					} else {
						bArr.add(j);
					}
				}
			}
		}
		
        Iterator itr = bArr.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
}
	public static boolean checkExist(int sumNum, int check, int[] cArr) {
		// System.out.println();
		for(int i : cArr) {
			if( sumNum == i && check <= cArr[0] ) {
				// System.out.println(sumNum + " exist ");
				return true;
			} else {
				continue;
			}
		}
		return false;
	}
	public static void bubbleSort(int[] cArr) {
		int temp;
		for(int i = 0; i < cArr.length; i++){
			for(int j = 1; j < cArr.length; j++){
				if(cArr[j-1] > cArr[j]) {
					temp = cArr[j-1];
					cArr[j-1] = cArr[j];
					cArr[j] = temp;
				}
			}
		}
		
	}  
}
