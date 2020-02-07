package chap8;
/*
 * ��� ��ǰ(Food)�� ����(price)�� ����Ʈ(point)�� ����� ������.
 * ��ǰ�� ��ü ������ ������ �Է¹޾ƾ� �ϰ�, ������ 10%�� ����Ʈ�� �����Ѵ�.
 * �ķ�ǰ�� ������ ����(Fruit),����(Drink),����(Snack)�� ��������.
 * ���� Ŭ������ �絵(brix)��, ����� �뷮(ml), ���ڴ� ����(gram)�� ����� ������.
 * ������ �����δ� ���(Apple), ������(Peach)
 * ������ �����δ� �ݶ�(Cock)�� ���̴�(Sidar)
 * ������ �����δ� ��Ŷ(Biscuit)�� ��Ű(Cookie)�� �ִ�.
 * ���,������,�ݶ�,���̴�,��Ŷ,��Ű Ŭ������ toString() �޼��带 �����ϰ� ������ �̸��� �����Ѵ�.
 * ����� ������ ������ ���ݰ� �絵��
 * �ݶ�,���̴� ������ ���ݰ� �뷮��
 * ��Ŷ�� ��Ű ������ ���ݰ� ���Ը� �Է¹޾� ��ü�� �����Ѵ�.
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Sidar, Biscuit, Cookie Ŭ���� 10���� �����ϱ�
 */
class Food {
	int price, point;
	Food(int price) {
		this.price = price;
		this.point = price/10;
	}
}
class Fruit extends Food {             // �����ڿ� double brix �߰�, this.brix=brix �߰� // �θ� brix�� ���µ� ���� super�� �ؾ��ϳ�?
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
	double brix;
}
class Drink extends Food {            // �굵 �߰�
	Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
	int ml;
}
class Snack extends Food {   //�״�εξ    // �θ� price ����� �־ superó�� gram �޾���
	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
	int gram;
}
class Apple extends Fruit {
	Apple(int price,double brix) {
		super(price, brix);
		this.brix = brix;
	}	
	public String toString() {
		return "���";
	}
}
class Peach extends Fruit {                  //super �� brix �߰� 
	Peach(int price, double brix) {
		super(price, brix);
		this.brix = brix;
	}
	public String toString() {
		return "������";
	}
}
class Cock extends Drink {
	Cock(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "�ݶ�";
	}
}
class Sidar extends Drink {
	Sidar(int price, int ml) {
		super(price, ml);
		this.ml = ml;
	}
	public String toString() {
		return "���̴�";
	}
}
class Biscuit extends Snack {      //�״�εа�  // �θ�ü�� Snack�� price�޾Ƽ� superó�� gram �Է¹޾Ƽ�  this.gram
	Biscuit(int price, int gram) {
		super(price, gram);
		this.gram = gram;
	}
	public String toString() {
		return "��Ŷ";
	}
}
class Cookie extends Snack {    //�״�εа�
	Cookie(int price, int gram) {
		super(price, gram);
		this.gram = gram;
	}
	public String toString() {
		return "��Ű";
	}
}
/*
 * Buyer2 Ŭ���� �����ϱ�
 * ���� ���� ����Ʈ�� ��ٱ��ϸ� ����� ������.
 * �� �ķ�ǰ ���� �Ǽ��� ������.
 * �޼��� :
 *    buy(Food) : ���� ���Ž� �����ݾ׿��� ��ǰ ���ݸ�ŭ ����
 *                ��ǰ�� ����Ʈ ��ŭ ����Ʈ ����.
 *                ���� �ݾ׺��� ��ǰ���� ū ��� "�ܾ׺���" �޼���; ����ϰ� �޼��� ����
 *                ��ǰ�� ��ǰ��� ������ ȭ�鿡 ���
 *                �ش� ��ǰ�� ��ٱ��Ͽ� �߰�
 *    
 *    summary() : ��ٱ��ϸ� ��ȸ�Ͽ� ������ ��ǰ�� ��ϰ� �� ���ݰ� ���� ����Ʈ�� ����ϱ�.
 *                ������ ����, ���� ���� �ݾ�, ���� ���� ���
 *                ������ ����, ���� ���� �ݾ�, ���� ���� ���
 *                ������ ����, ���� ���� �ݾ�, ���� ���� ��� ����ϱ�
 *                
 */
class Buyer2 {
	int money = 10000;
	int point = 0;
	int cnt = 0;
	int sum = 0;
	Food[] cart = new Food[20];
	void buy(Food f) {
		if(money < f.price) {
			System.out.println(f + " ���Ž� �ܾ׺���");
			return;
		}	
		money -= f.price;
		point += f.point;		
		System.out.println(f + ", ���� = " + f.price + " ����");
		cart[cnt++] = f;	
 	}
	void summary() {
		int total=0, ftotal=0, dtotal=0, stotal=0;
		int fcnt=0, dcnt=0, scnt=0;
		String flist="", dlist="", slist="";
		for(Food f : cart) {
			if(f==null) break;
			total += f.price;
			// ���ϰǼ�, ���ϱݾ�
			if(f instanceof Fruit) { // f �����ϴ°�ü�� fruit �̴�?
				fcnt++;
				ftotal += f.price;
				flist += f+ ",";
			}
			if(f instanceof Drink) {
				dcnt++;
				dtotal += f.price;
				dlist += f+ ",";
			}
			if(f instanceof Snack) {
				scnt++;
				stotal += f.price;
				slist += f+ ",";
			}

			
		}
		System.out.println("�� ���� �ݾ� :" + total + ", �ѱ��ŰǼ� :" + cnt);
		
		System.out.println("���� ���� �ݾ� :" + ftotal + ", ���ϱ��ŰǼ� :" + fcnt);
		System.out.println("���ϱ��Ÿ�� :" + flist);
		System.out.println("���� ���� �ݾ� :" + dtotal + ", ���ᱸ�ŰǼ� :" + dcnt);
		System.out.println("���ᱸ�Ÿ�� :" + dlist);
		System.out.println("���� ���� �ݾ� :" + stotal + ", ���ڱ��ŰǼ� :" + scnt);
		System.out.println("���ڱ��Ÿ�� :" + slist);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Apple apple = new Apple(1000,10.5); //����,�絵
//		System.out.println("��� ����:" + apple.price);
//		System.out.println("��� �絵:" + apple.brix);
		Peach peach = new Peach(1000,13.5);//����,�絵(brix)
		Cock cock = new Cock(500,500);//����,�뷮(ml)
		Sidar sidar = new Sidar(1500,1000);//����,�뷮
//		System.out.println("���̴� ����:" + sidar.price);
//		System.out.println("���̴� �뷮:" + sidar.ml);
		Biscuit bis = new Biscuit(10000,500);//����,����(gram)
		Cookie cookie = new Cookie(500,5000);//����,����
		b.buy(apple); b.buy(peach);
		b.buy(cock); b.buy(sidar);
		b.buy(bis); b.buy(cookie);
		System.out.println("������ �� �ܾ� :" + b.money);
		System.out.println("������ �� ����Ʈ :" + b.point);
		System.out.println("======= ���� ��ǰ ���� =======");
		b.summary();
	}
 }
