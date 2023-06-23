import java.util.List;

/**
 * Створіть проект за допомогою IntelliJ IDEA. Створіть клас MyClass, що містить статичний фабричний метод - T factoryMethod(),
 * який породжуватиме екземпляри типу, зазначеного як параметр типу (покажчика місця заповнення типом – Т).
 */

public class Main {
    public static void main(String[] args) {
        List<String> someList = MyClass.factoryMethod();
        someList.add("wqeqwe");
        System.out.println(someList);
    }
}
