package enumeration;

interface d {
	public String getDescription();
	public int getI();
}
public enum AnyEnum implements d{
	Constants_A{
		@Override
		public String getDescription() {
			return "A";
		}

		@Override
		public int getI() {
			return i;
		}	
	},
	Constants_B{
		@Override
		public String getDescription() {
			return "B";
		}

		@Override
		public int getI() {
			return i;
		}	
	},
	Constants_C{
		@Override
		public String getDescription() {
			return "C";
		}

		@Override
		public int getI() {
			return i;
		}	
	},
	Constants_D{
		@Override
		public String getDescription() {
			return "D";
		}

		@Override
		public int getI() {
			return i;
		}	
	};
	private static int i = 5;
	public static void main(String[] args) {
		for(int i = 0; i < AnyEnum.values().length; i++){
			System.out.println(AnyEnum.values()[i] + "---" + AnyEnum.values()[i].getDescription());
			System.out.println(AnyEnum.values()[i] + "---" + AnyEnum.values()[i].getI());
		}
	}
}
