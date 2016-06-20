package com.lee.object;

public class Install {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		
		Animal dog = new Dog();
		dog.eat();
		Animal cat = new Cat();
		cat.eat();
		
		
		//对象转换
		Cat cat1 = (Cat)cat; //向下强制转换
		cat1.eat();
		
		
		if(dog instanceof Cat){

			//对象转换
			Cat cat2 = (Cat)dog; //向下强制转换 出错，因为他是不同的对象 
			cat2.eat();	
		}else{
			System.out.println("不能转换");
		}
		
		
	}
}
