package ArrayLeetcode;

public class maximumPointYouCanObtainedFromCard {
    public int maxScore(int[] cardPoints, int k) {
        int arraySum = 0;
        for(int i = 0; i < cardPoints.length; i++){
            arraySum += cardPoints[i];
        }

        if(k == cardPoints.length){
            return arraySum;
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int length = cardPoints.length - 1 - k;

        for(right = 0; right < length; right++){
            sum += cardPoints[right];
        }
        while(right < cardPoints.length){
            sum += cardPoints[right];

            min = Math.min(min, sum);

            sum -= cardPoints[left++];

            right++;
        }
        return arraySum - min;
    }
}
