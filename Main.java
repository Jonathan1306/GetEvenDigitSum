package com.company;

public class Main {

    public static void main(String[] args) {
		
        System.out.println(getEvenDigitSum(2000));
        System.out.println(getEvenDigitSum(100));
        System.out.println(getEvenDigitSum(200));
        System.out.println(getEvenDigitSum(246));
        System.out.println(getEvenDigitSum(-246));
		
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;

        if(number < 0){ 
            return -1;
        }

        while(number>0){
            int temp = number%10;

            if (temp%2 == 0){
                sum += temp;
                number /= 10; 
            } else {
                number /= 10;
            }
        }
    return sum;
    };
}




