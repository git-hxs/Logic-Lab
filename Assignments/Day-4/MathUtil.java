package capgtraining;

public class MathUtil {
	
	public static int max(int a, int b) {
		return Math.max(a,b);
	}
	
	public static int clamp(int v, int min, int max) {
		return v>=min&&v<=max?v:(v<min?min:max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MathUtil.max(7, 3));            // 7
		System.out.println(MathUtil.clamp(15, 0, 10));     // 10
		System.out.println(MathUtil.clamp(-3, -2, 5));     // -2
	}

}
