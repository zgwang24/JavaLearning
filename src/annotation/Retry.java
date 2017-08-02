package annotation;

public @interface Retry {
	int interval() default 3;
	int time() default 300;
}
