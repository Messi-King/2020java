import java.util.*;

public class MoreThanHalfNum {
    //1、
    public static int Num(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }else {
                map.put(array[i],1);
            }
            if(map.get(array[i]) > array.length/2) {
                return array[i];
            }
        }
        return 0;
    }
//2、
    public class test1 {
        public  void main(String[] args) {
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
}
