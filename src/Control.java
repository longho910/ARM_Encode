
import java.awt.event.*;

/*
 * Fall 2022 COSC 20203
 * Lab 2: ARM, Binary, and Hex 
 * @author: Peter Ho <hoquanglong0910@gmail.com>
 * @credit: some codes are take from Dr Sanchez. 
 * @version JDK 18.0.1.1
 */
public class Control extends View implements ActionListener {
    Model m;

    /**
     * @param args[]
     */
    public static void main(String args[]) {
        new Control();
    }

    public Control() {
        m = new Model(this);
        setButtons();
    }

    /**
     * Add action listener for button
     */
    public void setButtons() {
        encode.addActionListener(this);
        decodeBi.addActionListener(this);
        decodeHex.addActionListener(this);
    }

    /**
     * Add action performed for button
     */
    public void actionPerformed(ActionEvent e) {
        String whichWidget = e.getActionCommand();
        System.out.println("calling action perform " + whichWidget + " ");

        if (whichWidget.equals("Encode"))
            m.armToBinaryAndHex(arm.getText());
        if (whichWidget.equals("Decode Binary"))
            m.binaryToArmAndHex(bi.getText());
        if (whichWidget.equals("Decode Hex"))
            m.hexToBinaryAndARM(hex.getText());

    }

}
