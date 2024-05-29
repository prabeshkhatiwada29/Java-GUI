
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapterExample extends MouseAdapter {

Frame F;
MouseAdapterExample(){
    F=new Frame("Mouse Adapter");
    F.addMouseListener(this);
    F.setSize(300,300);
    F.setLayout(null);
    F.setVisible(true);

}
public void mouseClicked(MouseEvent e){
    Graphics g=F.getGraphics();
    g.setColor(Color.RED);
    g.fillOval(e.getX(),e.getY(),30,30);
}




    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}
