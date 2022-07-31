import java.util.Scanner;

public class threePhone {

    public static void main(String[] args) {
//        練習題3: 手機選號:根據使用者輸入的手機號來確認使用者實際支付的價格
        System.out.println("請輸入你的門號號碼");
        String phone = new Scanner(System.in).nextLine();

        if (phone.length() != 10) {
            System.out.println("輸入錯誤");
            return;
        } else if (phone.charAt(10) == 8) {
            int iprice = 80;
        } else if (phone.charAt(10) == 4) {
            int wprice = 0;
            
        }
    }
}
