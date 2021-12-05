/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ru.avalon.javapp.devj110.halfDivisionMethod;

/**
 *
 * @author bezdetk0@mail.ru
 */
public interface Function {
    double f(double x);
        
    public static double staticMeth(double x) {
        return Math.log(x*x*x) - 2;
    }

    
    
//    default double rootHDM (Function function, double left, double right, double eps) {
////        if (function(left)*function(right)<0) //проверка условия на сходимость
//        double x = 0; 
//          if (function.f(left) * function.f(right) < 0){ //проверка условия на сходимость
////          double x;    
//          for (int i=0; ;i++){  
//              x =(left+right)/2;
//              if (Math.abs(function.f(x)) < eps) {  // проверка на точность
//                  break;}
//                  else {
//                          if (function.f(left)*function.f(x)<0)
//                              right = x;
//                          else 
//                              left = x;                   
//                  }                                  
//              }
//          }        
//        return x;
//}    



}