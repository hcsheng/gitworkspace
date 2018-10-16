package com.hcs.single;

public class Test {
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			Singleton single = Singleton.getInstance();
			
			//single.doSomething(i+"");
			
			System.out.println(single.hashCode());
		}
		
		/*for(int i=0;i<2;i++) {
			TestA testa = new TestA();
			System.out.println(testa.hashCode());
		}*/
		
		
	}

}
