package com.nendrasys.test;

interface  F
{
    public void m1();
}


public class Example10
{

    public static void hello()
    {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        //Method Reference
       /*F f=Example10::hello;

       f.m1();*/


        //LambdaExpression
        F f=()->
        {
            System.out.println("hello");
        };
         f.m1();

    }
}


