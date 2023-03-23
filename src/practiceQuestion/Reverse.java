package practiceQuestion;

public class Reverse {
    public static void main(String[] args) {
        int number = 1234;
        Reverse r = new Reverse();
        System.out.println(r.reverse(number));
    }

    int reverse(int num) {

        int temp = 0, lastPosition = 0;

        while (num != 0) {
            lastPosition = num % 10;
            temp = temp*10 + lastPosition;
            num = num / 10;

        }
        return temp;
    }
;
}
