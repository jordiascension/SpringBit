package com.privalia.singletonpattern;

public class MainSingleton {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		if (s1 == s2) {
			System.out.println("Las dos variables apuntan al mismo objeto");
		}
	}
}
