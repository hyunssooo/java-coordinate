package coordinate.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String askCoordinate(){
        System.out.println("좌표를 입력하세요.");
        return scanner.nextLine();
    }
}
