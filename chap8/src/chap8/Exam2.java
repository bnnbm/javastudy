package chap8;
/*
 * ������ ����
 * Buyer�� ������ǰ �����ϱ�
 * 
 * produck Ŭ����
 *    ������� : ����, ����Ʈ
 *    ������ : ������ �Է¹ް�, ������ 10%�� ����Ʈ�� ����.
 * Tv Ŭ����
 *    ������ 100 �����ϱ�
 *    toString() �޼��忡�� Tv�� ����
 * Computer Ŭ����
 *    ������ 200 �����ϱ�
 *    toString() �޼��忡�� Computer�� ����
 * SmartPhone Ŭ����
 *    ������ 150 �����ϱ�
 *    toString)() �޼��忡�� SmartPhone�� ����
 */
class Produck {
	int price;
	int point;
	Produck(int price) {
		this.price = price;
	    this.point = (price/10);
	}
}
class Tv extends Produck {
	Tv() {
		super(100);
	}	
	public String toString() {
		return "Tv";
	}
}
class Computer extends Produck {
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class SmartPhone2 extends Produck {
	SmartPhone2(){
		super(150);
	}
	public String toString() {
		return "SmartPhone";
	}
}
/*
 * Buyer Ŭ����
 *    ������� : money = 500, point
 *            cart = new Product[3];
 *            cnt;
 *    ����޼��� : buy(Product p)
 *              p��ǰ�� ���ݸ�ŭ money ����
 *              p��ǰ�� point ��ŭ ���� point ����
 *              ȭ�鿡 ������ ��ǰ ���.
 *              cart�� ��ǰ�߰�.
 *              summary()
 *                 1. �� ������ ��ǰ�� ���ݰ� ����Ʈ ���
 *                 2. ��ü ���� ��ǰ ����.
 *                 3. ��ü ���� ��ǰ ������
 */
class Buyer {
	int money = 500;
	int point = 0;
	int cnt = 0;
	int sum=0;
	Produck[] cart = new Produck[3];
	void buy(Produck p) {
		money -= p.price;
		point += p.point;		
		System.out.println(p + " ������");
		cart[cnt++] = p;
 	}
	void summary() {
//		for(int i=0; i<cart.length; i++) {
//			if(cart[i]==null) break;
//			System.out.println(cart[i] + " ����:" + cart[i].price + " ����Ʈ:" + cart[i].point);
//			sum += cart[i].price;
//		}
//		System.out.println("�ѹ�ǰ���ž�:"+sum);
//		System.out.print("�ѹ�ǰ���:");
//		for(int i=0; i<cart.length; i++) {
//			if(cart[i]==null) break;
//			System.out.print(cart[i]+",");
//		}
		
		String productList ="";
		for(int i=0; i<cnt; i++) {
			System.out.println(cart[i] + " ����:" + cart[i].price + " ����Ʈ:" + cart[i].point);
			productList += cart[i] + ",";
			sum += cart[i].price;
		}
		System.out.println("�ѹ�ǰ���ž�:" + sum);
		System.out.println("�ѹ�ǰ���:" + productList);
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		SmartPhone2 sp = new SmartPhone2();
     	b.buy(tv);
    	b.buy(com);
		b.buy(sp);
		System.out.println("������ �ܾ�  : " + b.money);
		System.out.println("������ ��������Ʈ : " + b.point);
		System.out.println("======= ���� ��ǰ ���� =======");
		b.summary();
	}
}