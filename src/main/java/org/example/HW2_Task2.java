package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HW2_Task2 {
    public static void main(String[] args) {
        int Ax = 1;
        int Ay = 5;
        int Bx = 3;
        int By = 5;
        int Cx = 6;
        int Cy = 7;
        var a = Math.sqrt(Math.pow((Bx-Ax),2) + Math.pow((By-Ay),2));
        var b = Math.sqrt(Math.pow((Cx-Bx),2) + Math.pow((Cy-By),2));
        var c = Math.sqrt(Math.pow((Ax-Cx),2) + Math.pow((Ay-Cy),2));
        var p = (a+b+c)/2;

        var s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
        }
    }
