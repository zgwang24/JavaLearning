package enumeration.simple;

public class EnumIndexTest {
	enum Constants{
		Constants_A("a"),
		Constants_B("b"),
		Constants_C(1);
		
		private String des;
		private int i = 4;
		
		private Constants(){
			
		}
		
		private Constants(String des){
			this.des = des;
		}
		
		private Constants(int i){
			this.i = this.i + i;
		}
		
		public String getDes(){
			return des;
		}
		
		public int getI(){
			return i;
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < Constants.values().length; i++){
			System.out.println(Constants.values()[i] + "---" + Constants.values()[i].getDes());
		}
		System.out.println(Constants.valueOf("Constants_C") + "---" + Constants.valueOf("Constants_C").getI());
	}
}
