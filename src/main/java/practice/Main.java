package practice;


import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Invalid email format";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();
        
        while (true) {
            System.out.println("Enter email: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("0")) {
                break;
            }
            
            if (input.contains("add")) {
                String[] strings = input.split(" ");
                if (strings.length != 2) {
                    continue;
                }
                emailList.add(strings[1]);
            }
            if (input.contains("list")) {
                emailList.getSortedEmails().forEach(System.out::println);
            }
        }
    }
}
