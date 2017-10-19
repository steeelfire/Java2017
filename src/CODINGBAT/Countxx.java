package CODINGBAT;

public class Countxx {
    public static void main(String[] args) {

        System.out.println(countXX("axaxax"));

    }
    static boolean countXX(String str) {
        boolean result = false;
        for(int i = 1; i<str.length();i++){
            if (str.charAt(i) == 'x' && str.charAt(i-1) == 'x'){
                result = true;
                break;
            }else{
                break;
            }
        }
        return result;
    }

}
