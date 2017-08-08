package genericity;

public interface i<T1> {
	class SubClass<T1, T2, T3> implements i<T1>{}
}
