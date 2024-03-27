package chap4;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S8";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
		
	}

}
