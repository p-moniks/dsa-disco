package practice.ques;

public class Bar extends Foo{
	Bar(){
		super();
		System.out.println("Bar");
//		this("Bar");
		
	}
	
	public static void main(String[] args) {
		new Bar();
	}
}