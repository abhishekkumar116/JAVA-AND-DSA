package leetcodeDP;

public class decodeWays {
    public int numDecodings(String str) {
        int n=str.length();
        int dp[]=new int[n];

        if(str.charAt(0)!='0'){
            dp[0]=1;
        }else{
            dp[0]=0;
        }

        for(int i=1;i<dp.length;i++){
            if(str.charAt(i-1)=='0' && str.charAt(i)=='0'){
                dp[i]=0;
            }else if(str.charAt(i-1)=='0' && str.charAt(i)!='0'){
                dp[i]= (i>=2?dp[i-1]:0);
            }else if(str.charAt(i-1)!='0' && str.charAt(i)=='0'){
                if(Integer.parseInt(str.substring(i-1,i+1))<=26){
                    dp[i]= i>=2?dp[i-2]:1;
                }else{
                    dp[i]=0;
                }
            }else{
                if(Integer.parseInt(str.substring(i-1,i+1))<=26){
                    dp[i] = dp[i-1]+(i>=2?dp[i-2]:1);
                }else{
                    dp[i]=dp[i-1];
                }

            }
        }

        // System.out.println(dp[dp.length-1]);
        return dp[dp.length-1];
    }
}
