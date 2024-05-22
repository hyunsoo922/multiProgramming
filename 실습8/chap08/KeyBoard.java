package chap08;

public class KeyBoard {
	String name;
	
	public KeyBoard(String name) {
		this.name = name;
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof KeyBoard)
		{
			KeyBoard k = (KeyBoard) obj;			
			if(name.equals(k.name)) return true;
		}
		return false;
	}
	
	public String toString()
	{
		return "키보드입니다";
	}
}
