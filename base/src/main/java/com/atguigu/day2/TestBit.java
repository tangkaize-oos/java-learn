package com.atguigu.day2;

/**
 * @Auther: 唐凯泽
 * @Date: 2020/5/5 16:44
 * @Descprition:
 */
 /*
六、位运算符
1、右移：>>
	左边不够的补xx，补什么看最高位，最高位是0就补0，是1就补1
	简单的算法：右移几位，相当于除以2的几次方
2、左移：<<
	左移，右边补0
	简单的算法：左移几位，相当于乘以2的几次方

3、无符号右移：>>>
	左边的不管最高位是xx，统统都补0

4、按位与：&
	1 & 1 结果是1
	1 & 0 结果为0
	0 & 1 结果为0
	0 & 0 结果为0
5、按位或：|
	1 | 1 结果是1
	1 | 0 结果为|
	0 | 1 结果为|
	0 | 0 结果为0
6、按位异或：^
	1 ^ 1 结果是0
	1 ^ 0 结果为|
	0 ^ 1 结果为|
	0 ^ 0 结果为0
7、按位取反：~

位运算符是用整数的二进制，并且是补码来运算的。

开发很少用，但是源代码中有

*/
//TODO(位移不懂)
public class TestBit {
    public static void main(String[] args) {
        byte b = 8;
        //b = 8,二进制补码: 0000 1000
        // b>>2
        //0000 00 10
        System.out.println(b >> 2); //2
        //简单算：8/2的2次方 即 8/4

        byte b2 = -8;
        //b2 = -8 ,二进制补码：1111 1000
        // b2 >>2
        // 11111 10
        System.out.println(b2 >> 2);
        //简单算：-8/2 的2 次方  即 -8/4

        System.out.println(128 >> 3); //116 128/2的3次方

        byte c = 8;
        //c = 8,二进制补码：0000 1000
        // b<<2,00 100000
        System.out.println(b << 2); //32

        byte d = 8;
        System.out.println(d >>> 2); //2
        byte d2 = -8;
        // d2 = -8 ,
        // 二进制补码：1111 1111 1111 1111 1111 1111 1111 1000，无符号右移，看成是int类型
        //无符号右移：001111 1111 1111 1111 1111 1111 1111 10
        System.out.println(d2 >>> 2);

        System.out.println(1 & 2);//0000 0001 & 0000 0010 结果 0000 0000
        System.out.println(1 | 2);//0000 0001 | 0000 0010 结果 0000 0011
        System.out.println(4 ^ 9);//0000 0100 ^ 0000 1001 结果 0000 1101
        System.out.println(~2);//0000 0010 取反 1111 1101补码 ，反码 1111 1100 ，原码 1000 0011
    }

}