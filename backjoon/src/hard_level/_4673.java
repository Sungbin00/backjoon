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
		} // ������ ���ڸ� �迭 numbers�� �ִ´�.
		for (int j=1; j<=1; j++) {
			for (int e : numbers) {
				System.out.println(e);
				System.out.println("a");
			}
		} // j�� ������ ���ڿ� �ش�Ǹ� ���� j�� �Ѿ��, ��� ������ ���ڿ� �ش���� �ʴ´ٸ� j�� ����ϰ� ���� j�� �Ѿ��.

	}

}
