package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW2_Task2 {
    public static void main(String[] args) {
        int ax = 1;
        int ay = 5;
        int bx = 3;
        int by = 5;
        int cx = 6;
        int cy = 7;
        var a = Math.sqrt(Math.pow((bx-ax),2) + Math.pow((by-ay),2));
        var b = Math.sqrt(Math.pow((cx-bx),2) + Math.pow((cy-by),2));
        var c = Math.sqrt(Math.pow((ax-cx),2) + Math.pow((ay-cy),2));
        var p = (a+b+c)/2;

        var s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
        }
    }
