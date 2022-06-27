package ArrayLeetcode;

public class happyNumber {
    public boolean isHappy(int n) {

        while(n>1){
            if(n==7) return true;
            if(n!=1 && n/10==0) return false;
            int sum=0;
            while(n>0){
                int a = n%10;
                sum+=a*a;
                n/=10;
            }
            n=sum;
        }
        return true;
    }
}
