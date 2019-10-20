import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class brothersInTheBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("glasses = ");

        String subString = input[1].substring(1, input[1].length() - 1);

        List<Integer> glasses = Arrays.stream(subString.split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());


        int numberOfRounds = 0;
        for (int i = 0; i < glasses.size() - 2; i++) {

            if ((glasses.get(i).equals(glasses.get(i + 1)) && (glasses.get(i + 1).equals(glasses.get(i + 2))))) {
                glasses.remove(i + 2);
                glasses.remove(i + 1);
                glasses.remove(i);
                i = 0;
                numberOfRounds++;

            }
        }

        System.out.printf("brothersInTheBar(glasses) = %d", numberOfRounds);
    }
}
// glasses = [1, 1, 2, 1, 2, 2, 1, 1]