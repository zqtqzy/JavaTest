package com.test1;

public class Array {
	public static void main(String[] args) {
//		Array.createArray();
//		Array.useArray();
		Array.forEach();
	}
	
	public static void createArray() {
		// 数组大小
	      int size = 10;
	      // 定义数组
	      double[] myList = new double[size];
	      myList[0] = 5.6;
	      myList[1] = 4.5;
	      myList[2] = 3.3;
	      myList[3] = 13.2;
	      myList[4] = 4.0;
	      myList[5] = 34.33;
	      myList[6] = 34.0;
	      myList[7] = 45.45;
	      myList[8] = 99.993;
	      myList[9] = 11123;
	      // 计算所有元素的总和
	      double total = 0;
	      for (int i = 0; i < size; i++) {
	         total += myList[i];
	      }
	      System.out.println("总和为： " + total);
	}
	
	public static void useArray() {
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		 
	      // 打印所有数组元素
	      for (int i = 0; i < myList.length; i++) {
	         System.out.println(myList[i] + " ");
	      }
	      // 计算所有元素的总和
	      double total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      // 查找最大元素
	      double max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);
	}
	
	public static void forEach() {
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		 
	      // 打印所有数组元素
	      for (double element: myList) {
	         System.out.println(element);
	      }
	}
	
}
