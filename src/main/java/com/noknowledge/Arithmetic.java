package com.noknowledge;

public class Arithmetic {

    public int sum(int a, int b){
        return (a + b);
    }

    public float sum(float a, float b){
        return (a + b);
    }

    public String sum(String a, String b){
        return a + b;
    }

    public String sum(String a, int b){
        return a + b;
    }
    public String sum(int a, String b) {
        return a + b;
    }
    public int sum(int a, int b, int c){
        return (a + b + c);
    }

    public float sum(int a, int b, float c){
        return (float)sum(a,b) + c;
    }

    public String sum(String a, int b, float c){
        return a + sum(0, b ,c );
    }
    double sum( int a, double b){
        return a+b;
    }
    float add( int a, float b){
        return  a + b;
    }
}
