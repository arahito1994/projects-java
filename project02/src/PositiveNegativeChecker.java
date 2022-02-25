import java.util.Scanner;

public class PositiveNegativeChecker {
  public static void main(String[] args) {
   
    System.out.print("正数または負数を入力してください:");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

    if (num > 0) {
      System.out.print("入力値は正数です");
    }
    else if (num < 0) {
       System.out.print("入力値は負数です");
    }
  }
}
