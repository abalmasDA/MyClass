public class MyClass<T> {

    public static <T> T factoryMethod() {

        return (T) new MyClass<T>();

    }


}
