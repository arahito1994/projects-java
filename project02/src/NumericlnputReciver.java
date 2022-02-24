import java.util.Scanner;

public class NumericlnputReciver {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double rate;
    
    
    System.out.print("数字を入力してください:");
    int num = scanner.nextInt();
    rate = num * 2.0;
    System.out.print("入力された数" + num  + "を" + 2.0 + "倍すると" +  rate + "です");
  }
}
