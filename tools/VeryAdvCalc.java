package tools;

// Multi-level Inheritance in java
public class VeryAdvCalc extends AdvCalc {
    
    public double power (int n1, int n2)
    {
        return Math.pow(n2, n1);
    }

    //Method Overloading
     public int add(int n1, int n2){
        return n1+n2+1;
    }
}
