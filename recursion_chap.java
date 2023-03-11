public class recursion_chap {
    static int  sum=0;
    static void  reverse (int n) {
        if (n == 0) {
            return ;
        }

         sum= sum*10+n%10;

         reverse(n/10);
    }
    static int reverse2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    static boolean palindrome(int n){
        return (reverse2(n)==n);
    }

   static int sumofdigit(int n){
        if(n==0)
            return 0;
        return n%10+sumofdigit(n/10);
    }
    static int sum_of_n_naturalnum(int n){
        if(n<=1)
            return 1;
        return n+sum_of_n_naturalnum(n-1);
    }
    static int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    static void numrev(int n){
        if(n<1)
            return;
        numrev(n-1);
        System.out.println(n);
    }
    static void num(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        num(n-1);
    }
    static int fibonacci(int n){
        if(n==2)
            return 1;
        if(n==1)
            return 0;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static int count_zeros(int n){
        return helper2(n,0);
    }
    static int helper2(int n,int counts){
        if(n==0)
            return counts;
        int rem=n%10;
        if (rem==0)
            return helper2(n/10,counts+1);
        else
            return helper2(n/10,counts);
    }
    public static void main(String[] args) {
       // num(5);
       //numrev(5);
        //System.out.println(factorial(5));
        //System.out.println(factorial(6));
        //System.out.println(sum_of_n_naturalnum(5));
        //System.out.println(sumofdigit(1342));
        //System.out.println(sumofdigit(135));
        //reverse(54321);
        //System.out.println(fibonacci(4));
       // System.out.println(fibonacci(7));
       // System.out.println(palindrome(121));
        //reverse(1235);
        //System.out.println(sum);
        //System.out.println(reverse2(2568));
        //System.out.println(palindrome(121));
        System.out.println(count_zeros(2030));

    }
}
