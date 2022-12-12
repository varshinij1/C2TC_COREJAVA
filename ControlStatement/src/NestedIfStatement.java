
public class NestedIfStatement {

	public static void main(String[] args) {
		String lang="java";
		if(lang=="HTML|| Python") {
			if(lang=="Python") {
				System.out.println("language is python");
			}else if(lang=="c++") {
				System.out.println("language is c++");
			}
		}else if(lang=="java") {
			System.out.println("lang is java");
		}else {
			System.out.println(lang);
		}

	}

}
