public class fibonacci {
    public long power(int a, int b) {
        // Write your solution here
        if (b==0) return 1;
        if (b==1) return a;
        long r=1;
        if (b%2 == 0) return power (a*a, b/2);
        else return   a*power(a*a, b/2);

    }

    public static void main (String[] args){
        fibonacci a = new fibonacci();
        System.out.println(a.power(1,2147483647));
    }



}
