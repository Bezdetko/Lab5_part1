/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ru.avalon.javapp.devj110.halfDivisionMethod;


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
    System.out.println(rootHDM(f1, 0.01, 2, EPS));    
    
    
    Function f2 = new Function() { // анонимный класс
        public double f(double x) {
        return Math.sin(x) - 0.75;
    }       
    };
    System.out.println(rootHDM(f2, 2, 3, EPS));
    
    Function f3 = Function::staticMeth;      // статический метод
    System.out.println(rootHDM(f3, 1, 3, EPS));
        
    F4 func4 = new F4();    // ссылка на метод экземпляра
    Function f4 = func4::tang; // ссылка на метод экземпляра
    System.out.println(rootHDM(f4, 2, 4, EPS));
    
    
    Function f5 = x -> x*x*x - 8*x + 2; // лямбда выражение
        System.out.println(rootHDM(f5, 1, 5, EPS));
    
    }
    
        public static double rootHDM (Function function, double left, double right, double eps) {
        double x = 0; 
          if (function.f(left) * function.f(right) < 0){ //проверка условия на сходимость
          for (int i=0; ;i++){  
              x =(left+right)/2;
              if (Math.abs(function.f(x)) < eps) {  // проверка на точность
                  break;}
                  else {
                          if (function.f(left)*function.f(x)<0)
                              right = x;
                          else 
                              left = x;                   
                  }                                  
              }
          }        
        return x;
    } 
        
    
        private static class F1 implements Function { // вложенный класс
        @Override
        public double f(double x) {
            return Math.exp(-x) - 0.5;
        }
    }
        
       
}
