import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    final int FIRST_TARGET_NUM = 15;
    final int SECOND_TARGET_NUM = 3;
    Scanner s = new Scanner(System.in);

    System.out.println("演算対象は" + 15 + "と" + 3 + "です");
    System.out.print("次の" + 3 + "つのどれかの演算子を入力してください(+, -, *):");
    String operator = s.next();
    int num;

    switch(operator){
      case "+": 
        System.out.print("15 + 3 = 18");
        break;
      case "-": 
        System.out.print("15 - 3 = 15");
        break;
      case "*":
        System.out.print("15 * 3 = 45");
        break;
      default:
        System.out.print("15 ? 3 = 0");
    }

  }
}
