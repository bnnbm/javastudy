package chap18;
/*
 * ���ٽ� ���� : jdk8.0 ���� �������� ��밡��.
 * ���ٽĿ��� ����� �� �ִ� �������̽��� �ݵ�� FunctionInterface ������.
 * 
 * @FunctionalInterface : �������̽����� �߻�޼��尡 �Ѱ���.
 * 
 * �Ű������� ����, ���ϰ��� ���� ���
 * 
 * �Ű����� ���� : ()->{....}
 * ���ٽ� ���ο� ����Ǵ� ������ �Ѱ��� ��� { } ���� ����
 */
//@FunctionalInterface
interface LambdaInterface1 {
	void method();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//������ ������� �ڵ�
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("����������� �ڵ�");
			}
		};
	//	LambdaInterface1 fi;
		fi.method();
		execute(fi);
		fi = ()->{
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		fi = ()->{
			System.out.println("method call2");
		};
		fi.method();
		fi = ()->{
			System.out.println("method call3");
		};
		fi.method();
		fi = ()-> System.out.println("method call4"); // ������ �Ѱ��϶� �߰��� ��������
		fi.method();
		execute(()-> System.out.println("method call5")); 
		}
		static void execute(LambdaInterface1 f) {
			f.method();
	}
}