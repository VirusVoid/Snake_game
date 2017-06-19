import javax.swing.*;

public class MainFrame extends JFrame{

    public MainFrame(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600,625);
        setLocation(400,100);
        add(new Game());
        setVisible(true);

    }
    public static void main(String[] args) {
        new MainFrame();
    }
}