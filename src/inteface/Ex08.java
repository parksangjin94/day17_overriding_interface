package inteface;
interface test{
	public int num=4000;
}
class AAAA {
	public static int aaa = 5000;
}
public class Ex08 {
	public static void main(String[] args) {
		System.out.println(test.num);
		
		System.out.println(AAAA.aaa);
	}
}
