public class ElementaryAlgorithms{

    //Greatest Common Divisor Method 1
    /*
    Example
    a  b output
    15 5 5
    10 5
    5  5

    This is also called Euclid's algorithm through repeated subtractions.
    You countinuously subtract the smaller number from the bigger number until both numbers are equal, resulting in the GCD
    */
    static void GCDM1(int a,int b){
        while(a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        System.out.println(a); //You can also print out b, since the while ends when both are equal
    }

    //Greatest Common Divisor Method 2
    /**
    Example 1:
    a  b r output
    15 5 0 5
    5  0 0

    Example 2:
    a  b r output
    15 9 6 3
    9  6 3
    6  3 0
    3  0

    We use: dividend = divisor * quotient + rest
    We divide a to b and get the rest. We then give to a the value of b and we give b the value of the rest. We repeat until the rest is zero. The b that results in a rest of 0 is the GCD
    */
    static void GCDM2(int a,int b){
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        System.out.println(a); 
    }

    //Least Common Multiple Method 1
    /*
    Example 1:
    a  b GCD output
    15 5 75    15
    10 5 75
    5  5 15

    Example 2:
    a b GCD output
    6 7 42    42
    6 1 42

    We can compute the LCM of any two numbers using the formula LCM = |a*b|/GCD(a, b).
    So we do just that. We first declare a LCM variable to memorize a*b, and then compute the GCD as we did above. We then divide LCM(which here is a*b) by the GCD, getting the LCM.
    */
    static void LCMM1(int a,int b){
        int LCM = a*b;
        while(a!=b){
            if(a>b)
                a = a-b;
            else
                b = b-a;
        }
        LCM = LCM/a;
        System.out.println(LCM);
    }

    //Least Common Multiple Method 2
    /*
    Example 1:
    a  b GCD output
    15 5 75    15
    10 5 75
    5  5 15

    Example 2:
    a b GCD output
    6 7 42    42
    6 1 42

    Another method to compute the LCM is to just calculate multiples of both numbers until the multiples are the same.
    */
    static void LCMM2(int a,int b){
        int m = a, n = b;
        while(m!=n){
            if(m<n)
                m = m+a;
            else
                n = n+b;
        }
        System.out.println(m);
    }

    // Compute whether a number is prime or not
    /*
    Example 1:
    a i output
    7 2 1
    7 3

    Example 2:
    a i output
    2   1

    Example 3:
    a i output
    8 2 0

    By theory 0, 1 aren't prime and by the same theory 2 is prime. Due to how out algorithm works, we have to check those before going through it. After that we check whether all numbers from two to half of the tested number whether they divide the number.
    If they do, then the number isn't prime;
    */
    static void prime(int a)
    {
        if(a==0 || a==1)
            System.out.println(false);
        else if(a==2)
            System.out.println(true);
        else{
            Boolean isPrime = true;
            for(int i=2; i<=a/2; i++){
                if(a%i==0)
                    isPrime = false;
            }
            System.out.println(isPrime);
        }
    }

    //Find all prime factors of a number
    /**
    Example:
    a  k output
    12 2 2 3
    6  2
    3  2
    3  3
    1

    This is basically the same way we(humans) find the prime factors of number, meaning we divide them by the first prime factor(2), then the second, and so on, until the number becomes one.
    */
    static void allPrimeFactors(int a)
    {
        int k = 2;
        while(a>1){
            if(a%k==0)
            {
                System.out.println(k);
                while(a%k==0)
                    a = a/k;
            }
            k++;
        }
    }

    //Remove the comments of the algorithm you wanna try and add whatever values you wanna try!
    public static void main(String[] args){
        //GCDM1(15, 5);
        //GCDM2(15, 9);
        //LCMM1(15, 5);
        //LCMM2(6, 7);
        //prime(7);
        //allPrimeFactors(12);
    }

}
