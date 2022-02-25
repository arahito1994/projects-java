import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class PositiveNegativeChecker2 {
  public static void main(String[] args) {

    System.out.print("整数を入力してください:");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    
    if (num > 0) {
      System.out.print("入力値は正数です");
    }
    else if (num < 0){
      System.out.print("入力値は負数です");
    }else{
      System.out.print("入力値は"+ 0 +  "です");
    }
  }
}
