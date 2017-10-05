package lesson170629.classwork;

public class Genome {
    /*
            ACGT

            N = 100000

            V
            AAAACCCGTGTTGACCACACACACGTGAACAGGGTTTAAACCCACACTTT
                      ^
            AAA
            AAA
            AAC
            ACC
            1Tb - геном одного человека
            W = 20 - размер слова
     */
    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(300000);
//        System.out.println(Arrays.toString(data));
        for (byte b :
                data) {
            System.out.print((char) b);
        }

        findDuplicates(data, 4);
    }

    private static void findDuplicates(byte[] data, int w) {
        int counter = 0;
        for (int i = 0; i < data.length - w; i++) {
            INNER:
            for (int j = i + 1; j < data.length - w+1; j++) {
                boolean found = true;
                for (int k = 0; k < w; k++) {
                    if (data[i + k] != data[j + k]) {
                        found = false;
                        break;
                    }
                }
                if(found){
                    counter++;
//                    System.out.println("\nhurray!");
//                    System.out.println("i = " + i +", j = "+ j );
                }
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}
