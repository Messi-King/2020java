//n个数里出现次数大于等于n/2的数
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            for (int i = 0; i < strings.length; i++) {
                int count = 0;
                for (int j = 0; j < strings.length; j++) {

                    if (strings[i].equals(strings[j])) {
                        count++;
                    }
                }
                int s=strings.length/2;
                if (count > s) {
                    System.out.println(strings[i]);
                    break;
                }
            }
        }
    }
}
