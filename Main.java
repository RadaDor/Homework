package Phone;

import java.util.ArrayList;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact[] contacts = new Contact[10];

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите пункт меню: \n" + "1.Новый контакт \n" + "2.Редактировать контакт \n" + "3.Удалить контакт \n" + "4.Выйти");
            int number = sc.nextInt();
            sc.nextLine();

            switch (number) {
                case 1:
                    System.out.println("Введите имя  нового контакта");
                    String name = sc.nextLine();

                    System.out.println("Введите номер телефона");
                    String phone = sc.nextLine();


                    int index = -1;
                    for (int i = 0; i < contacts.length; i++) {
                        if (contacts[i] == null) {
                            index = i;
                            break;
                        }
                    }

                    if (index != -1) {
                        contacts[index] = new Contact(name, phone);
                        System.out.println("Контакт добавлен");
                    } else {
                        System.out.println("Невозможно добавить новый контакт");
                    }


                    System.out.println("Список контактов:");
                    for (int i = 0; i < contacts.length; i++) {
                        if (contacts[i] == null) {
                            System.out.println(i + 1 + " ...");
                        } else
                            System.out.println(i + 1 + "  " + contacts[i].getName() + " " + contacts[i].getPhone());
                    }
                    break;

                case 2:
                    System.out.println("Введите порядковый контакта для его редактирования");
                    int indexToEdit = sc.nextInt();
                    sc.nextLine();

                    if (indexToEdit <= 0 && indexToEdit < contacts.length && contacts [indexToEdit] != null) {
                        System.out.println("Введите новое имя контакта");
                        String newName = sc.nextLine();

                        System.out.println("Введите новый номер телефона");
                        String newPhone = sc.nextLine();

                        contacts[indexToEdit].setName(newName);
                        contacts[indexToEdit].setPhone(newPhone);

                        System.out.println("Список контактов:");
                        for (int i = 0; i < contacts.length; i++) {
                            if (contacts[i] == null) {
                                System.out.println(i + 1 + " ...");
                            } else
                                System.out.println(i + 1 + "  " + contacts[i].getName() + " " + contacts[i].getPhone());
                        }
                    } else {
                        System.out.println("По данному порядковому номеру контакт не найден");
                    }
                    break;

                case 3:
                    System.out.println("Введите порядковый номер, который следует удалить");
                    int indexToDelete = sc.nextInt();
                    sc.nextLine();

                    if (indexToDelete <= 0 && indexToDelete < contacts.length && contacts [indexToDelete] != null) {

                        contacts[indexToDelete] = null;
                        System.out.println("Контакт удален");

                        System.out.println("Список контактов:");
                        for (int i = 0; i < contacts.length; i++) {
                            if (contacts[i] == null) {
                                System.out.println(i + 1 + " ...");
                            } else
                                System.out.println(i + 1 + "  " + contacts[i].getName() + " " + contacts[i].getPhone());
                        }
                    } else {
                        System.out.println("По данному порядковому номеру контакт не найден");
                    }
                    break;

                case 4:
                    System.out.println("Вы вышли из меню");

                    break;

                default:
                    System.out.println("Неправильно введен пункт меню");
                    continue;
            }

            if (number == 4) {
                break;
            }
        }
    }
}































