import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;
import java.util.Scanner;
public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
    String str = input.getText();

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Please enter a palindrome: ");
    String s = scan.nextLine();
    
    if(isPalindrome(s)) {
    	System.out.println( s + " is a palindrome");
    }
    else {
    	System.out.println(s = " is not a palindrome");
    }

    result.setText(str);
    input.selectAll();
  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
  
  public static boolean isPalindrome(String str) {
	    String backStr = "";
	    for(int i = str.length() - 1; i >= 0; i--) {
	    	backStr += str.charAt(i);
	    }
	    if(backStr.equals(str)) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
  }
}

