package chap11;
import java.io.IOException;
/*
 * �������̵� �� �޼����� ����ó���� �θ�޼����� ����ó���� ���ų� ���� ������ �����ϴ�.
 */
class Parent {
	void method(int i) throws RuntimeException {
		System.out.println(i);
	}
}
class Child extends Parent {
	@Override
	void method(int i) throws RuntimeException { // �θ�޼��庸�� ���ų� ���������� ����
		System.out.println(i);
		try {
			throw new IOException();   // IOException �� ���ؾ� �Ѵٸ� try�������� ������
		} catch(IOException e) {}
	}
}
public class ExceptionEx9 {
}
