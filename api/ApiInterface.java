package api;

/**
 * ApiInterface - заглушка для взаимодействия с внешними системами
 * Пока только структура, позже можно добавить реальные вызовы API и webhooks
 */
public class ApiInterface {

    public ApiInterface() {
        System.out.println("API Interface initialized");
    }

    public void call() {
        // Здесь будут функции вызова API
        System.out.println("API Interface call executed...");
    }

    public static void main(String[] args) {
        ApiInterface api = new ApiInterface();
        api.call();
    }
}
