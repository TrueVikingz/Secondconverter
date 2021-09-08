import java.util.Scanner;

public class SecondConverter {

    public static void main(String[] args) {

//Intro
        int input;
        System.out.println("Hello, and welcome back.");
        System.out.println(" ");
        System.out.println("please enter the number of seconds you whant converted:");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        int hour = input / 3600;
        int minute = input % 3600 / 60;
        int second = input % 3600 % 60;

        System.out.printf("%d second = %d hour, %d minute, %d second.", input, hour, minute, second);
    }
}
