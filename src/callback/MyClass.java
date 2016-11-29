package callback;

/**
 * Created by User on 20.11.2016.
 */
class MyClass implements SomeClass.Callback {

    @Override
    public void callingBack(String s) {
        if (s != null) {
            System.out.println("Your answer is: " + s);
        } else {
            System.out.println("!!! You've ignored the question !!!");
        }
    }
}
