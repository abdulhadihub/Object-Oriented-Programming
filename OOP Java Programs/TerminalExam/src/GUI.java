import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GUI extends JFrame {

    // PART A TASK 1
    JPanel main = new JPanel();

    JLabel rollL = new JLabel("Roll Number: ");
    JLabel nameL = new JLabel("Name: ");
    JLabel dateL = new JLabel("Date: ");

    String[] dateArr = {"19-1-2022", "20-1-2022", "21-1-2022"};
    JTextField rollT = new JTextField(10);
    JTextField nameT = new JTextField(10);

    JComboBox dateCB = new JComboBox(dateArr);
    JCheckBox confirmCB = new JCheckBox("I confirm that I took the class on this date");
    JButton addB = new JButton("Add Attendance");

    boolean checked = false;

    public GUI(){
        main.setLayout(new FlowLayout());
        main.add(rollL);
        main.add(rollT);
        main.add(nameL);
        main.add(nameT);
        main.add(dateL);
        main.add(dateCB);
        main.add(confirmCB);
        main.add(addB);

        add(main);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,500);
        setVisible(true);

        // PART A TASK 2
        rollT.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String rollVerify = rollT.getText();
                try{
                String[] rollArray = rollVerify.split("-");
                if(rollArray[0].length() != 4 || rollArray[1].length() != 3 || rollArray[2].length() != 3){
                    rollT.setText("");
                    System.out.println("Invalid roll number");
                }
                else{
                    System.out.println("Valid roll number");
                }
                }
                catch (Exception error){
                    rollT.setText("");
                    System.out.println("Invalid roll number");
                    System.out.println(error.getMessage());
                }
            }
        });

        // Part A Task 3
        dateCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JOptionPane.showMessageDialog(null, "You selected " + e.getItem(), "Date Message", JOptionPane.PLAIN_MESSAGE );
            }
        });

        // Part A Task 4
        confirmCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(confirmCB.isSelected()){
                    checked = true;
                    System.out.println("Checked box selected");
                }
                else if(!confirmCB.isSelected()){
                    checked = false;
                    System.out.println("Checked box unselected");
                }
            }
        });

        // PART A TASK 5 OPTIONAL
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checked){
                    PrintWriter outFile = null;
                    try{
                        outFile = new PrintWriter(new File("E:\\Desktop\\Java Programs\\TerminalExam\\src\\outputData.txt"));
                        outFile.println(rollT.getText() + " " + dateCB.getSelectedItem() + " " + nameT.getText());
                        System.out.println("File write successful");
                    }
                    catch (FileNotFoundException error){
                        System.out.println(error.getMessage());
                    }
                    finally {
                        outFile.close();
                    }
                }
            }
        });
    }

    public static void main(String[] args){
        new GUI();
    }
}
