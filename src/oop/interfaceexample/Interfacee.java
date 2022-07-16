package oop.interfaceexample;

import java.io.*;

// A simple interface
interface In1 {

    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}
public class Interfacee implements In1{

    public void display(){
        System.out.println("Geek");
    }

    // Driver Code
    public static void main(String[] args)
    {
        Interfacee t = new Interfacee();
        t.display();
        System.out.println(a);
    }


}
