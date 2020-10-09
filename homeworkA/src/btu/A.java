package btu;

import java.util.Scanner;

public class A {
    int x;

    public A(){
        System.out.println("Hello");
    }

    public void start(){
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
    }

    public void plus(){
        System.out.println(x+12);
    }

    public void evenOrOdd(){
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {

        A object = new A();
        object.start();
        object.plus();
        object.evenOrOdd();
        B object1 = new B();
        object1.start2();
        object1.sumOfTwo();
    }

}
class B extends A{
    int y;

    public void start2() {
        Scanner input = new Scanner(System.in);
        y = input.nextInt();
    }
    public int sumOfTwo(){
        return this.x + this.y;
    }
}
