package chap3;

/*
 * ����ȯ ����
 * ���� �ڷ��� => ū�ڷ��� , �ڵ�����ȯ
 * ū �ڷ��� => ���� �ڷ���, ���������ȯ
 * 
 * 	byte < short < int < long < float < double
 *		   char       
 * */
public class VarEx2 {

	public static void main(String[] args) {	
		//1. �������� �⺻���� ����ȯ �Ұ�
		String s = "abc";  //"" : ���ڿ��� �ǹ� String | '':���ڸ� �ǹ� char
	//	s = 'a'; // �������� String�� �⺻���� char������ ��ȯ �Ұ�
		//2. �⺻�� ���̿� boolean �� ������ 7���� ���� ����ȯ�� �����ϴ�.
		byte b1 = 100;
		int i1 = b1; //byte => int ����ȯ��. �ڵ�����ȯ
		byte b2 = (byte)i1; // int => byte ����ȯ��. ���������ȯ
		System.out.println("b1="+b1+", i1="+i1);
		byte b3 = (byte)256;
		System.out.println("b3="+b3);
		long l1 = 10;
		float f1 = l1;
		long l2 = (long)f1;
		char c1 = 'A';
		short s1 = (short)c1;
		//ū�ڷ��� = ū�ڷ��� + �����ڷ���
		int i2 = (int)(l1 + i1);
		//String = String + �⺻�ڷ���
		System.out.println("��ȣ:" + 1 + 2 + 3); //�����: ��ȣ:123
		System.out.println(1 + 2 + 3 + "��"); //����� : 6��
		
		char c3 ='A';
		int i3 = c3;
		System.out.println("c3=" +c3 + ",i3="+i3);
		
		//int���� ���� �ڷ����� ������ ����� int
		byte b4;
		byte b5=1;
		byte b6=2;
		b4 = (byte)(b5+b6);
		
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		var4 = var1;
		var1 = (byte)var3;
		float var5 = 1.0f;
		double var6 = 1.0;
		var5 = (float)var6;
		var6 = var5;
		
		/*
		 * A=B : ���� �� �ǹ̰� �ƴϰ�, ������ �ǹ���.
		 * 		 B�� ���� A�� �Է���.
		 * lvalue : ���Կ������� ������ ��. �ݵ�� ����������.
		 * rvalue : ���Կ������� �������� ��. ����,���ͳ�,���� ����
		 * */
	}


}
