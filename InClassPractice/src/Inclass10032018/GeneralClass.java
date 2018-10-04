package Inclass10032018;

public class GeneralClass {
	public  static void main(String[] are) {
	Object str = new String("hahah");
	String strs = (String) str;
	System.out.println(strs);
	Bag<Integer> itn = new Bag<>(10);
	itn.add(new Integer(10));
	itn.add(20);
	System.out.println(itn);
	}
}
