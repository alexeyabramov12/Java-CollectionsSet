package practice;

import practice.EmailList;

import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            
            //TODO: write code here
            if (input.contains("ADD")) {
                int start = input.indexOf("ADD");
                int spase = input.indexOf(' ', start);
                String email = input.substring(spase);
                emailList.add(email);
                continue;
            }
            if (input.contains("LIST")) {
                emailList.getSortedEmails();
            }
        }
    }
}
