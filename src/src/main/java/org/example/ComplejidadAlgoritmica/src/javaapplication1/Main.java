/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.ComplejidadAlgoritmica.src.javaapplication1;



public class Main {

    public static void main(String[] args) {
        MetodosPrueba mp = new MetodosPrueba();

        long inicio = System.currentTimeMillis();
        mp.m1(10);
        long fin = System.currentTimeMillis();
        long t1 = (fin - inicio) / 1000;
        double t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m1 (long): " + t1);
        System.out.println("Tiempo m1 (Double): " + t2);

        inicio = System.currentTimeMillis();
        mp.m2(10);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m2 (long): " + t1);
        System.out.println("Tiempo m2 (Double): " + t2);

        inicio = System.currentTimeMillis();
        mp.m3(10);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m3 (long): " + t1);
        System.out.println("Tiempo m3 (Double): " + t2);

        inicio = System.currentTimeMillis();
        mp.m4(2);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m4 (long): " + t1);
        System.out.println("Tiempo m4 (Double): " + t2);

        inicio = System.currentTimeMillis();
        mp.m5(10);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m5 (long): " + t1);
        System.out.println("Tiempo m5 (Double): " + t2);

        inicio = System.currentTimeMillis();
        mp.m6(10);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m6 (long): " + t1);
        System.out.println("Tiempo m6 (Double): " + t2);

        inicio = System.currentTimeMillis();
        mp.m7(10);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m7 (long): " + t1);
        System.out.println("Tiempo m7 (Double): " + t2);
    }
}

