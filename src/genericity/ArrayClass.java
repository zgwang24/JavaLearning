package genericity;

public class ArrayClass<T> {
	private T[] array;
	
	public void setT(T[] array){
		this.array = array;
	}
	
	public T[] getT(){
		return array;
	}
	
	public static void main(String[] args) {
		ArrayClass<String> a = new ArrayClass<String>();
		String[] arr = {"num1", "num2", "num3", "num4"};
		a.setT(arr);
		for(int i = 0; i < a.getT().length; i++){
			System.out.print(a.getT()[i] + " ");
		}
	}
}
