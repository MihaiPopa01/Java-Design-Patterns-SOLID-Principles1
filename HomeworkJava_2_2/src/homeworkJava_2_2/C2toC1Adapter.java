package homeworkJava_2_2;

public class C2toC1Adapter {
	public C2 c2instance;

	public C2toC1Adapter(C2 c2instance) {
		this.c2instance = c2instance;
	}
	public int getSum()
	{
		return c2instance.GetSum();
	}
}
