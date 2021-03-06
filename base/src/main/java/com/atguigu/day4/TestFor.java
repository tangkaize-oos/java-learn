package com.atguigu.day4;

/*
循环：重复执行某些语句
一、for循环
语法结构：
for(;;){
	循环体：需要重复执行的语句块
}
说明：
（1）for(;;)两个分号不能省略
（2）只有需要重复执行多次的代码才能放到循环体中{}
（3）需要加上条件等来控制循环的次数，否则就是死循环

语法结构：
for(【初始化表达式1】;【循环条件表达式2】;【迭代表达式3】){
	循环体：需要重复执行的语句块4
}

执行过程：
（1）先执行【初始化表达式1】
（2）判断【循环条件表达式2】是否成立，为true
（3）如果成立，就执行循环体语句块4
（4）接着执行【迭代表达式3】
（5）回到（2）
（6）直到【循环条件表达式2】不成立，为false，然后就结束

*/
class TestFor{
	public static void main(String[] args){
		//重复打印5次
		for(int i=0; i<5; i++){
			System.out.println("柴老师是大美女！");
		}
		/*
		(1)int i=0;
		(2)i<5;是否成立
		(3)执行循环体语句   System.out.println("柴老师是大美女！");
		(4)i++  i=1
		(5)i<5;是否成立
		(6)执行循环体语句   System.out.println("柴老师是大美女！");
		(7)i++  i=2
		(8)i<5;是否成立
		(9)执行循环体语句   System.out.println("柴老师是大美女！");
		(10)i++ i=3
		(11)i<5;是否成立
		(12)执行循环体语句   System.out.println("柴老师是大美女！");
		(13)i++ i=4
		(14)i<5;是否成立
		(15)执行循环体语句   System.out.println("柴老师是大美女！");
		(16)i++ i=5
		(17)i<5;是否成立  不成立
		*/

	}
}