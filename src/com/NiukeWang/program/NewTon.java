package com.NiukeWang.program;

import java.util.Scanner;
public class NewTon {
public static double getCubeRoot(double input) {
    double x = 1.0;
    while(Math.abs(x*x*x - input) > 1e-7) {
        x = (2 * x + input / x / x) / 3;
    }
    return x;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
        double n = sc.nextDouble();
        double result = getCubeRoot(n);
        System.out.println(String.format("%.1f", result));
    }
    sc.close();
}
}