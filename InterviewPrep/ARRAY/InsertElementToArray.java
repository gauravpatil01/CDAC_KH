public class InsertElementToArray {

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        int pos = 3;
        int element = 200;

        for (int i = a.length - 1; i > pos - 1; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = element;

        for (int num : a) {
            System.out.println(num);
        }
    }

    public static void main1(String[] args) {
        int a[] = { 10, 20, 30, 40 };
        int pos = 3;
        int element = 100;

        for (int i = a.length - 1; i >= pos - 1; i--) {
            a[i] = a[i - 1];

        }
        a[pos - 1] = element;

        for (int num : a) {
            System.out.println(num);
        }
    }
}
