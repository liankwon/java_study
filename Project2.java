/*public class Project2 {
    public static void main(String[] args) {
        int Korean = 80;
        int English = 75;
        int Math = 55;
        int Average = (Korean + English + Math) / 3;

        System.out.println(Average);
    }
}
*/
/*public class Project2 {
    public static void main(String[] args) {
        String pin =  "881120-1068234";
        String YYYYMMDD = pin.substring(0,6);
        String num = pin.substring(7);

        System.out.println(YYYYMMDD);
        System.out.println(num);
    }

}
 */
/*public class Project2 {
    public static void main(String[] args) {
        String x = "a:b:c:d";
        System.out.println(x.replace(":","#"));
    }
}
 */
/*import java.util.ArrayList;
import java.util.Arrays;

public class Project2 {
    public static void main(String[] args) {
         ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
         String result = String.join(" ", myList);
         System.out.println(result);
    }
}
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Project2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> set = new HashSet<>(numbers);
        ArrayList<Integer> result = new ArrayList<>(set);
        System.out.println(result);
    }
}

