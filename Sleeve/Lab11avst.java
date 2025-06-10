package Sleeve;

// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.
import java.util.Scanner;



// Lab11avst.java
// The "Sieve of Eratosthenes" Program


import java.util.Scanner;


        public class Lab11avst {
            public static void main(String[] args) {
                final int MAX = 100;
                boolean primes[] = new boolean[MAX];
                computePrimes(primes);
                displayPrimes(primes);
            }


            public static void computePrimes(boolean primes[]) {
                System.out.println("\nCOMPUTING PRIME NUMBERS");


                // Set all values to true initially, except index 0 and 1
                for (int i = 2; i < primes.length; i++) {
                    primes[i] = true;
                }


                // Sieve
                for (int i = 2; i * i < primes.length; i++) {
                    if (primes[i]) {
                        for (int j = i * i; j < primes.length; j += i) {
                            primes[j] = false;
                        }
                    }
                } 0
            }


            public static void displayPrimes(boolean primes[]) {
                System.out.println("\n\nPRIMES BETWEEN 1 AND " + (primes.length - 1));
                for (int i = 2; i < primes.length; i++) {
                    if (primes[i]) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        }


