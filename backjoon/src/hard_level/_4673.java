package hard_level;

public class _4673 {

	public static void main(String[] args) {
		int sum = 0;
		int[] numbers = new int[10001];
		for (int i=0; i<=10000; i++) {
			String change = Integer.toString(i);
			int length = change.length();
			for (int j=0; j<length; j++) {
				char num = change.charAt(j);
				sum += (int)num-'0';
			}
			sum += i;
			numbers[i] = sum;
			sum = 0;
		}
		for (int i=1; i<=10000; i++) {
			for (int j=0; j<10000; j++) {
				if (numbers[j] == numbers[10000]) {
					System.out.println(i);
					break;
				}
				if (i == numbers[j]) {
					break;
				}
			}
		}

	}

}
