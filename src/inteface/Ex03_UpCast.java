package inteface;

import java.util.ArrayList;

class Aclass {
	public String print() {
		return "A클래스";
	}
}

public class Ex03_UpCast {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		Aclass a = new Aclass();
		arr.add(11);
	}
}
