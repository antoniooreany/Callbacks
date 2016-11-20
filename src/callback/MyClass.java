package callback;

/**
 * Created by User on 20.11.2016.
 */
public class MyClass implements SomeClass.Callback {
    @Override
    public void callingBack() {
        System.out.println("Callback method invocation");
    }
}
