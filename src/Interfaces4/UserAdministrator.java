package Interfaces4;

public class UserAdministrator extends User implements Administrator {

    public UserAdministrator(String name) {
        super(name);
    }

    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " обнаружил просрочку возврата книги у пользователя " + reader);
    }
}