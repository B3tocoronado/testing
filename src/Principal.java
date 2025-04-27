import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("What is your number? ");
        int number = scanner.nextInt();
        //a partir de aqui empieza la nueva funcionalidad
        int i=0;
        while (i < number ){
            System.out.println(name+" ERES UN GAY");
            i++;
        }
    }
}