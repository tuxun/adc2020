/*
https://adventofcode.com/2020/day/12020
Find the two entries that sum to  what do you get if you multiply them together?
 */
package org.tflsh.adc2020;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;
import java.io.IOException;


public class Exo1 {

    protected static List<String>  inputs=new ArrayList();



    static boolean importInput() {
        //initialize Path object
        Path path = Paths.get("./file.txt");
        Charset charset = Charset.forName("ISO-8859-1"); //create file
        try {
            inputs = Files.readAllLines(path, charset);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

  static   boolean testIfSumEquals2020(long n1, long n2){
        if((n1+n2)==2020)
        {
            System.out.println(n1+"+"+n2+" = 2020, A.B="+n1*n2);
            return true;

        }
        return false;
    }
static   boolean testIfSumEquals2020_2(long n1, long n2, long n3){
        if((n1+n2+n3)==2020)
        {
            System.out.println(n1+"+"+n2+"+"+n3+" = 2020, A.B.C="+n1*n2*n3);
            return true;

        }
        return false;
    }
    public static void ex1_1()
    {
        for(int i=0;i< inputs.size()-1;i++)
        {
            for(int j=1;j< inputs.size();j++) {
                testIfSumEquals2020(Long.parseLong(inputs.get(i)),Long.parseLong(inputs.get(j)));
            }



        }
    }

    public static void ex1_2()
    {
        for(int i=0;i< inputs.size()-1;i++)
        {
            for(int j=1;j< inputs.size();j++) {

                for(int k=2;k< inputs.size();k++) {
                    testIfSumEquals2020_2(Long.parseLong(inputs.get(i)),Long.parseLong(inputs.get(j)),Long.parseLong(inputs.get(k)));
                }

            }



        }
    }


    public static void main(String[] args)
        {
        importInput();
        ex1_1();
        ex1_2();
    }

}



