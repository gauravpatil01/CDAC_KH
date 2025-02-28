public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Ram", "Shyam", "Gita", "Ravi", "Soham"};

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}

