package enumeration;

interface Constants1{
	public static final int CONSTANTS_A = 1;
	public static final int CONSTANTS_B = 2;
}
public class ConstantsTest {
	enum Constants2 {
		CONSTANTS_A, CONSTANTS_B
	}
	public static void doit(int c){
		switch(c){
			case Constants1.CONSTANTS_A:
				System.out.println("diot: CONSTANTS_A");
				break;
			case Constants1.CONSTANTS_B:
				System.out.println("diot: CONSTANTS_B");
				break;
		}		
	}
	public static void doit2(Constants2 c){
		switch(c){
			case CONSTANTS_A:
				System.out.println("diot2: CONSTANTS_A");
				break;
			case CONSTANTS_B:
				System.out.println("diot2: CONSTANTS_B");
				break;
		}		
	}
	public static void main(String[] args) {
		ConstantsTest.doit(Constants1.CONSTANTS_A);
		ConstantsTest.doit2(Constants2.CONSTANTS_A);
		ConstantsTest.doit2(Constants2.CONSTANTS_B);
		ConstantsTest.doit(3);
	}
}
