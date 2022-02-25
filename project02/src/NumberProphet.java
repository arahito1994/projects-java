import java.util.Scanner;
import java.util.Random;
import javax.print.attribute.standard.PresentationDirection;
import javax.swing.AbstractAction;
import javax.xml.stream.events.EndDocument;

public class NumberProphet {
  public static void main(String[] args) {
    final int RANGE_FOR_CORRECT = 7;
    int correct,prediction;

    Random r = new Random();
    correct = r.nextInt(RANGE_FOR_CORRECT);

    Scanner s = new Scanner(System.in);
    

    System.out.print("予想する数を入力してください(0~7):" );
    prediction = s.nextInt();

    if (correct == prediction) {
      System.out.println("正解です");
      System.out.println("正解は" + correct + "です");
    }
    else {
      System.out.println("正解は" + correct + "です");
    }
  }
}