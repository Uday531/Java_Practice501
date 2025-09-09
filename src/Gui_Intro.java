import javax.swing.JOptionPane;

public class Gui_Intro {
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter vour name: ");
        JOptionPane.showMessageDialog(null,"Hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,age);
    }
}
