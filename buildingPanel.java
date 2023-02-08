import javax.swing.*;
import java.awt.*;

public class buildingPanel  extends JPanel {
    public buildingPanel (buildingButton button, JLabel buildingAmount, JLabel buildingCost) {

        this.add(button);
        this.add(buildingAmount);
        this.add(buildingCost);
        this.setBackground(Color.CYAN);
        this.setVisible(true);
        this.setLayout(null);



    }


}

class Counter {
    private int value = 0;
    void increment() {
        value++;
    }

    void reset() {
        value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}

//button.setBounds(700,100, 300, 75);
        /*
        JTextField textfield = new JTextField();
        textfield.setText(buildingAmount + "");
        textfield.setOpaque(true);
        textfield.setVisible(true);
        textfield.setBackground(Color.ORANGE);
        textfield.setFont(new Font("Serif", Font.PLAIN, 23));
        textfield.setBounds(button.getBounds().x+350,button.getBounds().y,button.getBounds().width/3,button.getBounds().height);
        System.out.println(button.getBounds().x+350+" " +  button.getBounds().y+" " + button.getBounds().width/3+" " + button.getBounds().height);

         */