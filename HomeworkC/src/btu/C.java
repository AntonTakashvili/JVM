package btu;

import java.util.Scanner;

public class C {
    private int a, b, c;

    public C() {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        System.out.print("Input the third number: ");
        int c = input.nextInt();
    }

    public int returnLastDigitOfA() {

        return this.a % 10;
    }

    public int returnFirstDigitOfB() {
        int x = this.b;
        while (x > 10) {
            x /= 10;
        }
        return x;
        }

    public int sumOfAllCDigits() {
        int C = this.c;
        int result = 0;
        while (C > 0) {
            result = result + (C % 10);
            C = C / 10;
        }

        return result;
    }
    public int multiplicationSecondToThirdMethod(){
        int Multiply = this.returnLastDigitOfA() * this.returnFirstDigitOfB();
        System.out.println(Multiply);
        return 0;
    }
    public void sumOfThirdAndFifth(){
        int M;
        M = this.returnFirstDigitOfB() + this.multiplicationSecondToThirdMethod();
        System.out.println(M);
    }

}
