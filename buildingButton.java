import java.awt.*;
import javax.swing.JButton;

public class buildingButton extends JButton{
    public buildingButton(String text, int x, int y ,int width, int height){
        super(text);
        setFont(new Font("Serif", Font.PLAIN, 23));
        this.setBounds(x,y,width,height);
        this.setVisible(true);
        this.setBackground(Color.red);
        this.setText(text);
        this.setOpaque(true);




    }
    /*
    public static void main(String[] args) {
        /*
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        JLabel label = new JLabel();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.add(panel);
        panel.add(button);
        panel.add(label);
        button.setText("Click me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You clicked the button");
            }
        });


    }*/
}