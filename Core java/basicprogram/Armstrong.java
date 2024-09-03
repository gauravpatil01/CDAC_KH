public class Armstrong {
    public static void main(String[] args) {
        int n = 153, remender, c, arm = 0;

        c = n;
        while (n > 0) {
            remender = n % 10;
            arm = (remender * remender * remender*remender) + arm;
            n = n / 10;
        }
        if (c == arm) {
            System.out.println("arm strong number");

        } else {
            System.out.println("not a armstrong");
        }
    }

}



// public class Armstrong {
//     public static void main(String[] args) {
//         int num = 1634, temp = num, sum = 0;
//         while (temp > 0) {
//             int digit = temp % 10;
//             sum += digit * digit * digit*digit;
//             temp /= 10;
//         }
//         System.out.println(num == sum ? "Armstrong" : "Not Armstrong");
//     }
// }
