package leetcodeContest288;

public class MinimumNumberOfOperationsToConvertTime {
    public int convertTime(String current, String correct) {
        String[] arr = current.split(":");
        int from = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);

        arr = correct.split(":");
        int to = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);

        int result = 0;

        while (from + 60 <= to) {
            result++;
            from += 60;
        }
        while (from + 15 <= to) {
            result++;
            from += 15;
        }
        while (from + 5 <= to) {
            result++;
            from += 5;
        }
        result += (to - from);

        return result;

    }
}
