package org.hotel.algorithm;

public class HomeTryOuts {
    public static void main(String[] args) {
        int num = 256;
        if (num < 24) {
            System.out.println("balance is low");
        }
        else if (num >24 && num <151) {
            System.out.println("warning balance is running low");

        }
        else if (num >151 && num <351) {
            System.out.println("enough balance");
        }
        else

            {
            System.out.println("balance full");
        }
    }
}
