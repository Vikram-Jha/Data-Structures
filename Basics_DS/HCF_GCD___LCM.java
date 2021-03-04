class HCF_GCD___LCM{
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else if (b<a)
            return gcd(b, a % b);
        else
            return gcd(a, b % a);
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        
        System.out.println(gcd(3,12));
    }
}