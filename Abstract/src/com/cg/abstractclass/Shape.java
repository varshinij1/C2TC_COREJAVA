package com.cg.abstractclass;

abstract class Shape {
	abstract void draw();
}
	class rectangle extends Shape {
		void draw () {
			System.out.println("drawing rectangle");
		}
	}
			class Circle extends Shape {
				void draw () {
					System.out.println("drawing circle");
				}
			
		
	

	public static void main(String[] args) {
		Shape s=new rectangle();
		s.draw();
		
		
	}
			}


