
package LoginProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame implements ActionListener,MouseListener
{
    private ImageIcon icon;
    private Color color;
    private Container c;
    private JLabel imageLabel,eLabel,pLabel;
    private JTextField eField;
    private JPasswordField pField;
    private Font font,fFont; 
    private JButton clear,signup,login;
    private Cursor cursor;
    int i=0;
    LoginForm()
    {
        icon = new ImageIcon("logo1.png");
        color = new Color(112,128,144);
        font = new Font("Cambria",Font.BOLD,18);
        fFont = new Font("Cambria",Font.BOLD,14);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Login");
        this.setResizable(false);
        this.setBounds(50,50,750,500);
        this.setIconImage(icon.getImage());
        
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(color);
        
        // Logo LabelIcon
        imageLabel = new JLabel(icon);
        imageLabel.setBounds(278,10,200,200);
        c.add(imageLabel);
        
        //Email and TextField
        eLabel = new JLabel("Email");
        eLabel.setBounds(40,220,100,20);
        eLabel.setFont(font);
        c.add(eLabel);
        
        eField = new JTextField("@gmail.com");
        eField.setBounds(140,218,190,25);
        eField.setFont(fFont);
        eField.setBorder(null);
        c.add(eField);
        
        //Password and PasswordTextField
        pLabel = new JLabel("Password");
        pLabel.setBounds(40,260,100,20);
        pLabel.setFont(font);
        c.add(pLabel);
        
        pField = new JPasswordField("********");
        pField.setBounds(140,258,190,25);
        pField.setFont(fFont);
        pField.setBorder(null);
        c.add(pField);
        
        //Clear Button
        clear = new JButton("Clear");
        clear.setBounds(140,350,80,35);
        clear.setFocusPainted(false);
        clear.setBackground(Color.lightGray);
        clear.setFont(font);
        clear.setBorderPainted(false);
        clear.setCursor(cursor);
        c.add(clear);
        
        //Login Button
        login = new JButton("Login");
        login.setBounds(228,350,80,35);
        login.setFocusPainted(false);
        login.setBackground(Color.lightGray);
        login.setBorderPainted(false);
        login.setFont(font);
        login.setCursor(cursor);
        c.add(login);
        
        //Sinup Button
        signup = new JButton("SignUp");
        signup.setBounds(315,350,100,35);
        signup.setFocusPainted(false);
        signup.setBackground(Color.lightGray);
        signup.setBorderPainted(false);
        signup.setFont(font);
        signup.setCursor(cursor);
        c.add(signup);
        
        //Adding ActionListener
        clear.addActionListener(this);
        login.addActionListener(this);
        signup.addActionListener(this);
        
        // MouseListener
        clear.addMouseListener(this);
        signup.addMouseListener(this);
        login.addMouseListener(this);
        
    }
    public void Close()
    {
        this.setVisible(false);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(clear))
        {
            eField.setText("");
            pField.setText("");
        }
        else if(e.getSource().equals(signup))
        {
            SignUpPage frame = new SignUpPage();
            frame.setVisible(true);
            this.Close();       
        }
        else if(e.getSource().equals(login))
        {
            String password = "Milon123";
            String enteredPassword = new String(pField.getPassword());
            if(eField.getText().equals("heymilon@gmail.com")&& password.equals(enteredPassword))
            {
                JOptionPane.showMessageDialog(null, "Congratulation Login Succesfully");
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Try Again");
            }
        }
    }
    public static void main(String[] args) 
    {
       LoginForm frame_ = new LoginForm();
       frame_.setVisible(true);
    }

    //MouseListener
    @Override
    public void mouseClicked(MouseEvent me) 
    {
       
    }
    @Override
    public void mousePressed(MouseEvent me)
    {
        
    }
    @Override
    public void mouseReleased(MouseEvent me)
    {
        
    }
    @Override
    public void mouseEntered(MouseEvent me) 
    {
        if(me.getSource().equals(clear))
        {
            clear.setBackground(Color.RED);
            clear.setForeground(Color.WHITE);
        }
        else if(me.getSource().equals(login))
        {
            Color clr = new Color(0,153,76);
            login.setBackground(clr);
            login.setForeground(Color.WHITE);
        }
        else if(me.getSource().equals(signup))
        {
            signup.setBackground(Color.BLUE);
            signup.setForeground(Color.WHITE);
        }
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
        clear.setBackground(Color.lightGray);
        clear.setForeground(Color.black);
        login.setBackground(Color.lightGray);
        login.setForeground(Color.black);
        signup.setBackground(Color.lightGray);
        signup.setForeground(Color.black);
    }

    
   
}
