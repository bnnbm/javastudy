package chap7;
/*
 * Rectangle2 Ŭ������ �����ϱ�
 *  ������� : width, height, serialNO(�簢����ȣ), sno(��ȣ �����ϱ� ���� ���� static���� �����)
 *  ����޼��� :
 *        int area() : ������ ���ϱ�
 *        int length() : �ѷ��� ���ϱ�
 *        public String toString() �޼��� �����ϱ�
 *  ����Ŭ���� ����
 *        Rectangle2 Ŭ������ 3�� ������ �ִ� �迭 �����ϱ�
 *        1���簢�� : ����(10),����(20);
 *        2���簢�� : ����(15),����(25);
 *        3���簢�� : ����(20),����(30); 
 *        
 *        ���� �簢���� ����, �ѷ� ����ϰ�, ��ü ������ �հ� �ѷ��� ���� ����ϱ�
 *        
 *        [���]
 *        1���簢�� : (����,����) => ����:100, �ѷ�:200
 *        
 *        ��ü �簢�� ������ ��:
 *        ��ü �簢�� �ѷ��� ��:
 */
class Rectangle2{
	int width;
	int height;
	int serialNo;
	static int sno;
	int area() {
		return width * height;
	}
	int length() {
		return (width+height)*2;
	}
	public String toString() {
		return serialNo + "���簢��: (" + width + "," + height + ") => ���� :"+ area() + ", �ѷ� :" + length();
	}
}
public class Exam4 {
	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[3];
		int totalArea = 0;
		int totalLength = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Rectangle2();
			arr[i].width = i * 5 +10;
			arr[i].height = i * 5 + 20;
			arr[i].serialNo = ++Rectangle2.sno;
			System.out.println(arr[i]);
			totalArea += arr[i].area();
			totalLength += arr[i].length();
		}
		System.out.println("��ü �簢�� ������ �� : " + totalArea);
		System.out.println("��ü �簢�� �ѷ��� �� : " + totalLength);
	
		
		
		
	}
}
