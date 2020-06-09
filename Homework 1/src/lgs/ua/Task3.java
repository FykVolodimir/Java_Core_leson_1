package lgs.ua;

public class Task3 {

	public static void main(String[] args) {

		int array1[] = new int[10];
		for (int i = 0; i < array1.length -1; i++) {
			array1[i] = (i + 7) * 9 % 11;
// Заповнює масив числами автоматично
		}
		boolean Srt = false;
		int b = 0;
		while (!Srt) {
			Srt = true;
			for (int a = 0; a < array1.length -1; a++) {
				if (array1[a] > array1[a + 1]) {
					Srt = false;
					b = array1[a];
					array1[a] = array1[a + 1];
					array1[a + 1] = b;

				}
			}
		}
		System.out.println("Max array value = " + array1[array1.length-1]); 
		System.out.println("Min array value = " + array1[0]);
	}
}
