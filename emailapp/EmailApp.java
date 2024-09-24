package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email en1 = new Email("John", "Smith");
        System.out.println(en1.showInfo());
        en1.changePassword("qwerty");
        System.out.println(en1.getPassword());
        System.out.println(en1.getMailCapacity());
        en1.setMailCapacity(200);
        System.out.println(en1.getMailCapacity());
        en1.setAlternateEmail("john.smith@Sales.company.com");
        System.out.println(en1.getAlternateEmail());

    }
}
