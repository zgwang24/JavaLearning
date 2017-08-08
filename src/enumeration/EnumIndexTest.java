package enumeration;

public class EnumIndexTest {
	enum Constants2{
		Constants_A, Constants_B, Constants_C, Constants_D;
	}
	public static void main(String[] args) {
		for(int i = 0; i < Constants2.values().length; i++){
			System.out.println(Constants2.values()[i] + "---" + Constants2.values()[i].ordinal());
		}
	}
}
