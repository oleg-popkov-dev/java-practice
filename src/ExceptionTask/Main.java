package ExceptionTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        User user = getUserByLoginAndPassword(login, password);

        validateUser(user);

        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user1 = new User("john", "john@gmail.com", "password/john", 17);
        User user2 = new User("brad", "brad@gmail.com", "password/brad", 25);
        User user3 = new User("chris", "chris@gmail.com", "password/chris", 30);

        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();

        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Ограничение по возрасту. Доступ запрещен");
        }
    }
}