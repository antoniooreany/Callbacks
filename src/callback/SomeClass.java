package callback;

import javax.swing.*;

/**
 * Created by User on 20.11.2016.
 */
class SomeClass {

    interface Callback {
        void callingBack();
    }

    private Callback callback;

    void registerCallBack(Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        JOptionPane.showMessageDialog(null, "Work is performed");

        callback.callingBack();
    }

}
