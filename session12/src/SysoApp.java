class SSystem{
	static PPrintStream oout = new PPrintStream();
}

class PPrintStream{
	void pprintln(String data) {
		System.out.println(data);
	}
}

public class SysoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Thit is a awesome text");
		
		SSystem.oout.pprintln("This is also a awesome text");
	}

}
