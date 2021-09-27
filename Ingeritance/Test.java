package Test;

import Basic.Addition;

public class Test extends Addition {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		//a.addToInt(10, 20);
		a.addToFloat(20.5f,30.5f);
		
		Test t = new Test();
		t.addToInt(20, 30);
		
		
	}

}
