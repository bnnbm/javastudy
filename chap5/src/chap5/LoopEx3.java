package chap5;
/*
 * ��ø �ݺ��� : �ݺ��� ���ο� �ݺ����� ������.
 * ������ ����ϱ�
 * */
public class LoopEx3 {

	public static void main(String[] args) {		
		for(int i=2; i<10;i++)
		{
			System.out.println("\n" +i+"��");
			for(int j=2; j<10; j++)
			{
				System.out.println(i+ "*" + j + "="+(i*j));
			}
		}
	}

}
