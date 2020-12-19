public class FacFab {
    public int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
       }


    public int fab(int n,int m){
        int k = 0;
    n = 0;
    m = 1;
    int t = n + m;
        for(int i = 0; i < 5; i++){
            k = t + fab(n+1,m+1);
        }
        return k;
    }
}

