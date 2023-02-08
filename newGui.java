import javax.swing.*;

public class newGui {
    public newGui () {


        betterButton test = new betterButton("hello",0,0, 300,100);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(190,60,1200,850);
        frame.setVisible(true);

        frame.add(test);







    }
}
