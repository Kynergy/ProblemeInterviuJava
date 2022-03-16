package com.company;

public class Main {

    public static void main(String[] args) {
         /*public static boolean palindrom(int x){
         int a = 0;
         int b = x;
             while (a>0);{


     }
 }*/
      //  int x[] = {35, 36, 49, 36, 35};
       // System.out.println(isPalindrome(x));
        int n = 54748;
        System.out.println(Armstrong(n));
        for(int i = 0; i < 1000; i++){
            if(Armstrong(i)){
                System.out.println(i);
            }
        }

    }

    /*public static boolean isPalindrome(int[] x) {
        int n = x.length;
        for (int i = 0; i < n / 2; i++) {
            if (x[i] != x[n - i - 1]) {
                return false;
            }
        }
        return true;
    }*/


    public static boolean Armstrong(int n) {
        int s = 0;
        int number;
        int y;
        int cif = cifre(n) <3 ? 3:cifre(n);
        number = n;
        while (number >0){
            y = number % 10;
            s += Math.pow(y,cif);
            number = number /10;
        }
        if(n==s){
           return true;
        }
            return false;

    }
    public static int cifre(int n){
        int nr = 0;
        while(n!=0){
            nr++;
            n= n/10;
        }
        return nr;
    }

}



