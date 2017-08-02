package genericity;

public class OverClass<T> {
	private T over;
	
	public T getOver(){
		return over;
	}
	
	public void setOver(T over){
		this.over = over;
	}
	
	public static void main(String[] args) {
		OverClass<Boolean> over1 = new OverClass<Boolean>();
		OverClass<Float> over2 = new OverClass<Float>();
		over1.setOver(true);
		over2.setOver(67.9F);
		System.out.println(over1.getOver());
		System.out.println(over2.getOver());
	}
}
