/* ���׸��� ��������*/

//AAAŬ����
class AAA<T> {
	T itemAAA;

	AAA(T item) {
		itemAAA = item;
	}

	void showItem() {
		System.out.println(itemAAA);
	}
}// AAA

class BBB<T> extends AAA<T> {
	T itemBBB;

	BBB(T itemA, T itemB) {
		super(itemA);
		itemBBB = itemB;
	}

	void showItem() {
		super.showItem();
		System.out.println(itemBBB);
	}
}

class CCC extends AAA<String> {
	CCC(String str) {
		super(str);
	}

	int itemCCC;// ???����?
}

public class Generic01 {
	public static void main(String[] args) {
		AAA<String> strA = new AAA<String>("AAAȣ��");
		BBB<String> strB = new BBB<String>("BBB string���� ȣ�� ù��°�� ��ӹ޾� AAA class ���, ", "�ι�°�� BBB��ü �����ڷ� ����");
		BBB<Integer> intB = new BBB<Integer>(12, 4);
		CCC cname = new CCC("AAA�� ��ӹ��� �Ϲ� class CCC");
		
		strA.showItem();
		System.out.println();
		strB.showItem();
		System.out.println();
		intB.showItem();
		System.out.println(); 
	    cname.showItem();
	    
	    cname.itemCCC = 2;
	    System.out.print(cname.itemCCC);
	}
}
