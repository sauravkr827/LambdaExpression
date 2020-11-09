package com.nendrasys.test;

public class IncrementExampleImplementatin

{

    public static void main(String args[])
    {
        IncrementExample incrementExample=(a) ->
        {
            return a+12;
        };


        System.out.println(incrementExample.increament(100));
    }
}
