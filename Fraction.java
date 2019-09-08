public class Fraction
{
    private int num;
    private int denom;

    public Fraction(){
        num = 0;
        denom = 1;
    }

    public Fraction(int numerator,int denominator){
        this.num = numerator;
        if(denominator==0){
            System.out.println("the demominator is 0,setting it to 1");
            denom = 1;
        }else{
            this.denom = denominator;
        }
    }

    public Fraction(String s){//format:12/13
        int slashindex = s.indexOf("/");
        String num = s.substring(0,slashindex);
        String den = s.substring(slashindex+1);
        this.num = Integer.parseInt(num);
        this.denom = Integer.parseInt(den);
    }

    public Fraction(Fraction f){//copy constructor
        this.num = f.num;
        this.denom = f.denom;

    }

    // ----------------------------Accessor Method-------------------------------//

    public int getNum(){
        return this.num;
    }

    public int getDenom(){
        return this.denom;
    }

    public String toString(){ // special
        return this.num + "/" + this.denom;
    }

    public double toDouble(){
        double n = num;
        double d = denom;
        return n/d; 

    }
    
    // ----------------------Helper Method--------------------//
    
    private int GCF(int a, int b){
        if(a == 0 ||b ==0)return 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while(a != b){
            if(a>b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }
    
    //----------------------Mutator Method----------------------//
    public void reduce(Fraction a){
        int b = GCF(a.num, a.denom);
        a.num = a.num/b;
        a.denom = a.denom/b;
    }
    
    public void setNum(int a){
        num = a;
    }
    
    public void setDenom(int a){
        if(a==0){
            System.out.println("the demominator is 0,setting it to 1");
            denom = 1;
        }else{
            this.denom = a;
        }
    }
        
    //------------------------Static Method------------------------//
    public static Fraction multiply(Fraction a, Fraction b){
        Fraction ans= new Fraction(); 
        ans.num = a.num * b.num;
        ans.denom = a.denom * b.denom;
        ans.reduce(ans);
        return ans;
    }
    
    public static Fraction divide(Fraction a, Fraction b){
        Fraction ans = new Fraction();
        ans.num = a.num *b.denom;
        ans.denom = a.denom * b.num;
        ans.reduce(ans);
        return ans;
    }
    
    public static Fraction add(Fraction a , Fraction b){
        Fraction ans = new Fraction();
        ans.num = a.num* b.denom + b.num* a.denom;
        ans.denom = a.denom * b.denom;
        ans.reduce(ans);
        return ans;
    }
    
    public static Fraction subtract(Fraction a , Fraction b){
        Fraction ans = new Fraction();
        ans.num = a.num* b.denom - b.num* a.denom;
        ans.denom = a.denom * b.denom;
        ans.reduce(ans);
        return ans;
    }
}
