package Lab_2;
class demo{
	int i=10;
	int j=20;
}
class demo1 extends demo {
	int k=30;
	void sum() {
		System.out.println(i+j+k);
	}
}
public class Single_inheritance6 {
	public static void main(String[] args) {
		demo1 ob=new demo1();
		ob.sum();
	}

}
