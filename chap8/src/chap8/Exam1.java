package chap8;
/*
 * SutdaCard 20������ �̷���� SutdaDeck Ŭ���� �����ϱ�
 * SutdaDeck Ŭ����
 * 1. �������
 *    SutdaCard 20���� ������ �迭.
 * 2. ������
 *    SutdaCard 20���� �����Ͽ� �迭�� �����ϱ�
 * 3. �ż���
 *    (1) void shuffle() : ī�带 ����.
 *    (2) SutdaCard pick(int index) : index �� �ش��ϴ� ī�� ������ ��ȯ
 *    (3) SutdaCard pick() : ������ ī�� ������ ��ȯ
 *    
 * SutdaCard Ŭ����
 * 1. ������� : int number, boolean isKwang
 * 2. ������ : this ������ �̿��ϱ�
 *    - () : number=1, isKwang=true �� ��ü ����
 *    - (int, boolean) : ��������� ���� �����ϱ�
 * 3. �޼���
 *   String toString() : number + isKwang?"K":"" ���� ����ϱ�
 */
class SutdaCard {
	int number;
	boolean isKwang;
	SutdaCard(int number, boolean isKwang){
		this.number = number;
	    this.isKwang = isKwang;
	}
	SutdaCard() {
		this(1,true);
	}
	void info() {
		System.out.println(this);
	}
	public String toString() {
		return number + ((isKwang)?"K":"");
	}
}
//SutdaDeck has a SutdaCard ����
class SutdaDeck {
		SutdaCard[] cards = new SutdaCard[20];
		//������
		SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			cards[i] = new SutdaCard((i%10)+1,(i==0||i==2||i==7)? true : false);
		  }
		}
		//toString
		public String toString() {
			String result = "";
			for(SutdaCard c : cards) {
				result += c.toString()+",";
			}
			return result;
		}
		public void shuffle() {
			for(int i=0; i<=1000; i++) {
				int a = (int)(Math.random()*cards.length);
				int b = (int)(Math.random()*cards.length);
				SutdaCard tmp = cards[a];
				cards[a] = cards[b];
				cards[b] = tmp;
			}
		}
		SutdaCard pick() {
         	int a = (int)(Math.random()*cards.length);
			return cards[a];
		}
		SutdaCard pick(int a) {
			return cards[a];
		}	
}
public class Exam1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		//1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
	}
}