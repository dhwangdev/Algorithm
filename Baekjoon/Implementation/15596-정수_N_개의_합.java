public class Test {
	long sum(int[] a) {
		long num = 0;
		
		for (int idx=0; idx<a.length; idx++) {
			num += a[idx];
		}
		
		return num;
	}
}
