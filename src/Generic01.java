/* 제네릭을 연습하자*/

//AAA클래스
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

	int itemCCC;// ???뭐지?
}

public class Generic01 {
	public static void main(String[] args) {
		AAA<String> strA = new AAA<String>("AAA호출");
		BBB<String> strB = new BBB<String>("BBB string으로 호출 첫번째는 상속받아 AAA class 사용, ", "두번째는 BBB자체 생성자로 받음");
		BBB<Integer> intB = new BBB<Integer>(12, 4);
		CCC cname = new CCC("AAA를 상속받은 일반 class CCC");
		
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
