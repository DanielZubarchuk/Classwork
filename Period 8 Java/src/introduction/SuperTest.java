package introduction;

public class SuperTest extends SuperClassTest {
	@Override
	public void printText()
	{
		System.out.println("a different line of text;P");
		
		//((SuperClassTest)thing).talk();
	}



}
