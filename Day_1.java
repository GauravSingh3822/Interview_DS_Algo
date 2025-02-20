import javax.naming.PartialResultException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day_1 {
    /* 1.Prime number..
     2.Factorial
     3.Fibnacci
     4.Count digit..
     5.Reverse Number..
     6.LCM..
     7.GCD..
     8.Even Odd..
     9.Intersection.
     10.Union
     11.Find First Digit..
     12.Find Last Digit..
     13.Largest Three digit..
     14.Check Leep year..
     15.Total Sum..
     16 Get Smallest Number means given x print all smallest number lest than x
     17.Swap without any third Variable
     18.Check given number is power of 2

*/
     public static void prime(int n){
        List<Integer> result = new ArrayList<>();
        int count =0;
        for(int i =1;i<=n;i++){
            if(isPrime(i)==true){
                result.add(i);
                count++;
            }
        }
        System.out.println(result);
        System.out.println(count);
    }

     public static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

     public static int factorial(int n){
        if(n==1) return 1;
        return n*factorial(n-1);
    }

     public static int factorial_II(int n){
        int res =1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }

     public static int fib(int n){
        if(n==0 || n==1) return 1;
        return fib(n-1)+fib(n-2);
    }

     public static int fib_II(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i =2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
     }

     public static int Countdigit(int n){
        int res=0;
        while(n>0){
            n=n/10;
            res++;
        }
        return res;
     }

     public static int reverse(int n){
        int rev=0;
        while(n>0){
            int digit= n%10;
            rev = rev*10+digit;
            n/=10;
        }
        return rev;
     }

     public static int LCM(int a,int b){
        int x = Math.max(a,b);
        int y = a*b;
        int res=0;
        for(int i =x;i<=y;i++){
            if(i%a == 0 && i%b == 0)
                res =i;
        }
        return res;
     }

     public static int GCD(int a,int b){
        int x =Math.min(a,b);
        int res = 1;
        for(int i =1;i<= x;i++){
            if(a%i==0 && b%i==0){
                res=i;

            }
        }
        return res;
     }

     public static void Number(int n){
        List<Integer> evenNumber= Even(n);
        List<Integer> oddNumber = Odd(n);

         System.out.println("Even number : "+evenNumber);
         System.out.println("Odd number  : "+oddNumber);
     }

     public static List<Integer> Even(int n){
         List<Integer> res = new ArrayList<>();
         for(int i =1;i<=n;i++){
             if(i%2 == 0){
                 res.add(i);
             }
         }
         return res;

     }

     public static List<Integer> Odd(int n){
        List<Integer> res = new ArrayList<>();
        for(int i =1;i<=n;i++){
            if(i%2!= 0){
                res.add(i);
            }
        }
        return res;

    }

     public static  int totalSum(int n){
        int res =0;
        for(int i =1;i<=n;i++){
            res+=i;
        }
        return res;
    }

     public static int firstDigit(int n){
         while(n>10){
             n/=10;
         }
         return n;
    }

     public static int LastDigit(int n){
         int res = n%10;
         return res;
    }

     public static List<Integer> Intersection(int [] arr1,int []arr2){
         List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int num:arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:arr2){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                res.add(entry.getKey());
            }
        }
        return res;
    }

    public static List<Integer> Union(int [] arr1,int []arr2){
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int i =0;i<arr1.length;i++){
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i =0;i<arr2.length;i++){
            map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                res.add(entry.getKey());
        }
        return res;
    }

    public static int largest(int a,int b,int c){
         if(a>b && a>c){
             return a;
         }else if(b>a && b>c){
             return b;
         }
         else{
             return c;
         }
    }

    public static int Missing_Number(int []nums,int n){
         int sum = 0;
         int total = n*(n+1)/2;
         for(int i =0;i<nums.length;i++){
             sum+=nums[i];
         }
         int missing = total-sum;
         return missing;
    }

    public static void smaller_than_x(int n,int x){
         List<Integer> res = new ArrayList<>();
         int count =0;
         for(int i=1;i<=n;i++){
             if(i<x){
                 count++;
                 res.add(i);
             }
         }
        System.out.println("Total Number smaller then X are :"+res);
        System.out.println("Total number are  : "+count);
    }

    public static void swap(int a,int b){
         a = a^b; // 5
         b = a^b; // 5-2 = 3
         a = a^b; // 5-3 = 2
        System.out.println("After swap of a : "+a);
        System.out.println("After swap of b :"+b);
    }

    public static boolean power_of_2(int n){
         if(n<=0) return false;
         while(n>1){
             if(n%2!=0) return false;
             n/=2;
         }
         return true;
    }

    public static void main(String[] args) {
       /* int n =12345;
        System.out.println(factorial(n));
        System.out.println(factorial_II(n));
        System.out.println(fib(n));
        System.out.println(fib_II(n));
        System.out.println(Countdigit(1234));
        System.out.println(reverse(1234));
        System.out.println(LCM(10,12));
        System.out.println(GCD(10,12));
        Number(10);
        System.out.println(totalSum(n));
        System.out.println(firstDigit(n));
        System.out.println(LastDigit(n));
        int [] arr1 ={1,2,3,4,5,6,8};
        int [] arr2 = {1,2,3,4,5,7,8};
        System.out.println("Intersection of two Array :  "+Intersection(arr1,arr2));
        System.out.println("Union of two Array :         "+Union(arr1,arr2));
        System.out.println("Largest Number :             "+largest(2,2,3));
        System.out.println("Missing Numbser :            "+Missing_Number(arr1,8));*/
        smaller_than_x(10,6);
        swap(2,3);
       /* System.out.println(power_of_2(4));
        System.out.println(power_of_2(5));
        System.out.println(power_of_2(10));
        System.out.println(power_of_2(16));*/

    }

}
