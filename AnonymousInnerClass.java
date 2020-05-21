package anonymousinnerClass;

/*
 匿名内部クラス
 https://java.keicode.com/lang/anonymous-inner-class.php
 */

public class AnonymousInnerClass {
	public static void main(String[] args) {

		MyInterface1 mi = new MyInterface1() {
			public void foo() {
				System.out.println("Hello, anon class!");
			}
		};

		MyClass1 mc = new MyClass1() {
			@Override
			public void bar() {
				super.bar();
				System.out.println("ANON: Hello, bar()!");
			}
		};

		mi.foo();
		mc.bar();
	}
}

interface MyInterface1{
	void foo();
}

class MyClass1{
	public void bar() {
		System.out.println("ORIGINAL: I'm bar():");
	}
}
