public class FractionDriver
{
    public static void main(String[] args){
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(6,3);
        Fraction f3 = new Fraction(3,0);
        Fraction f4 = new Fraction(f2);
        System.out.println("f1="+f1);
        System.out.println("f2="+f2);
        System.out.println("f3="+f3);
        System.out.println("f4="+f4);
        System.out.println();
        
        f1.setNum(34);
        f1.setDenom(0);
        System.out.println("f1 has been changed to "+f1);
        System.out.println();
        
        System.out.println("change f1 to double");
        System.out.println(f1.toDouble());
        System.out.println();
        
        System.out.println("change f1 to string");
        System.out.println(f1.toString());
        System.out.println();
        
        System.out.println("add f3 and f4");
        System.out.println(f3.add(f3,f4));
        System.out.println();
        
        System.out.println("subtract f3 by f4");
        System.out.println(f3.subtract(f3,f4));
        System.out.println();
        
        System.out.println("multiply f3 by f4");
        System.out.println(f3.multiply(f3,f4));
        System.out.println();
        
        System.out.println("divide f3 by f4");
        System.out.println(f3.divide(f3,f4));
        System.out.println();
        
        
    }
}
