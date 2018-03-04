public class fibonacci {
    public long fibonacci(int K){ 
    		if (K<=0) return 0;
        if (K==1) return 1;
        long[] fib = new long[K+1];
        fib[0]=0;
        fib[1]=1; 
        
        for (int i=2; i<=K;i++){
            fib[i]=fib[i-1] +fib[i-2];
        } 
        
        return fib[K]; 
    } 



}
