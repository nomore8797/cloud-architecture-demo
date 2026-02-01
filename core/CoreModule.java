package core;

/**
 * CoreModule - основа платформы
 * Здесь будут основные функции и модули платформы
 */
public class CoreModule {

    public CoreModule() {
        System.out.println("Core module initialized");
    }

    public void run() {
        // Здесь позже будут основные процессы платформы
        System.out.println("Core module running...");
    }

    public static void main(String[] args) {
        CoreModule core = new CoreModule();
        core.run();
    }
}
