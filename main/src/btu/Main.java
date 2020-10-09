package btu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[40];

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a>b){
            int k = a;
            a = b;
            b = k;
        }
        for(int i=0;i<40;i++){
            int random = (int) (Math.random()* (b-a+1)+a);
            array[i] = random;

        }
        int Count_Even=0;
        int Count_Odd=0;

        int sum_odd=0;
        int sum_even=0;
        for(int i=0; i<array.length;i++){
            if(array[i]%2==0){
                Count_Even++;
                sum_even+=array[i];
            }else{
                Count_Odd++;
                sum_odd+=array[i];
            }
        }
        System.out.println("Even: " + Count_Even);
        System.out.println("Odd: " + Count_Odd);

        System.out.println("Sum of even: " + sum_even);
        System.out.println("Sum of Odd: " + sum_odd);

    }
}
