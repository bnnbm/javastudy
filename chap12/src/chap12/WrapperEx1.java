package chap12;

public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 :" + (i1==i2)); // false 다른객체
		System.out.println("i1.equals(i2) :" + i1.equals(i2)); // true 내용이같음
		System.out.println("i1==100 :" + (i1==100)); // true unboxing 객체가아니라 정수형처럼 행동
		int i3 = 100;
		System.out.println("i1==i3 :" + (i1==i3)); // true i1이 int형으로 자동형변환이 되서 비교되기 때문에 정수값과 같다
		Integer i4 = 100;
		System.out.println("i3==i4 :" + (i1==i4)); // false 객체로 비교됨
		System.out.println("int 형의 최대값 :" + Integer.MAX_VALUE); // 최소값은 MIN+VALUE
		System.out.println("long 형의 최대값 :" + Long.MAX_VALUE);
		System.out.println("byte의 bit 수 :" + Byte.SIZE); // 8
		System.out.println("byte의 byte 수 :" + Byte.BYTES); // 1
	}
}
