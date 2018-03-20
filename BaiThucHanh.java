import java.util.Scanner;

public class BaiThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int number = 2; count < 20 ; number++) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("20 so nguyen to dau tien: "+ number + " ");
                count++;
            }
        }
    }

}

