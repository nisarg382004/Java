import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class LineDrawingApp extends JFrame {

    private int clickCount = 0;
    private int x1, y1, x2, y2;

    public LineDrawingApp() {
        setTitle("Line Drawing App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add mouse listener to the JFrame
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                handleClick(e.getX(), e.getY());
            }
        });

        setVisible(true);
    }

    private void handleClick(int x, int y) {
        if (clickCount == 0) {
            x1 = x;
            y1 = y;
            clickCount++;
        } else if (clickCount == 1) {
            x2 = x;
            y2 = y;
            clickCount++;

            // Repaint the JFrame to draw the line
            repaint();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);  // Ensure the JFrame is properly painted

        // Draw the line when both points are available
        if (clickCount == 2) {
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LineDrawingApp());
    }
}
