package chap7;
/*
 * ���� ��ġ�� ���� ������ ����
 * Ŭ���� ���� : Ŭ���� ���ο� ����.
 *           static ������ ������.
 *           Ŭ���� ������ �޸𸮿� �ε� �ɶ� �����޸� �Ҵ�.
 *           ��üȭ�� ���þ��� ������.
 *           �޸� �Ҵ� ��ġ : Ŭ���� ����
 *           Ŭ������ ��� ��ü�� ���� ������ ����.(���� ����Ǹ� ��� ��ü�� ������ ����)
 *           ��� : Ŭ������.������ 
 *           
 * �ν��Ͻ����� : Ŭ���� ���ο� �����
 *            �ڷ��� ������; �����
 *            ��üȭ�� �޸� �Ҵ����.
 *            �ݵ�� ��üȭ �Ǿ�� ������ ����� �� ����
 *            �޸� �Ҵ� ��ġ : ������
 *            ��� : ����������.������ 
 *            
 * ��������         : �޼��� ���ο��� ����.
 * (�Ű���������)  �ʱ�ȭ �Ǿ����.
 *              ���� ������ ����ɶ� �޸� �Ҵ�.
 *              �޸� �Ҵ� ��ġ : ���ÿ���
 *              ��� : ������
 *              
 */
class Sonata{
	String color; // �ν��Ͻ�����
	int number; // �ν��Ͻ� ����
	static int width = 250; // Ŭ����(����ƽ) ����.
	static int height = 150; // Ŭ����(����ƽ) ����.
	public String toString() {
		return color + ":"+ number + "(" + width + "," + height + ")";
	}
}
public class SonataEx1 {
	public static void main(String[] args) {
		System.out.println("�ڵ��� ũ��:" + Sonata.width + ","+Sonata.height);
		//car1 : ��������
		Sonata car1 = new Sonata(); //��üȭ
		car1.color ="white"; // Static�� �ƴ϶� ��(hip) ������ �Ҵ�� ///// ����������.������
		car1.number = 1234; // Static�� �ƴ϶� ��(hip) ������ �Ҵ�� ///// ����������.������
		System.out.println("car1:" + car1); // color + number + car1.toString()�޼���ȣ�� ������ ���� (��ü�� ���ڿ�ȭ �����ִ� �޼���)
		Sonata car2 = new Sonata();
		car2.color = "black";  
		car2.number = 2345;
		System.out.println("car2:" + car2);
		car2.width = 300; // toString ��ü�� �ٲ�
		car1.height = 200; // toString ��ü�� �ٲ�
		System.out.println("car1:" + car1); // color + number + �ٲ�toString ����
		System.out.println("car2:" + car2);
	}
}
