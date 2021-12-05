package ru.avalon.javapp.devj110.halfDivisionMethod;


public interface Function {
    double f(double x);
        
    public static double staticMeth(double x) {
        return Math.log(x*x*x) - 2;
    }

}