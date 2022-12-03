package Abstraction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Frame and Panel
        JFrame frame = new JFrame("Password Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelOne = new JPanel(new GridLayout(2,2,1,1));
        JPanel panelTwo = new JPanel(new FlowLayout());
        JButton button = new JButton("Generate");

        // Setting the panel sizes
        panelTitle.setBounds(10,10,370,40);
        panelOne.setBounds(10,60,370,100);
        panelTwo.setBounds(10,200,370,40);
        // Color for visualization only
        panelTitle.setBackground(Color.green);
        panelOne.setBackground(Color.yellow);
        panelTwo.setBackground(Color.lightGray);

        JLabel labelOne, labelTitle;

        JTextField tFieldOne, tFieldTwo;
        tFieldOne = new JTextField(20);
        tFieldOne.setPreferredSize(new Dimension(80,20));

        labelTitle = new JLabel("Enter you last name to generate a password:", JLabel.CENTER);
        labelOne = new JLabel("Last Name", JLabel.CENTER);


        labelTitle.setBounds(10,10,90,20);
        labelOne.setBounds(10,10,90,20);
        tFieldOne.setBounds(5, 5, 100, 100);

        panelTitle.add(labelTitle);

        panelOne.add(labelOne);
        panelOne.add(tFieldOne);

        button.setBounds(10,10,90,100);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Button Clicked");
                //System.out.println(tFieldOne.getText());
                //System.out.println(tFieldTwo.getText());
                String result = computeValue(tFieldOne.getText());
                //System.out.println(result);
                displayMessage(result);
            }
        });

        panelTwo.add(button);

        frame.add(panelTitle);
        frame.add(panelOne);
        frame.add(panelTwo);

        // make the frame half the height and width
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        // set size to half of screen
        //frame.setSize(width/2, height/2);

        frame.setSize(400,300);
        frame.setResizable(false);
        frame.setLayout(null);

        // center the jframe on screen
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static String computeValue(String LName){

        double RGen = Math.random();

        int RVal1 = (int) (1 + 9 * RGen);
        RGen = Math.random();
        int RVal2 = (int) (1 + 9 * RGen);
        RGen = Math.random();
        int RVal3 = (int) (1 + 9 * RGen);


        String PassKey = String.valueOf(RVal1) + String.valueOf(RVal2) + String.valueOf(RVal3);

        String FirstUp = LName.toUpperCase();
        int FirstEnd = LName.length()-1;


        return FirstUp.charAt(0) + PassKey + FirstUp.charAt(FirstEnd);
    }

    public static void displayMessage(String message){
        JOptionPane.showMessageDialog( null, message, "Your Password is: " , JOptionPane.INFORMATION_MESSAGE );
    }

}
