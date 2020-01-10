package com.processing;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                //create an array to store integer
                int[] arrInt = new int[10];

                //print the array
                System.out.println("printing array with the default values ");
                for(int i = 0; i < arrInt.length; i++) {
                    System.out.println(arrInt[i]);
                    System.out.println(",");
                }
                System.out.println();

                //static initialization of array
                arrInt[0] = 100;
                arrInt[1] = 110;
                arrInt[2] = 120;
                arrInt[3] = 130;
                arrInt[4] = 140;
                arrInt[5] = 150;
                arrInt[6] = 160;
                arrInt[7] = 170;
                arrInt[8] = 180;
                arrInt[9] = 190;

                //print
                System.out.println("printing Array with static initialized values ");
                for(int i = 0; i < arrInt.length; i++) {
                    System.out.println(arrInt[i]);
                    System.out.println(",");
                }
                System.out.println();

                //command line arguments
                for(int i = 0; i < args.length && i < arrInt.length; i++) {
                    arrInt[i] = Integer.parseInt(args[i]);
                }

                //print
                System.out.println("printing Array with initialized by command line values ");
                for(int i = 0; i < arrInt.length; i++) {
                    System.out.println(arrInt[i]);
                    System.out.println(",");
                }
                System.out.println();

                //user initialization of array using scanner class
                Scanner sc = new Scanner(System.in);
                System.out.println("enter 10 integers");
                for(int i = 0; i < arrInt.length; i++) {
                    arrInt[i] = sc.nextInt();
                }

                //print
                System.out.println("printing Array with initialized user input values ");
                for(int i = 0; i < arrInt.length; i++) {
                    System.out.println(arrInt[i]);
                    System.out.println(",");
                }
                System.out.println();

                //sum and average of all the elements
                int sum = 0;
                for(int i = 0; i < arrInt.length; i++) {
                    sum = sum + arrInt[i];
                }
                System.out.println("sum= " +sum);
                double average = (double)sum/arrInt.length;
                System.out.println("average= " +average);

            }
        }
