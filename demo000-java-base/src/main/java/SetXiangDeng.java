//import java.io.Serializable;
//import java.util.*;
//import java.util.stream.Collectors;
//
///**
// * 判断两个集合是否相等
// */
//public class SetXiangDeng implements Serializable {
//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> list1 = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            list.add("test" + i);
//            list1.add("test" + (i * 2));
//        }
//        long st = System.nanoTime();
//        System.out.println(checkDiffrent1(list, list1));
//        System.out.println("消耗时间为：" + (System.nanoTime() - st));
//    }
//
//    /**
//     * 方法2：利用List的 retainAll的方法进行判断
//     */
//    private static boolean checkDiffrent1(List<String> list, List<String> list1) {
////        long st = System.nanoTime();
////        System.out.println("消耗时间为：" + (System.nanoTime() - st));
//        return !list.retainAll(list1);
//    }
//
//}





import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 判断两个集合是否相等
 */
public class SetXiangDeng implements Serializable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add("test" + i);
            list1.add("test" + (i * 2));
        }
        long st = System.nanoTime();
        System.out.println(checkDiffrent(list, list1));
        System.out.println("消耗时间：" + (System.nanoTime() - st));
    }

    /**
     * 方法一：使用循环遍历
     */
    private static boolean checkDiffrent(List<String> list, List<String> list1) {
//        long st = System.nanoTime();
//        if(list.size() != list1.size()) {
//            System.out.println("消耗时间：" + (System.nanoTime() - st));
//            return false;
//        }
        for(String str : list) {
            if(!list1.contains(str)) {
//                System.out.println("消耗时间：" + (System.nanoTime() - st));
                return false;
            }
        }
//        System.out.println("消耗时间：" + (System.nanoTime() - st));
        return true;
    }
}