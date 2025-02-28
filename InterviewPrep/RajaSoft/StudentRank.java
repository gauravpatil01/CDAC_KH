import java.util.*;

public class StudentRank {

    public static void main(String[] args) {
        int marks[] = { 23, 35, 33, 15 };
        int newMark = 54;
        System.out.println(findRank(marks, newMark));
        reverseNum(marks);
    }

    public static int findRank(int[] marks, int newMark) {
        List<Integer> list = new ArrayList<>();
        for (int mark : marks) {
            list.add(mark);
        }
        list.add(newMark);
        Collections.sort(list, Collections.reverseOrder());
        return list.indexOf(newMark) + 1;
    }

    public static void reverseNum(int[] marks) {
        List<Integer> list = new ArrayList<>();
        for (int a : marks) {
            list.add(a);
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        System.out.println(" Second place element" + list.get(2));

    }
}