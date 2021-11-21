/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ru.avalon.javapp.devj110.halfDivisionMethod;

import java.math.MathContext;

/**
 *
 * @author bezdetk0@mail.ru
 */
public class Main {
private static final double EPS = 1e-5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Function f1 = new F1();    // вложенный класс
    System.out.println(RootHDM.rootHDM(f1, 0.01, 2, EPS));    
    
    
    Function f2 = new Function() { // анонимный класс
        public double f(double x) {
        return Math.sin(x) - 0.75;
    }       
    };
    System.out.println(RootHDM.rootHDM(f2, 2, 3, EPS));
    
    Function f3 = RootHDM::Static;      // статический метод
    System.out.println(RootHDM.rootHDM(f3, 1, 3, EPS));
        
    F4 func4 = new F4();    // ссылка на метод экземпляра
    Function f4 = func4::tang; // ссылка на метод экземпляра
    System.out.println(RootHDM.rootHDM(f4, 2, 4, EPS));
    
    
    Function f5 = x -> x*x*x - 8*x + 2; // лямбда выражение
        System.out.println(RootHDM.rootHDM(f5, 1, 5, EPS));
    
    }
    
    
    
   
    
        private static class F1 implements Function { // вложенный класс
        @Override
        public double f(double x) {
            return Math.exp(-x) - 0.5;
        }
    }
        
       
}
