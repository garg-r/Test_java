import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProblemStatement {
	static int[] array;
	static int[] finalarray;

	public static void main(String[] args) throws Exception {

		String workingDir = System.getProperty("user.dir");
		String inputDir = workingDir.concat("\\src\\input");
		String outputDir = workingDir.concat("\\src\\output");
		File fin = new File(inputDir);
		File fo = new File(outputDir);

		BufferedReader br = new BufferedReader(new FileReader(fin));
		FileOutputStream fout = new FileOutputStream(fo);
		// if file doesnt exists, then create it
		if (!fo.exists()) {
			fo.createNewFile();
		}

		byte[] b = performAction(br).getBytes();
		fout.write(b);
		fout.flush();
		fout.close();
		br.close();
	}



	private static String performAction(BufferedReader br) throws Exception {

		List<String> lines = new ArrayList<String>();
		String line = null;
		while ((line = br.readLine()) != null) {
			lines.add(line);
		}
		if (lines.size() > 0) {
			int k = Integer.parseInt(lines.get(0));
			int n = Integer.parseInt(lines.get(1));
			array = new int[n];
			finalarray = new int[n];
			int tempsize = lines.size() - 2;
			if (n == tempsize) {
				for (int i = 2; i < lines.size(); i++) {
					array[i-2] = Integer.parseInt(lines.get(i));
				}

				for (int i = 0; i < n; i++) {
					if (i + k < n)
						getRecurrsion(array[i], array[i + k], i, i + k, array);
				}
				return checkArrForPrimeNumbers(n);
			} else {
				return "-1";
			}
		} else {
			return "-1";
		}
	}

	private static String checkArrForPrimeNumbers(int n) {
		String allprime = "-1";
		for (int i = 0; i < n; i++) {
			if (checkPrimeNo(finalarray[i])) {
				allprime = "1";
			} else {
				allprime = "-1";
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
