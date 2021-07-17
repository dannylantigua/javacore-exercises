public class NumericPromotion{
	public static void main(String... args){
		
		// Rule # 1 (promote to the largest one)
		int x = 1; long y = 33;
		System.out.println(x * y);
		// Rule # 2, if one of them is floating point, promote to floating point
		double x = 39.21; float y = 2.1f;
		System.out.println(x + y);
		// Rule # 3, operations of small data types are promoted to int
		short x = 10; short y = 3;
		System.out.println(x / y);
		// Rule # 4, result will have the same data type as the promoted operands
		short x = 14; float y = 13; double z = 30;
		System.out.println(x * y / z);
	}
}