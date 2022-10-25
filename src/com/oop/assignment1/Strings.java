package com.oop.assignment1;

public class Strings {

	public static void string(String s1) {
		s1 = "change";

	}

//	public static void arr(String[] arr) {
//		arr[0] = "hello";
//
//	}

	public static void main(String[] args) {
//		String s1 = "Abc";
//		s1 = "cdef";
//		System.out.println(s1);
//		String s3 = new String("Abc");
//		System.out.println(s1.equals(s3));
//		String s1 = " abc";
//		string(s1);
//		System.out.println(s1);
//
//		String[] str = { "abc", "Cdef" };
//		str[0] = "hello";
//		System.out.println(str);
		String str = new String("A");
		String str2 = new String("A");
		str = "A";
		str2 = new String("A");
		System.out.println(str == str2);

	}

}
