package client;

/**
 * PhoneEntry - демонстрация точки входа на телефоне
 * Пока что заглушка для структуры демо-платформы
 */
public class PhoneEntry {

    public PhoneEntry() {
        System.out.println("Phone Entry module initialized");
    }

    public void run() {
        // Здесь будут функции взаимодействия с платформой через телефон
        System.out.println("Phone Entry module running...");
    }

    public static void main(String[] args) {
        PhoneEntry entry = new PhoneEntry();
        entry.run();
    }
}
