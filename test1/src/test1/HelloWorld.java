package test1;

import test1.FreshJuice.FreshJuiceSize;
import test1.dog;

class FreshJuice{
		enum FreshJuiceSize{ SMALL,MEDIUM,LARGE };
		FreshJuiceSize size;
}

public class HelloWorld {
	public static void main(String[] args){
		FreshJuice juice = new FreshJuice();
		dog dog1 = new dog("puppy", 5, "red");
		dog1.bark();
		dog.classBark();
		juice.size = FreshJuiceSize.LARGE;
	}
}
