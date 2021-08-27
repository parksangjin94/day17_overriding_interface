package inteface;

class A지상군{
	public void Gak(){
		System.out.println("지상군이 공격합니다");
	}
	public void Gdf(){
		System.out.println("지상군이 방어합니다");
	}
}
class B공군{
	public void Airak(){
		System.out.println("공군이 공격합니다");
	}
	public void Airdf(){
		System.out.println("공군이 방어합니다");
	}
}

public class Ex06 {
public static void main(String[] args) {
	A지상군 a = new A지상군();
	B공군 b = new B공군();
	
}
}
