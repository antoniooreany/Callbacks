package callback;

import javax.swing.*;

/**
 * Created by User on 20.11.2016.
 */
public class SomeClass {

    interface Callback {
        void callingBack();
    }

    Callback callback;

    public void registerCallBack(Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        JOptionPane.showMessageDialog(null, "Work is performed");

        callback.callingBack();
    }

}
