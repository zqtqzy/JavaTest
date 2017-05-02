package com.test1;

public class Operator {

	public static void main(String args[]) {
		Operator newOp = new Operator();
//		newOp.mainOperator(); //基本运算符
//		newOp.selfAddMinus(); //自增自减
//		newOp.relationalOperator(); //关系运算符
//		newOp.bitwiseOperator(); //位运算符
		newOp.logicalOperator(); //逻辑运算符
	}

	public void mainOperator() {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a + b = " + (a + b) );
		System.out.println("a - b = " + (a - b) );
		System.out.println("a * b = " + (a * b) );
		System.out.println("b / a = " + (b / a) );
		System.out.println("b % a = " + (b % a) );
		System.out.println("c % a = " + (c % a) );
		System.out.println("a++   = " +  (a++) );
		System.out.println("a--   = " +  (a--) );
		// 查看  d++ 与 ++d 的不同
		System.out.println("d++   = " +  (d++) );
		System.out.println("++d   = " +  (++d) );
	}

	public void selfAddMinus() {
		int a = 5;//定义一个变量；
		int b = 5;
		int x = 2*++a;
		int y = 2*b++;
		System.out.println("自增运算符前缀运算后a="+a+",x="+x);
		System.out.println("自增运算符后缀运算后b="+b+",y="+y);
	}

	public void relationalOperator() {
		int a = 10;
		int b = 20;
		System.out.println("a == b = " + (a == b) );
		System.out.println("a != b = " + (a != b) );
		System.out.println("a > b = " + (a > b) );
		System.out.println("a < b = " + (a < b) );
		System.out.println("b >= a = " + (b >= a) );
		System.out.println("b <= a = " + (b <= a) );
	}

	public void bitwiseOperator() {
		int a = 60; /* 60 = 0011 1100 */ 
		int b = 13; /* 13 = 0000 1101 */
		int c = 0;
		c = a & b;       /* 12 = 0000 1100 */
		System.out.println("a & b = " + c );

		c = a | b;       /* 61 = 0011 1101 */
		System.out.println("a | b = " + c );

		c = a ^ b;       /* 49 = 0011 0001 */
		System.out.println("a ^ b = " + c );

		c = ~a;          /*-61 = 1100 0011 */
		System.out.println("~a = " + c );

		c = a << 2;     /* 240 = 1111 0000 */
		System.out.println("a << 2 = " + c );

		c = a >> 2;     /* 15 = 1111 */
		System.out.println("a >> 2  = " + c );

		c = a >>> 2;     /* 15 = 0000 1111 */
		System.out.println("a >>> 2 = " + c );
	}
	
	public void logicalOperator() {
		 boolean a = true;
	     boolean b = false;
	     System.out.println("a && b = " + (a&&b));
	     System.out.println("a || b = " + (a||b) );
	     System.out.println("!(a && b) = " + !(a && b));
	}

}
