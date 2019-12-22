package projectOOP;

class Print{
	public String delimiter = "";
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}

	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
	//this = 클래스가 인턴스화 되었을 때 그 인스턴스를 가리키는 것.
	
}