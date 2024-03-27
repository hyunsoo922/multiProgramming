package chap4;

class Printer{
	int numOfPapers =0;
	
	public void print(int amount)
	{
		System.out.println(numOfPapers - amount);
	}
}

public class ChallengTask01 {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.numOfPapers = 100;
		printer.print(70);
	}
}
