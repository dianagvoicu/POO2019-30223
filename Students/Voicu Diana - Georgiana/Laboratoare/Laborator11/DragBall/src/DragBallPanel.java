import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {
	private static final int BALL_DIAMETER = 40;

	private int _ballX = 50;
	private int _ballY = 50;

	private int _dragFromX = 0;
	private int _dragFromY = 0;

	private boolean _canDrag = false;

	MyTimer timer = new MyTimer();
	int min = 0;
	// nu iese bila din panoul mic
	int max = 250;

	public DragBallPanel() {
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.blue);
		setForeground(Color.yellow);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
		g.drawString("x: "+_ballX + "   y: " + _ballY, _ballX, _ballY);
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			_canDrag = true;
			_dragFromX = x - _ballX;
			_dragFromY = y - _ballY;
		} else {
			_canDrag = false;
		}
	}

	public void mouseDragged(MouseEvent e) {
		if (_canDrag) {
			_ballX = e.getX() - _dragFromX;
			_ballY = e.getY() - _dragFromY;

			_ballX = Math.max(_ballX, 0);
			_ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);

			_ballY = Math.max(_ballY, 0);
			_ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);

			this.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		_canDrag = false;
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		if (x >= _ballX && x <= (_ballX + BALL_DIAMETER) && y >= _ballY && y <= (_ballY + BALL_DIAMETER)) {
			{
				_ballX = (int) (Math.random() * ((max - min) + 1) + min);
				_ballY = (int) (Math.random() * ((max - min) + 1) + min);
				this.repaint();
			}
		}
	}

	public void mouseReleased(MouseEvent e) {
	}
}