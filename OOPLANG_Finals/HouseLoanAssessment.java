import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HouseLoanAssessment extends JFrame
{
    JLabel name = new JLabel(); //LABELS
    JLabel age = new JLabel();
    JLabel number = new JLabel();
    JLabel sourceofincome = new JLabel();
    JLabel minsourceofincome = new JLabel();
    JLabel address = new JLabel();
   
    JButton exitButton = new JButton(); //BUTTONS
    JButton submit = new JButton();
    JButton validate = new JButton();
   
    JTextField nametext = new JTextField(); //TEXT FIELD
    JTextField agetext = new JTextField();
    JTextField numbertext = new JTextField();
    JTextField sourceofincometext = new JTextField();
    JTextField minsourceofincometext = new JTextField();
    JTextField addresstext = new JTextField();
   
    public HouseLoanAssessment(){
        setTitle("House Loan Assessment"); //TITLE
       
        getContentPane().setLayout(new GridBagLayout()); //Start of layout
       
        GridBagConstraints gridConstraints = new GridBagConstraints(); //Label for name
        name.setText("Name: ");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(name,gridConstraints);
       
        age.setText("Age: "); //Label for age
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        getContentPane().add(age,gridConstraints);
        
        number.setText("Phone number: "); //Label for phone number
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        getContentPane().add(number,gridConstraints);        
              
        sourceofincome.setText("Source of income(Monthly): "); //Label for source of income
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        getContentPane().add(sourceofincome,gridConstraints);
       
        minsourceofincome.setText("Minimum income(Monthly): "); //Label for Minmum source of income
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 3;
        getContentPane().add(minsourceofincome,gridConstraints);
       
        address.setText("Permanent Address: "); //Label for Address
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 5;
        getContentPane().add(address,gridConstraints);
       
        nametext.setText(""); //User input name
        nametext.setColumns(15);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        getContentPane().add(nametext,gridConstraints);
       
        agetext.setText(""); //User input age
        agetext.setColumns(5);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        getContentPane().add(agetext,gridConstraints);
        
        numbertext.setText(""); //User input phone number
        numbertext.setColumns(15);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        getContentPane().add(numbertext,gridConstraints);
       
        sourceofincometext.setText(""); //User input source if income
        sourceofincometext.setColumns(15);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 3;
        getContentPane().add(sourceofincometext,gridConstraints);
       
        minsourceofincometext.setText(""); //User input minimum source if income monthly
        minsourceofincometext.setColumns(10);
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 3;
        getContentPane().add(minsourceofincometext ,gridConstraints);
       
        addresstext.setText(""); //User input address
        addresstext.setColumns(20);
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 5;
        getContentPane().add(addresstext ,gridConstraints);
       
        validate.setText("List of Validation"); //List of validation button
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 6;
        getContentPane().add(validate,gridConstraints);
       
        submit.setText("Submit");  //submit button
        gridConstraints.gridx = 3;
        gridConstraints.gridy = 6;
        getContentPane().add(submit,gridConstraints);
       
        exitButton.setText("EXIT"); //exit button
        gridConstraints.gridx = 4;
        gridConstraints.gridy = 6;
        getContentPane().add(exitButton,gridConstraints);
        
        addWindowListener(new WindowAdapter(){ //Exit Program listener
            public void windowClosing(WindowEvent e){
                exitForm(e);
            }
        });
       
        validate.addActionListener(new ActionListener(){ //List of validation listener
            public void actionPerformed(ActionEvent e){
                validateActionPerformed(e);
            }
        });
       
        submit.addActionListener(new ActionListener(){ //Submit listener
            public void actionPerformed(ActionEvent e){
                submitActionPerformed(e);
            }
        });
       
        exitButton.addActionListener(new ActionListener(){ //Exit listener
            public void actionPerformed(ActionEvent e){
                exitButtonActionPerformed(e);
            }
        });
       
       
        pack();
    }
   
    public void exitForm(WindowEvent e){ //Close Program
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Closing HouseLoanAssessment");
    }
   
    private void exitButtonActionPerformed(ActionEvent e) { //Exit button
            JFrame f;
            f = new JFrame();
            JOptionPane.showMessageDialog(f, "Good bye!");
            System.exit(0);
    }
    private void validateActionPerformed(ActionEvent e) { //List of Validation
            JOptionPane.showMessageDialog(null,"Age should be 18yrs old or higher." + 
            "\nIncome should be atleast P30,000.01 monthly." + 
            "\nPlease dont leave any blanks." + "\nPlease make sure to double check details before submitting :>" + 
            "\n\nCustomer Service Number: 9111",
            "LIST OF VALIDATION", JOptionPane.INFORMATION_MESSAGE);
    }
    private void submitActionPerformed(ActionEvent e) { //Conditions for HouseLoanAssesment
            int age2 = Integer.parseInt(agetext.getText());
            double minsourceofincometextv2 = Double.parseDouble(minsourceofincometext.getText());
            String nametext2 = nametext.getText();
            String numbertext2 = numbertext.getText();
            String sourceofincometext2 = sourceofincometext.getText();
            String addresstext2 = addresstext.getText();
            if (nametext2.length() == 0 || sourceofincometext2.length() == 0 || addresstext2.length() == 0 || numbertext2.length() == 0){
                JOptionPane.showMessageDialog(null,"Please dont leave any blank boxes.");
            }
            else if (age2 < 18 & minsourceofincometextv2 < 30000.01){
                JOptionPane.showMessageDialog(null,age2 + " is still not an eligible age for house loan. :<" + 
                "\n" + minsourceofincometextv2 + " is lower than minimum eligibility. Income monthly should be P30000.01 or higher.");
            }
            else if (age2 > 18 & minsourceofincometextv2 < 30000.01){
                JOptionPane.showMessageDialog(null,age2 + " is an eligible age." + 
                "\n" + minsourceofincometextv2 + " is lower than minimum eligibility. Income monthly should be P30000.01 or higher.");
            }
            else if (age2 < 18 & minsourceofincometextv2 > 30000.01){
                JOptionPane.showMessageDialog(null,age2 + " is still not an eligible age for house loan. :<" + 
                "\nP" + minsourceofincometextv2 + " is eligible and passed the required income monthly.");
            }
            else if (age2 > 18 & minsourceofincometextv2 > 30000.01){ //USER confirmation for inputed details
                JOptionPane.showMessageDialog(null,age2 + " is an eligible age for house loan. :>" + 
                "\nP" + minsourceofincometextv2 + " is eligible and passed the required income.");
                int YesNo = JOptionPane.showOptionDialog(new JFrame(), "Please confirm details:" + "\nName: " + nametext2 + "\nPhone number: " + numbertext2 
                + "\nAge: " + age2 + "\nSource of income: " + sourceofincometext2 + "\nMinimum income: P" + minsourceofincometextv2
                + "\nAddress: " + addresstext2
                ,"CONFIRMATION",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "Go back" }, JOptionPane.YES_OPTION);
              if (YesNo == JOptionPane.YES_OPTION) { //USER confirmation IF PAGIBIG member
                 int pagibigyesno = JOptionPane.showOptionDialog(new JFrame(), "Are you a PAGIBIG MEMBER?","PAGIBIG MEMBER",
                 JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                 new Object[] { "Yes", "No" }, JOptionPane.YES_OPTION);
              if (pagibigyesno == JOptionPane.YES_OPTION) {
                  JOptionPane.showMessageDialog(null,"Greetings, " + nametext2 + "," + 
                  "\n\nYou are eligible to take a loan since you are " + age2 + " yrs old and have a minimum income of P" + minsourceofincometextv2 + 
                  "\n\nYou can avail upto 1.5M of Houing Loan, please go to the nearest PAGIBIG area, ABC bank or 123 bank for further assistance." + 
                  "\n\n\nYours truly," + "\nGroup 7");
              } 
              else if (pagibigyesno == JOptionPane.NO_OPTION) {
                  JOptionPane.showMessageDialog(null,"Greetings, " + nametext2 + "," + 
                 "\n\nYou are eligible to take a loan since you are " + age2 + " yrs old and have a minimum income of P" + minsourceofincometextv2 + 
                 "\n\nYou can avail upto 1M of Houing Loan, please go to the nearest ABC bank or 123 bank for further assistance." + 
                 "\n\n\nYours truly," + "\nGroup 7");
              } 
              JOptionPane.showMessageDialog(null,"One of our Customer Service Representative will reach out within 1-2 business days." + 
              "\nYour phone number: " + numbertext2 + "\n\nFor further assistance please reach out to our Customer Service Number: 9111");
              
              System.exit(0); //DONEEEEEEEEEEEEEEEEEEE
              }
            }
        
            }
    public static void main(String[] args){ //MAIN
        new HouseLoanAssessment().show();
    }
}