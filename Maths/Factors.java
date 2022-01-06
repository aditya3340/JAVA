package Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        factors3(20);
    }
    //time --> O(n)
    static void factors1(int n){
        for (int i = 1; i <=n ; i++) {
            if (n%i==0){
                System.out.print(i + " ");
            }
        }
    }
    //time--> O(sqrt(n))
    static void factors2(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if ( n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    } //Here is a problem that it is not sorted some factors are in ascending and others are in descending

    //Now both time and space are O(sqrt(n))
    static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }
        for (int i = list.size() - 1 ; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");

        }
    }

}
