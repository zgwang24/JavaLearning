package exception;

public class Tran {
	static int avg(int number1, int number2) throws MyException{
		if(number1 < 0 || number2 < 0){
			throw new MyException("negative");
		}
		if(number1 > 100 || number2 > 100){
			throw new MyException("too big");
		}
		return (number1 + number2) / 2;
	} 
	public static void main(String[] args) {
		try{
			int res = avg(106, 190);
			System.out.println(res);
		}catch(MyException e){
			System.out.println(e);
		}
	}
}
