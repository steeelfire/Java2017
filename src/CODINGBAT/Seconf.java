package CODINGBAT;

public class Seconf {
    public static void main(String[] args) {
        System.out.println(everyNth("Miracle", 2));
        boolean[] mas = new boolean[3];
        int[] mas2 = {1, 3, 4};

        System.out.println(scoresIncreasing(mas2));
    }

    public static boolean scoresIncreasing(int[] scores) {
        boolean result = false;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>=scores[i-1]){
                result = true;
                continue;
            }else{
                break;
            }
        }
        return result;
    }

    public static String everyNth(String str, int n) {
        String tmp = "";
        for (int i = 0; i < str.length(); i += n) {
            tmp += str.charAt(i);
        }
        return tmp;
    }
}
