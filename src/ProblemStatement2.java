import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProblemStatement2 {
	static int[] array;
	static int[] finalarray;
	static List<String> lines = new ArrayList<String>();
	public static void main(String[] args) throws Exception {

		InputStreamReader inputReader = new InputStreamReader(System.in,"utf-8");
		BufferedReader buffReader = new BufferedReader(inputReader);


		 System.out.println(performAction(buffReader));
		 
		 buffReader.close();
	}



	private static int performAction(BufferedReader buffReader) throws Exception {

			int k = Integer.parseInt(buffReader.readLine());
			int n = Integer.parseInt(buffReader.readLine());
			array = new int[n];
			finalarray = new int[n];
				for (int i = 0; i < n; i++) {
					array[i] = Integer.parseInt(buffReader.readLine());
				}

				for (int i = 0; i < n; i++) {
					if (i + k < n)
						getRecurrsion(array[i], array[i + k], i, i + k, array);
				}
				return checkArrForPrimeNumbers(n);
			} 

	private static int checkArrForPrimeNumbers(int n) {
		int allprime = -1;
		for (int i = 0; i < n; i++) {
			if (checkPrimeNo(finalarray[i])) {
				allprime = 1;
			} else {
				allprime = -1;
			}
		}
		return allprime;
	}

	private static void getRecurrsion(int arr1, int arr2, int i, int j, int[] array2) {
		boolean aa = checkPrimeNo(arr1);
		boolean bb = checkPrimeNo(arr2);
		if (!(arr1 > 1 && arr2 > 1)) {
			return;
		}
		if (((aa == true) && (bb == true)) && (arr1 != arr2)) {
			finalarray[i] = arr1;
			finalarray[j] = arr2;
		} else if (aa == true && (arr1 < arr2)) {
			arr1 = arr1 - 1;
			arr2 = arr2 + 1;
			getRecurrsion(arr1, arr2, i, j, array2);
		} else {
			arr1 = arr1 + 1;
			arr2 = arr2 - 1;
			if (array2[i] == arr1 && array2[j] == arr2) {
				arr1 = array2[i] + 1;
				arr2 = array2[j] - 1;
			}
			getRecurrsion(arr1, arr2, i, j, array2);
		}
	}

	private static boolean checkPrimeNo(int num) {
		boolean status = true;
		if (num == 1 || num == 0) {
			status = false;
		} else {
			int temp = num / 2;
			for (int i = 2; i <= temp; i++) {
				if (num % i == 0) {
					status = false;
					break;
				}
			}
		}
		return status;
	}

}
