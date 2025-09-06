package Basic_Stuff;

public class ArmstrongNum {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (checkArmStrong(i)) System.out.println(i);
        }
    }

    static boolean checkArmStrong(int num) {
        if (num < 0) return false;

        int sum = 0, r, temp;
        int a =num;

        while (a != 0) {
            r = a % 10;
            temp = (int) Math.pow(r, 3);

            if (temp > num) return false;
            sum += temp;
            a /= 10;
        }

        return sum == num;
    }
}
