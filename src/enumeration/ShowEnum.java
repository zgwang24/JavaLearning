package enumeration;

public class ShowEnum {
	enum Constants2{
		Constants_a, Constants_b
	}
	public static void compare(Constants2 c){
		for(int i = 0; i < Constants2.values().length; i++){
			System.out.println(c + " and " + Constants2.values()[i] + " compare and result is " + c.compareTo(Constants2.values()[i]));
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < Constants2.values().length; i++){
			System.out.println(Constants2.values()[i]);
		}
		compare(Constants2.Constants_a);
		for(int i = 0; i < Constants2.values().length; i++){
			System.out.println(Constants2.values()[i].ordinal());
		}
	}
}
