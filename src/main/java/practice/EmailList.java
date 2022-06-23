package practice;

import java.util.*;

public class EmailList {

    private final TreeSet<String> usersEmail = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять  email или нет должен этот метод
        String regex1 = "[abcdefghijklmnopqrstuvwxyz]+@[abcdefghijklmnopqrstuvwxyz]+\\.ru";
        String regex2 = "[abcdefghijklmnopqrstuvwxyz]+@[abcdefghijklmnopqrstuvwxyz]+\\.com";
        if (email.matches(regex1) || email.matches(regex2)) {
            usersEmail.add(email);
        }else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        ArrayList<String> list = new ArrayList<>(usersEmail);
        return list;
    }

}
