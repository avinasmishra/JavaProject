package SubInterview;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 0, 30, 5,5 };
		int length = a.length;

		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < length - i; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] + " ");

		}
	}
}