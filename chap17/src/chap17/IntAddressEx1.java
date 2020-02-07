package chap17;
import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 * InetAddress Ŭ���� : IP �ּ� ���� �����ϴ� Ŭ����
 *    InetAddres getByName("�������̸�")
 *    InetAddres[] getAllByName("�������̸�")
 *    InetAddress getByAddress(byte[]) : �������·�
 *    InetAddress getLocalHost() : ����ǻ���� IP �ּ� ����
 */
public class IntAddressEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.goodee.co.kr");		
		System.out.println("getByName �޼��� ȣ��");
		System.out.println("hostname:" + ip.getHostName());//������
		System.out.println("hostaddress:" + ip.getHostAddress()); //���������� �ּ�
		
		InetAddress[] ips = InetAddress.getAllByName("www.goodee.co.kr");		
		System.out.println("getAllByName �޼��� ȣ��");
		for(InetAddress i : ips) {
			System.out.println("ip �ּ� : " + i);
		}
		System.out.println("getLocalHost �޼��� ȣ��");
		InetAddress local = InetAddress.getLocalHost(); //�� ��ǻ�� IP�ּ�
		System.out.println("����ǻ��:" + local);
	}
}