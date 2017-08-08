package enumeration.simple;

public class ConstantTest {
	enum Constants{
		Constants_A,
		Constants_B
	}
	public static void doit(Constants c){
		switch(c){
			case Constants_A:{
				System.out.println("Constants_A");
				break;
			}
			case Constants_B:{
				System.out.println("Constants_B");
				break;
			}
		}
	}
	public static void main(String[] args) {
		ConstantTest.doit(Constants.Constants_A);
		for(int i = 0; i < Constants.values().length; i++){
			System.out.println(Constants.values()[i].ordinal());
		}
		System.out.println(Constants.Constants_A.compareTo(Constants.valueOf("Constants_B")));
	}
}
