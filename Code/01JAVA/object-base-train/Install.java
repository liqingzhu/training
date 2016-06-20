package com.lee.object;

public class Install {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		
		Animal dog = new Dog();
		dog.eat();
		Animal cat = new Cat();
		cat.eat();
		
		
		//����ת��
		Cat cat1 = (Cat)cat; //����ǿ��ת��
		cat1.eat();
		
		
		if(dog instanceof Cat){

			//����ת��
			Cat cat2 = (Cat)dog; //����ǿ��ת�� ������Ϊ���ǲ�ͬ�Ķ��� 
			cat2.eat();	
		}else{
			System.out.println("����ת��");
		}
		
		
	}
}
