/**
 * @Author : fanc
 * @Date : 2019-09-20 17:15
 */
import java.util.*;

public class ArrayCopyTest {
    public static void main(String[] args) {
        int[] a1 = {-1, 2, 3};
        //浅拷贝
        int[] a2 = a1;
        //a2[0] = 2;
        //深拷贝
        int[] a3 = a1.clone();
        a3[0] = 3;
        System.out.println("a1" + Arrays.toString(a1));
        System.out.println("a2" + Arrays.toString(a2));
        System.out.println("a2" + Arrays.toString(a3));
        int[] a5 = Arrays.copyOf(a1, 2);
        System.out.println("a5" + Arrays.toString(a5));
    }
}
