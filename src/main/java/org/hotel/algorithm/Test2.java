package org.hotel.algorithm;

public class Test2 {
    public static void main(String[] args) {
        int mark = 19;
        if (mark <40){
            System.out.println("Scored F");
        } else if (mark >= 40 && mark <= 49) {
            System.out.println("Scored D");
        }else if (mark >= 50 && mark <= 59) {
            System.out.println("Scored C");
        }else if (mark >= 60 && mark <= 69) {
            System.out.println("Scored B");
        }else if (mark >= 70 && mark <= 90) {
            System.out.println("Scored A");
        } else {
            System.out.println("Scored A++");
        }
    }
}
