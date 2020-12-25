
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String word = "lmasmfmaflmafmam smflmsfmsfm smdmm lsmdlms qpe lmdmd wkepkwepk kepkp smcm wkmdmd smm sdmm";

        String[] arrayList = word.split(" ");

        Arrays.stream(arrayList)
                .sorted()
                .forEach(System.out::println);
    }
}
