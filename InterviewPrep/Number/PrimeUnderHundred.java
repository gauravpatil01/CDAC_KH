public class PrimeUnderHundred {

    public static void main6(String[] args) {

        String str = "Gaurav";
        String newStr = str;
        int length = newStr.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print("Reverse " + newStr.charAt(i));

        }

    }

    public static void main5(String[] args) {
        int number = 121;
        int temp = number;
        int rem = 0, rev = 0;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        System.out.println("reverse " + rev);
        System.out.println("number is " + number);
        if (rev == number) {
            System.out.println("number is palendrom");
        } else {
            System.out.println("number is not  palendrom");
        }
    }

    public static void main4(String[] args) {
        int temp = 0;
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                if (i % 2 != 0) {
                    System.out.println(i);
                    count++;
                }

            } else {
                temp = 0;
            }

        }
        System.out.println(" total count is " + count);
    }

    public static void main3(String[] args) {
        int temp = 0;
        int count = 0;

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
                count++;
            } else {
                temp = 0;
            }

        }
        System.out.println(" total count is " + count);
    }

    public static void main(String[] args) {

    int temp = 0;
    for (int i = 1; i <= 100; i++) {
    for (int j = 2; j < i; j++) {
    if (i % j == 0) {
    temp = temp + 1;
    }
    }
    if (temp == 0) {
    System.out.println(i);
    } else {
    temp = 0;

    }

    }
    }

    public static void main1(String[] args) {
        int number = 6;
        int temp = 0;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("prime");
        } else {
            System.out.println("Not A prime");

        }
    }
}
