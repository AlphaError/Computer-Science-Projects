/**
 * A board game program with someone
 * playing against the computer
 */

import java.awt.Color;
import java.awt.Container;
import java.util.Scanner;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Chomp extends JFrame
{
  private ChompGame game;
  private JTextField display;
  private Player players[];
  private int currentPlayer;

  public Chomp(int length, int width)
  {
    Container c = getContentPane();

    display = new JTextField(20);
    display.setBackground(Color.YELLOW);
    display.setEditable(false);
    c.add(display, BorderLayout.NORTH);

    BoardPanel board = new BoardPanel(length, width);
    c.add(board, BorderLayout.CENTER);

    game = new ChompGame(board);

    HumanPlayer human1 = new HumanPlayer(this, game, board, "player1");
//    ComputerPlayer computer = new ComputerPlayer(this, game, board);
//    computer.setStrategy(new Chomp4by7Strategy());
    HumanPlayer human2 = new HumanPlayer(this, game, board, "player2");

    players = new Player[2];
    players[0] = human1;
    players[1] = human2;
    currentPlayer = 0;

    display.setText(" You go first...");
    players[currentPlayer].makeMove();
  }

  // Called by the player when its move is completed.
  public void hasMoved()
  {
    currentPlayer = (currentPlayer + 1) % 2;
    Player p = players[currentPlayer];
    if (game.isWon())
    {
      display.setText(p.getWinMessage());
    }
    else
    {
      display.setText(p.getPrompt());
      p.makeMove();
    }
  }

  public static void main(String[] args)
  {
	System.out.println("Bounds...");
	Scanner scan = new Scanner(System.in);
	System.out.println("l?");
	int length = scan.nextInt();
	System.out.println("w?");
	int width = scan.nextInt();
    Chomp window = new Chomp(length, width);
    
    window.setTitle("Choomp"); //chomp
    window.setBounds(400, 400, 601, 410);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setVisible(true);
  }
}

