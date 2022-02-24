import java.util.Scanner;

public class StringInputReciever {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前を入力してください:");
    String name = scanner.next();
    System.out.println("入力された名前は"+ name + "です");

  }
}
