import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class InternalFrameExample {
    
    public static void main(String[] args) {
        JFrame parentFrame=new JFrame("Parent Frames");
        parentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        parentFrame.setSize(600,400);
        //
        JInternalFrame internalFrame1=new JInternalFrame("Internal Frame 1",true,true,true,true);
        internalFrame1.setBounds(50,50,200,150);
        internalFrame1.setVisible(true);
        JInternalFrame internalFrame2= new JInternalFrame("Internal Frame 2",true,true,true,true);
        internalFrame2.setBounds(250,100,200,150);
        internalFrame2.setVisible(true);

        JDesktopPane desktopPane=new JDesktopPane();
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);

        parentFrame.add(desktopPane);
        parentFrame.setVisible(true);

    }
}
