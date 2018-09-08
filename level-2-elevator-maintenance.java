import java.util.*;
import java.lang.*;
public class Test
{
	public static void main(String[] args) {
        //String[] l = {"1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"}; // [1.0, 1.0.2, 1.0.12, 1.1.2, 1.3.3]
        String[] l = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
        Arrays.sort(l, new Comparator<String>() {
            public int compare(String s1, String s2) {
                String[] arr1 = s1.split("\\.");
                int dig11 = Integer.parseInt(arr1[0]);
                int dig12 = arr1.length < 2 ? -1 : Integer.parseInt(arr1[1]);
                int dig13 = arr1.length < 3 ? -1 : Integer.parseInt(arr1[2]);
                String[] arr2 = s2.split("\\.");
                int dig21 = Integer.parseInt(arr2[0]);
                int dig22 = arr2.length < 2 ? -1 : Integer.parseInt(arr2[1]);
                int dig23 = arr2.length < 3 ? -1 : Integer.parseInt(arr2[2]);
                if(dig11 > dig21) return 1;
                if(dig11 < dig21) return -1;
                if(dig12 > dig22) return 1;
                if(dig12 < dig22) return -1;
                if(dig13 > dig23) return 1;
                if(dig13 < dig23) return -1;
                return 0;
            }
        });
        System.out.println(Arrays.toString(l));
	}
}
