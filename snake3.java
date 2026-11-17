import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame
{
    JPDemo jp;

    FDemo()
    {
        jp = new JPDemo();
        add(jp);
    }

    class JPDemo extends JPanel implements ActionListener, KeyListener
    {
        int x[] = new int[100];
        int y[] = new int[100];

        int dots = 5;

        boolean start_game = false;
        boolean left = false, right = true, up = false, down = false;

        Timer t;

        JPDemo()
        {
            x[0]=120; y[0]=100;
            x[1]=100; y[1]=100;
            x[2]=80;  y[2]=100;
            x[3]=60;  y[3]=100;
            x[4]=40;  y[4]=100;

            setBackground(Color.black);

            t = new Timer(200, this);
            t.start();

            addKeyListener(this);
            setFocusable(true);
            requestFocusInWindow();
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            g.setColor(Color.yellow);

            for(int i=0;i<dots;i++)
            {
                if(i==0)
                {
                    g.setColor(Color.red);   // head
                }
                else
                {
                    g.setColor(Color.yellow); // body
                }

                g.fillRect(x[i], y[i], 20, 20);
            }
        }

        public void actionPerformed(ActionEvent e)
        {
            if(start_game)
            {
                for(int i=dots-1;i>0;i--)
                {
                    x[i] = x[i-1];
                    y[i] = y[i-1];
                }

                if(right) x[0]+=20;
                if(left)  x[0]-=20;
                if(up)    y[0]-=20;
                if(down)  y[0]+=20;

                repaint();
            }
        }

        public void keyPressed(KeyEvent e)
        {
            start_game = true;

            if(e.getKeyCode()==KeyEvent.VK_LEFT)
            {
                left=true; right=false; up=false; down=false;
            }

            if(e.getKeyCode()==KeyEvent.VK_RIGHT)
            {
                left=false; right=true; up=false; down=false;
            }

            if(e.getKeyCode()==KeyEvent.VK_UP)
            {
                left=false; right=false; up=true; down=false;
            }

            if(e.getKeyCode()==KeyEvent.VK_DOWN)
            {
                left=false; right=false; up=false; down=true;
            }
        }

        public void keyReleased(KeyEvent e){}
        public void keyTyped(KeyEvent e){}
    }
}

class snake3
{
    public static void main(String ar[])
    {
        FDemo f = new FDemo();
        f.setSize(1000,1000);
        f.setLocation(200,50);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}