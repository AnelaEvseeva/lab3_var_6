package com.company;

import java.util.Scanner;

class Number{
    int value;
    Number next;

    public Number(int value, Number next){
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Number{" +
                "value=" + value +
                ", next=" + next +
                "}";
    }
}
public class Main {
    static Scanner sc;
    public static double[] findSAS(Number head){
        double sum = 0;
        double n = 0;

        Number ref = head;
        while (ref.next!=null){
            if(ref.value%2!=0){
                sum = sum + ref.value;
                n++;
            }
            ref=ref.next;
        }
        if (ref.value%2!=0){
            sum = sum + ref.value;
            n++;
        }
        return new double[]{sum,n,(double)sum/n};
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        Number head = null;
        for (int i = 0; i<n; i++){
            int value = sc.nextInt();
            head = new Number(value, head);
        }
        System.out.println(head);
        double sum = findSAS(head)[0];
        double k = findSAS(head)[1];
        double sr = findSAS(head)[2];
        System.out.println(sum);
        System.out.println(k);
        System.out.println(sr);
    }
}
