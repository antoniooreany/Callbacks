package callback;

/**
 * Created by User on 20.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        SomeClass.Callback myClass = new MyClass();
        someClass.registerCallBack(myClass);
        someClass.doSomething();
    }
}
