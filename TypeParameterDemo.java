package com.difault_lambda_exmp;

class Accept<T>
{
	private T data;
	
	public Accept(T data) {
		super();
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
}
public class TypeParameterDemo {

	public static void main(String[] args) {
		Accept<Integer> accInt = new Accept<Integer>(12);
		System.out.println("Integer object is : "+accInt.getData());
		Accept<Double> accDob = new Accept<Double>(10.2);
		System.out.println("Double object is: "+accDob.getData());
		Accept<Boolean> accBol = new Accept<Boolean>(true);
		System.out.println("Boolean object is : "+ accBol.getClass());
		Accept<Student> accStd = new Accept<Student>(new Student());
		System.out.println("Student object is : "+accStd.getData());
	}

}

class Student {
	@Override
	public String toString() {
		return "Student";
	}
}
