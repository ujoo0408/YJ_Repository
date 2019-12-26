package prjTest;

public class MainClass {

	public static void main(String[] args) {
		ChildClass child1 = new ChildClass();

		child1.setInfo("kang dong ho", "M", 25);
		child1.getInfo();
		
		int[] iArr = {10, 20, 30};
		ObjectClass obj1 = new ObjectClass("Hello", iArr);
	}

}
