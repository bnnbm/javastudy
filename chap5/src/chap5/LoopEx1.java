package chap5;
/*
 * �ݺ��� ����
 * for :
 * 		for(�ʱⰪ; ���ǽ�; ������) { ... }
 * 		�ַ� ���۰� ���ᰡ �����Ȱ��, �������� ó���� �Ҷ� ,
 * while :
 * 		while(���ǽ�) { ... }
 * 		���۰� ���Ḧ �� �𸦶�, ���������� ������. exit���ڰ� �Էµɶ�����. 9���ڰ� �Էµɶ�����.
 * do while : 
 * 		do { ... }
 * 		while(���ǽ�);
 * 		��������ϋ�, ���ǿ� ������� �ѹ��� ������ �����ϰ� ������.
 * */
public class LoopEx1 {

	public static void main(String[] args) {	
		
		for(int i=1; i<=5; i++)
		{
			System.out.print(i);
		}
		System.out.println();
		
	int i=1;
	do
	{
		System.out.print(i);
		i++;
	}
	while(i<=5);
	System.out.println();
	}

}
