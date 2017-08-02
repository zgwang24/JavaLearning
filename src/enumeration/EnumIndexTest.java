package enumeration;

public class EnumIndexTest {
	enum Constants2{
		Constants_A("A"), Constants_B("B"), Constants_C("C"), Constants_D(6);
		private String description;
		private int i = 4;
		
		private Constants2(){
			
		}
		
		private Constants2(String description){
			this.description = description;
		}
		
		private Constants2(int i){
			this.i = this.i + i;
		}
		
		public String getDescription(){
			return description;
		}
		
		public int geyI(){
			return i;
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < Constants2.values().length; i++){
			System.out.println(Constants2.values()[i] + "---" + Constants2.values()[i].getDescription());
		}
		System.out.println(Constants2.valueOf("Constants_D") + "---" + Constants2.valueOf("Constants_D").geyI());
	}
}
