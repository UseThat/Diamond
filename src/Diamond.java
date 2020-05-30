import java.util.InputMismatchException;
import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        int diamond = 0;
        System.out.println("Set number to create diamond: ");
        Scanner scanner = new Scanner(System.in);
        try {
            diamond = scanner.nextInt();
            scanner.close();
        }catch (InputMismatchException ex){
            System.out.println("This is not number");
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0 ; i < diamond; i++){
            for(int j = 0 ; j<diamond - i; j++){
                stringBuilder.append(" ");
            }
            for (int k = 0 ; k < diamond; k++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);
    }
}
