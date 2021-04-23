
package LoginProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUpPage extends JFrame implements ActionListener,MouseListener
{
    private Container c;
    private Color bodyColor,pColor;
    private JLabel hLabel,hBackground,Name,FirstName,LastName,email,Password,phone,address,code,HBD,gender;
    private Font hFont,NamgingFont,fieldFont;
    private JTextField fnField,lnField,eField,fPhone,faddress,fcode,fHBD,fGender;
    private JPasswordField pField;
    private JRadioButton male,female;
    private ButtonGroup group;
    private JButton submit,home;
    private JPanel panel;
    private Cursor cursor; 
    
    SignUpPage()
    {
        bodyColor = new Color(220,220,220);
        pColor = new Color(0,151,153);
        hFont = new Font("Cambria",Font.BOLD,30);
        NamgingFont = new Font("Cambria",Font.BOLD,18);
        fieldFont = new Font("Cambria",Font.PLAIN,16);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Registation Form");
        this.setResizable(false);
        this.setBounds(500,20,800,700);
        
        c = new Container();
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(bodyColor);
        
//        Hader Label
        hLabel = new JLabel("Registation Form");
        hLabel.setBounds(260,20,300,40);
        hLabel.setFont(hFont);
        c.add(hLabel);
        
        hBackground = new JLabel();
        hBackground.setBounds(0,15,800,60);
        hBackground.setOpaque(true);
        hBackground.setBackground(Color.lightGray);
        c.add(hBackground);
        
//       START  NAMING------------------------------------------------------
           Name = new JLabel("Name");
           Name.setBounds(30,120,50,20);
           Name.setFont(NamgingFont);
           c.add(Name);
           
            // First Name
           fnField = new JTextField("");
           fnField.setBounds(150,120,180,25);
           fnField.setFont(fieldFont);
           fnField.setBorder(null);
           c.add(fnField);
           
           FirstName = new JLabel("First Name");
           FirstName.setBounds(152,147,180,20);
           c.add(FirstName);
           
            // Last Name
           lnField = new JTextField("");
           lnField.setBounds(350,120,180,25);
           lnField.setFont(fieldFont);
           lnField.setBorder(null);
           c.add(lnField);
           
           LastName = new JLabel("Last Name");
           LastName.setBounds(352,147,180,20);
           c.add(LastName);
 //       END NAMING------------------------------------------------------  
 
// START EAMAIL LABEL AND FIELD-------------------------------------------
        // EMAIL LABEL
        email = new JLabel("Eamil");
        email.setBounds(30,185,100,25);
        email.setFont(NamgingFont);
        c.add(email);
        
        //EMAIL TEXT FIELD
        eField = new JTextField("@gamil.com");
        eField.setBounds(150,185,380,25);
        eField.setBorder(null);
        eField.setFont(fieldFont);
        c.add(eField);
  // END EAMAIL LABEL AND FIELD-------------------------------------------
  
  // START Password LABEL AND FIELD-------------------------------------------
        //PASSWORD LABEL
        Password = new JLabel("Password");
        Password.setBounds(30,230,100,25);
        Password.setFont(NamgingFont);
        c.add(Password);
        
        //PASSWORD FILED
        pField = new JPasswordField("********");
        pField.setBounds(150,230,380,25);
        pField.setBorder(null);
        c.add(pField);
// END Password LABEL AND FIELD-------------------------------------------
 
 // START PHONE LABEL AND FIELD-------------------------------------------
     //PHONE LABEL
     phone = new JLabel("Phone");
     phone.setBounds(30,270,100,25);
     phone.setFont(NamgingFont);
     c.add(phone);
     
     //PHONE Filed
      fPhone = new JTextField(" +8801xxxxxxx");
      fPhone.setBounds(150,270,380,25);
      fPhone.setFont(fieldFont);
      fPhone.setBorder(null);
      c.add(fPhone);
   // END PHONE LABEL AND FIELD-------------------------------------------
  
// START ADDRESS LABEL AND FIELD-------------------------------------------
        //ADDRESS LABEL
        address = new JLabel("Address");
        address.setBounds(30,310,150,25);
        address.setFont(NamgingFont);
        c.add(address);
        
        //ADDRESS LABEL
        faddress = new JTextField();
        faddress.setBounds(150,310,180,25);
        faddress.setBorder(null);
        faddress.setFont(fieldFont);
        c.add(faddress);
        
       // COUNTRY CODE
        code = new JLabel("Country Code");
        code.setBounds(340,310,150,25);
        code.setFont(NamgingFont);
        c.add(code);
        
        // COUNTRY CODE FIELD
        fcode = new JTextField();
        fcode.setBounds(460,310,70,25);
        fcode.setBorder(null);
        fcode.setFont(fieldFont);
        c.add(fcode);
       
   // END ADDRESS LABEL AND FIELD-------------------------------------------
   
  // START DATRE OF BIRTH LABEL AND FIELD-----------------------------------
       //LABEL OF BIRTHDAY
       HBD  = new JLabel("Date of Birth");
       HBD.setBounds(30,350,200,25);
       HBD.setFont(NamgingFont);
       c.add(HBD);
       
       //FIELD OF BIRTHDAY
       fHBD = new JTextField(" DD/MM/YYYY");
       fHBD.setBounds(150,350,380,25);
       fHBD.setBorder(null);
       fHBD.setFont(fieldFont);
       c.add(fHBD);
       
       
// START GENDER LABEL AND FIELD-----------------------------------
       // LABEL OF GENDER
       gender = new JLabel("Gender");
       gender.setBounds(30,390,100,25);
       gender.setFont(NamgingFont);
       c.add(gender);
       //RADIO BUTTON FOT GENDER
       male = new JRadioButton("Male");
       male.setBounds(150,390,100,25);
       male.setBackground(bodyColor);
       male.setFocusPainted(false);
       male.setSelected(true);
       c.add(male);
       
       female = new JRadioButton("Female");
       female.setBounds(250,390,200,25);
       female.setBackground(bodyColor);
       female.setFocusPainted(false);
       c.add(female);
       group = new ButtonGroup();
       group.add(male);
       group.add(female);
// END GENDER LABEL AND FIELD-----------------------------------

//START PANEL AND LABEL AND FIELD-------------------------------
        //PANEL BUTTON
        submit = new JButton("Submit");
        submit.setBounds(90,50,100,40);
        submit.setBorder(null);
        submit.setFocusPainted(false);
        submit.setFont(NamgingFont);
        submit.setBackground(Color.lightGray);
        submit.setCursor(cursor);
        
        home = new JButton("Home");
        home.setBounds(210,50,100,40);
        home.setBorder(null);
        home.setFocusPainted(false);
        home.setFont(NamgingFont);
        home.setCursor(cursor);
        home.setBackground(Color.lightGray);
                
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(submit);
        panel.add(home);
        panel.setBackground(pColor);
        panel.setBounds(200,460,400,150);
        c.add(panel);
 //START PANEL AND LABEL AND FIELD-------------------------------
 
// START ACTION LISTENER-----------------------------------------
        home.addActionListener(this);
        submit.addActionListener(this);
// END ACTION LISTENER-----------------------------------------

// START MOUSE LISTENER-----------------------------------------
   submit.addMouseListener(this);
   home.addMouseListener(this);
    }
    //ACTION LISTENR
     @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource().equals(home))
        {
            LoginForm frame = new LoginForm ();
            frame.setVisible(true);
        }
        else if(e.getSource().equals(submit))
        {
            if(fnField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Field Blank Please Recheck");
            }
            else
            {
                int N = JOptionPane.showConfirmDialog(null, "Are You Sure?","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
                if(N==JOptionPane.YES_OPTION)
                {
                    JOptionPane.showMessageDialog(null, "Congratulation Registation Succesfully");
                }
            }
            
        }
    }
    public static void main(String[] args)
    {
        SignUpPage frame = new SignUpPage();
        frame.setVisible(true);
    }

   
    
    // MOUSE LISTENER
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
        if(me.getSource().equals(submit))
        {
            Color sColor = new Color(0,152,73);
            submit.setBackground(sColor);
            submit.setForeground(Color.WHITE);
        }
        else if(me.getSource().equals(home))
        {
            Color hColor = new Color(25,51,0);
            home.setBackground(hColor);
            home.setForeground(Color.white);
        }
        
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
         if(me.getSource().equals(submit))
        {
 
            submit.setBackground(Color.lightGray);
            submit.setForeground(Color.BLACK);
        }
        else if(me.getSource().equals(home))
        {
            home.setBackground(Color.lightGray);
            home.setForeground(Color.black);
        }

    }
}
