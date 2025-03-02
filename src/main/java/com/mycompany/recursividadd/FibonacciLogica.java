
package com.mycompany.recursividadd;



public class FibonacciLogica {

    public static int[] generarFibonacci(int longitud) {
        if (longitud <= 0) {
            return new int[0];
        }

        int[] fibonacciSeries = new int[longitud];
        if (longitud >= 1) {
            fibonacciSeries[0] = 0;
        }
        if (longitud >= 2) {
            fibonacciSeries[1] = 1;
        }

        for (int i = 2; i < longitud; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        return fibonacciSeries;
    }
}
