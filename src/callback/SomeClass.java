package callback;

import javax.swing.*;

/**
 * Created by User on 20.11.2016.
 */
class SomeClass {

    private String replyTo;

    interface Callback {
        void callingBack(String s);
    }

    private Callback callback;

    void registerCallBack(Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        int reply = JOptionPane.showConfirmDialog(null, "Are you programmer?", "Interview", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            replyTo = "Yes";
        }
        if (reply == JOptionPane.NO_OPTION) {
            replyTo = "No";
        }

        callback.callingBack(replyTo);
    }

}
