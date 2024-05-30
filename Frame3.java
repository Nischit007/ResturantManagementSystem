// // import javax.swing.JButton;
// // import javax.swing.JFrame;
// // import javax.swing.JLabel;
// // import javax.swing.JTextArea;
// // import javax.swing.JTextField;
// // import javax.swing.JScrollPane;
// // import java.awt.Font;

// // public class Frame3 {
// //     public static void main(String[] args) {
// //         JFrame frame = new JFrame("Restaurant Management System");
// //         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //         frame.setSize(1200, 800);
// //         frame.setLayout(null);

// //         JLabel label1 = new JLabel("Restaurant Management System");
// //         label1.setFont(new Font("Serif", Font.BOLD, 24)); // Set font size to 24
// //         label1.setBounds(400, 20, 600, 30); // Adjusted width and height for the new font size
// //         frame.add(label1);

// //         JLabel label2 = new JLabel("Item List");
// //         label2.setBounds(100, 60, 80, 20);
// //         frame.add(label2);

// //         JLabel label3 = new JLabel("Choosed item");
// //         label3.setBounds(700, 60, 80, 20);
// //         frame.add(label3);

// //         JTextArea area1 = new JTextArea(20, 20);  
// //         JScrollPane scrollPane1 = new JScrollPane(area1);
// //         scrollPane1.setBounds(50, 100, 500, 260);
// //         frame.add(scrollPane1);

// //         JTextArea area2 = new JTextArea(20, 20);  
// //         JScrollPane scrollPane2 = new JScrollPane(area2);
// //         scrollPane2.setBounds(650, 100, 500, 200);
// //         frame.add(scrollPane2);

// //         JLabel label4=new JLabel("Item No:");
// //         label4.setBounds(680,320,80,30);
// //         frame.add(label4);
// //         JTextField field=new JTextField();
// //         field.setBounds(740,320,100,30);
// //         frame.add(field);
        
// //         JButton button1=new JButton("Remove Order");
// //        button1.setBounds(630,370,150,30);
// //         frame.add(button1);

// //         JButton button2=new JButton("Place Order");
// //         button2.setBounds(800,370,150,30);
// //          frame.add(button2);

// //         frame.setVisible(true);
// //     }
// // }

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;
// import javax.swing.JScrollPane;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import java.awt.Font;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Frame3 {
//     public static void frame4(){
//         JFrame frame = new JFrame("Restaurant Management System");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(1200, 800);
//         frame.setLayout(null);

//         JLabel label1 = new JLabel("Restaurant Management System");
//         label1.setFont(new Font("Serif", Font.BOLD, 24)); // Set font size to 24
//         label1.setBounds(400, 20, 600, 30); // Adjusted width and height for the new font size
//         frame.add(label1);

//         JLabel label2 = new JLabel("Item List");
//         label2.setBounds(100, 60, 80, 20);
//         frame.add(label2);

//         JLabel label3 = new JLabel("Choosed item");
//         label3.setBounds(700, 60, 100, 20);
//         frame.add(label3);

//         JTextArea area1 = new JTextArea(20, 20);
//         JScrollPane scrollPane1 = new JScrollPane(area1);
//         scrollPane1.setBounds(50, 100, 500, 260);
//         frame.add(scrollPane1);

//         JTextArea area2 = new JTextArea(20, 20);
//         JScrollPane scrollPane2 = new JScrollPane(area2);
//         scrollPane2.setBounds(650, 100, 500, 200);
//         frame.add(scrollPane2);

//         JLabel label4 = new JLabel("Item No:");
//         label4.setBounds(680, 320, 80, 30);
//         frame.add(label4);

//         JTextField field = new JTextField();
//         field.setBounds(740, 320, 100, 30);
//         frame.add(field);

//         JButton button1 = new JButton("Remove Order");
//         button1.setBounds(630, 370, 150, 30);
//         frame.add(button1);

//         JButton button2 = new JButton("Place Order");
//         button2.setBounds(800, 370, 150, 30);
//         frame.add(button2);

//         button2.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 JPanel panel = new JPanel();
//                 panel.setLayout(null);

//                 JLabel messageLabel = new JLabel("Do you want to continue?");
//                 messageLabel.setBounds(50, 10, 200, 25);
//                 panel.add(messageLabel);

//                 JButton yesButton = new JButton("Yes");
//                 yesButton.setBounds(20, 60, 80, 30);
//                 panel.add(yesButton);

//                 JButton noButton = new JButton("No");
//                 noButton.setBounds(120, 60, 80, 30);
//                 panel.add(noButton);

//                 yesButton.addActionListener(new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         JOptionPane.showMessageDialog(frame, "Order placed successfully.");
//                     }
//                 });

//                 noButton.addActionListener(new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
                  
//                         JOptionPane.showMessageDialog(frame, "Order not placed.");
//                     }
//                 });

//                 int result = JOptionPane.showOptionDialog(frame, panel, "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
//             }
//         });

//         frame.setVisible(true);
//     }
//     public static void main(String[] args) {
       
//     }
// }
// The code for Frame3 class with modifications to call frame5() from Frame2

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3 {
    public static void frame4(){
        JFrame frame = new JFrame("Restaurant Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Restaurant Management System");
        label1.setFont(new Font("Serif", Font.BOLD, 24)); // Set font size to 24
        label1.setBounds(400, 20, 600, 30); // Adjusted width and height for the new font size
        frame.add(label1);

        JLabel label2 = new JLabel("Item List");
        label2.setBounds(100, 60, 80, 20);
        frame.add(label2);

        JLabel label3 = new JLabel("Choosed item");
        label3.setBounds(700, 60, 100, 20);
        frame.add(label3);

        JTextArea area1 = new JTextArea(20, 20);
        JScrollPane scrollPane1 = new JScrollPane(area1);
        scrollPane1.setBounds(50, 100, 500, 260);
        frame.add(scrollPane1);

        JTextArea area2 = new JTextArea(20, 20);
        JScrollPane scrollPane2 = new JScrollPane(area2);
        scrollPane2.setBounds(650, 100, 500, 200);
        frame.add(scrollPane2);

        JLabel label4 = new JLabel("Item No:");
        label4.setBounds(680, 320, 80, 30);
        frame.add(label4);

        JTextField field = new JTextField();
        field.setBounds(740, 320, 100, 30);
        frame.add(field);

        JButton button1 = new JButton("Remove Order");
        button1.setBounds(630, 370, 150, 30);
        frame.add(button1);

        JButton button2 = new JButton("Place Order");
        button2.setBounds(800, 370, 150, 30);
        frame.add(button2);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = new JPanel();
                panel.setLayout(null);
        
                JLabel messageLabel = new JLabel("Do you want to continue?");
                messageLabel.setBounds(50, 10, 200, 25);
                panel.add(messageLabel);
        
                JButton yesButton = new JButton("Yes");
                yesButton.setBounds(20, 60, 80, 30);
                panel.add(yesButton);
        
                JButton noButton = new JButton("No");
                noButton.setBounds(120, 60, 80, 30);
                panel.add(noButton);
        
                yesButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame, "Order placed successfully.");
                    }
                });
        
                noButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose();
                        Frame2.frame5(); // Call frame5 from Frame2
                    }
                });
        
                // Display the option dialog
                int result = JOptionPane.showOptionDialog(frame, panel, "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
            }
        });
        
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
       
    }
}
