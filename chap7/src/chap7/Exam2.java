package chap7;
/*
 * Rectangle ��ü�� 3�� ������ �迭�� �����ϱ�
 * 0���� : ����=10,����=20
 * 1���� : ����=11,����=21
 * 2���� : ����=12,����=22
 * �� ��ü�� �����ϰ�,
 * ������ ���̿� �ѷ��� ����ϱ�
 */
public class Exam2 {
	public static void main(String[] args) {
		//Rectangle ��ü�� 3�� ������ �迭
		//Rectangle ��ü�� ������ ���������� �迭
		Rectangle[] rarr = new Rectangle[3];
		for(int i=0; i<rarr.length; i++) {
			rarr[i] = new Rectangle(); // Rectangle ��üȭ
			rarr[i].width = 10+i;
			rarr[i].height = 20+i;
		}
		for(int i=0; i<rarr.length; i++) {
			System.out.print(i+"���� ���� : ");
			rarr[i].area();
			System.out.print(i+"���� �ѷ� : ");
			rarr[i].length();
		}
		
	}
}
