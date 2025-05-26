import java.util.Scanner;
import java.util.Random;

public class JankenGame {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Random random = new Random();

        String[] hands = {"グー", "チョキ", "パー"};
        System.out.println("じゃんけんゲームを始めます！");
        System.out.println("0: グー, 1: チョキ, 2: パー");

        System.out.println("あなたの手を入力して下さい (０～２) :");
        int userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 2) {
            System.out.println("無効な入力です。０～２の数字を入力してください。");
            return;
        }

        int computerInput = random.nextInt(3);

        System.out.println("あなた:" + hands[userInput]);
        System.out.println("コンピューター:" + hands[computerInput]);

        int results = (userInput - computerInput + 3) % 3;

        if (results == 0) {
            System.out.println("あいこです！");
        } else if (results == 1) {
            System.out.println("あなたの負けです！");
        } else {
            System.out.println("あなたの勝ちです！");
        }

        scanner.close();
    }
}