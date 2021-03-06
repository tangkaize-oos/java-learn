package com.liaoxuefeng.bObject.bCoreClass.cEnum;

enum Weekday1 {
    MON, TUE, WED, THU, FRI, SAT, SUN

}

/**
 * @author: 李将
 * @since: 2020/6/2 14:25
 * @Descprition:
 */
public class TestSwich {
    public static void main(String[] args) {
        Weekday1 day = Weekday1.SUN;

        switch (day) {
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is " + day + ". Work at office!");
                break;
            case SAT:
            case SUN:
                System.out.println("Today is " + day + ". Work at home!");
                break;
            default:
                throw new RuntimeException("cannot process " + day);
        }
    }
}

