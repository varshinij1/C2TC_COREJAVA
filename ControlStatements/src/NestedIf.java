
public class NestedIf {

	public static void main(String[] args) {
		String lang="java";
		if(lang== "HLL & IL") {
			if(lang=="python") {
				System.out.println("lang is python");
			}else if(lang=="Java") {
				System.out.println("lang is Java");
			}else {
				System.out.println(lang);
			}
		}
		System.out.println(lang);
	}

}
