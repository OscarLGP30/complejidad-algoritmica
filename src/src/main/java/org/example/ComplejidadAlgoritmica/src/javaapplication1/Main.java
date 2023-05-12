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
        //mp.m1(10);
        //mp.m1(20);
        //mp.m1(30);
        //mp.m1(40);
        //mp.m1(50);
        //mp.m1(60);
        //mp.m1(70);
        long fin = System.currentTimeMillis();
        long t1 = (fin - inicio) / 1000;
        double t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m1 (long): " + t1);
        System.out.println("Tiempo m1 (Double): " + t2);

        inicio = System.currentTimeMillis();
        //mp.m2(10);
        //mp.m2(20);
        //mp.m2(30);
        //mp.m2(40);
        //mp.m2(50);
        //mp.m2(60);
        //mp.m2(70);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m2 (long): " + t1);
        System.out.println("Tiempo m2 (Double): " + t2);

        inicio = System.currentTimeMillis();
        //mp.m3(10);
        //mp.m3(20);
        //mp.m3(30);
        //mp.m3(40);
        //mp.m3(50);
        //mp.m3(60);
        //mp.m3(70);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m3 (long): " + t1);
        System.out.println("Tiempo m3 (Double): " + t2);

        inicio = System.currentTimeMillis();
        //mp.m4(1);
        //mp.m4(2);
        //mp.m4(3);
        //mp.m4(4);
        //mp.m4(5);
        //mp.m4(6);
        //mp.m4(7);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m4 (long): " + t1);
        System.out.println("Tiempo m4 (Double): " + t2);

        inicio = System.currentTimeMillis();
        //mp.m5(10);
        //mp.m5(20);
        //mp.m5(30);
        //mp.m5(40);
        //mp.m5(50);
        //mp.m5(60);
        //mp.m5(70);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m5 (long): " + t1);
        System.out.println("Tiempo m5 (Double): " + t2);

        inicio = System.currentTimeMillis();
        //mp.m6(10);
        //mp.m6(20);
        //mp.m6(30);
        //mp.m6(40);
        //mp.m6(50);
        //mp.m6(60);
        //mp.m6(70);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m6 (long): " + t1);
        System.out.println("Tiempo m6 (Double): " + t2);

        inicio = System.currentTimeMillis();
        //mp.m7(10);
        //mp.m7(20);
        //mp.m7(30);
        //mp.m7(40);
        //mp.m7(50);
        //mp.m7(60);
        //mp.m7(70);
        fin = System.currentTimeMillis();
        t1 = (fin - inicio) / 1000;
        t2 = (double) (fin - inicio) / 1000;
        System.out.println("Tiempo m7 (long): " + t1);
        System.out.println("Tiempo m7 (Double): " + t2);
    }
}

