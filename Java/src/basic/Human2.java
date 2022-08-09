package basic;

public class Human2	extends Human1 {
	
	public void sing() {
		// TODO Auto-generated method stub
		
		System.out.println("Advanced singing");

	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing....");

	}
	
	public static void main(String[] args) {
		Human2 obj = new Human2();
		obj.sing();
		Human1 obj1 = new Human1();
		obj1.sing();
		//obj.play();
		
	}

}
