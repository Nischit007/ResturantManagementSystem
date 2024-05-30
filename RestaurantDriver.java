// import java.awt.GridLayout;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JScrollPane;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;

// public class RestaurantDriver {
//     public static void main(String[] args) {
//         // Create an instance of RestaurantDriver
//         RestaurantDriver driver = new RestaurantDriver();   
//         // Call the frame2 method to create and display the GUI
//     //   frame2();
//     }  
//     // method to take customer name and status
//     public static void frame2() {
//        JFrame frame = new JFrame();
       
//        // creating components
//        JLabel customerLabel = new JLabel("CUSTOMER");
//        JLabel nameLabel= new JLabel("NAME:");
//        JTextField nameField= new JTextField();
//        JLabel statusLabel= new JLabel("STATUS:");
//        JTextField statusField= new JTextField();
//        JButton button= new JButton("✓");
//        frame.setLayout(null);
       
//        // Adding components to frame
//        frame.add(customerLabel);
//        frame.add(nameLabel);
//        frame.add(nameField);
//        frame.add(statusLabel);
//        frame.add(statusField);
//        frame.add(button);
       
//        // setting bounds for components
//        customerLabel.setBounds(60,10,100,20);
//        nameLabel.setBounds(10,40,50,20);
//        nameField.setBounds(70,40,100,20);
//        statusLabel.setBounds(10,70,100,20);
//        statusField.setBounds(70,70,100,20);
//        button.setBounds(10,90,45,20);
       
//        button.addActionListener(new ActionListener() {
//     	   public void actionPerformed(ActionEvent e) {   
//     		   frame.dispose();
//     		   frame3();
//     	   }
//        });    
//        frame.setSize(200,200);
//        frame.setVisible(true);
       
//     }
    
//     public static void frame3() {
//     	JFrame frame = new JFrame();
//     	frame.setLayout(new GridLayout(1,2));
    	
//     	//create and add panel to frame for two menus
//     	JPanel menu1Panel= new JPanel();
//     	frame.add(menu1Panel);
//     	JPanel menu2Panel= new JPanel();
//     	frame.add(menu2Panel);
    	
//     	// creating components
//     	JLabel menu1Label= new JLabel("Menu 1");
//     	JScrollPane menu1ScrollPane= new JScrollPane(new JTextArea());
//     	JLabel menu2Label= new JLabel("Menu 2");
//     	JScrollPane menu2ScrollPane= new JScrollPane(new JTextArea());
//     	JButton menu1Button= new JButton("Select");
//     	JButton menu2Button= new JButton("Select");
    	
//     	// adding components to panel
//     	menu1Panel.add(menu1Label);
//     	menu1Panel.add(menu1ScrollPane);
//     	menu2Panel.add(menu2Label);
//     	menu2Panel.add(menu2ScrollPane);
//     	menu1Panel.add(menu1Button);
//     	menu2Panel.add(menu2Button);
    	
//     	// setting bounds for components
//     	menu1Label.setBounds(15,10,100,20);
//     	menu1ScrollPane.setBounds(10,40,200,380);
//     	menu2Label.setBounds(15,10,100,20);
//     	menu2ScrollPane.setBounds(10,40,200,380);
//     	menu1Button.setBounds(10,425,80,20);
//     	menu2Button.setBounds(10,425,80,20);

//         menu1Button.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 Frame3.frame4();
                
//             }
//         });
//         menu2Button.addActionListener(new ActionListener() {
//             public void actionPerformed(ActionEvent e) {
//                 Frame3.frame4();
                
//             }
//         });

    	
    	
//     	menu1Panel.setLayout(null);
//     	menu2Panel.setLayout(null);
//     	menu1Panel.setSize(250,500);
//     	menu2Panel.setSize(250,500);
//     	frame.setVisible(true);
//     	frame.setSize(500,500);
//     }

// }


import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantDriver {
    public static void main(String[] args) {
        // Create an instance of RestaurantDriver
        RestaurantDriver driver = new RestaurantDriver();
        // Call the frame2 method to create and display the GUI
        // frame2();
    }

    // method to take customer name and status
    public static void frame2() {
        JFrame frame = new JFrame();

        // creating components
        JLabel customerLabel = new JLabel("CUSTOMER");
        JLabel nameLabel = new JLabel("NAME:");
        JTextField nameField = new JTextField();
        JLabel statusLabel = new JLabel("STATUS:");
        JTextField statusField = new JTextField();
        JButton button = new JButton("✓");
        frame.setLayout(null);

        // Adding components to frame
        frame.add(customerLabel);
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(statusLabel);
        frame.add(statusField);
        frame.add(button);

        // setting bounds for components
        customerLabel.setBounds(60, 10, 100, 20);
        nameLabel.setBounds(10, 40, 50, 20);
        nameField.setBounds(70, 40, 100, 20);
        statusLabel.setBounds(10, 70, 100, 20);
        statusField.setBounds(70, 70, 100, 20);
        button.setBounds(10, 90, 45, 20);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame3();
            }
        });
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

    public static void frame3() {
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(1, 2));

        //create and add panel to frame for two menus
        JPanel menu1Panel = new JPanel();
        frame.add(menu1Panel);
        JPanel menu2Panel = new JPanel();
        frame.add(menu2Panel);

        // creating components
        JLabel menu1Label = new JLabel("Menu 1");
        JScrollPane menu1ScrollPane = new JScrollPane(new JTextArea());
        JLabel menu2Label = new JLabel("Menu 2");
        JScrollPane menu2ScrollPane = new JScrollPane(new JTextArea());
        JButton menu1Button = new JButton("Select");
        JButton menu2Button = new JButton("Select");

        // adding components to panel
        menu1Panel.add(menu1Label);
        menu1Panel.add(menu1ScrollPane);
        menu2Panel.add(menu2Label);
        menu2Panel.add(menu2ScrollPane);
        menu1Panel.add(menu1Button);
        menu2Panel.add(menu2Button);

        // setting bounds for components
        menu1Label.setBounds(15, 10, 100, 20);
        menu1ScrollPane.setBounds(10, 40, 200, 380);
        menu2Label.setBounds(15, 10, 100, 20);
        menu2ScrollPane.setBounds(10, 40, 200, 380);
        menu1Button.setBounds(10, 425, 80, 20);
        menu2Button.setBounds(10, 425, 80, 20);

        // Add action listeners to buttons
        menu1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame3.frame4();
            }
        });
        menu2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Frame3.frame4();
            }
        });

        menu1Panel.setLayout(null);
        menu2Panel.setLayout(null);
        menu1Panel.setPreferredSize(new Dimension(250, 500)); // Set panel size
        menu2Panel.setPreferredSize(new Dimension(250, 500)); // Set panel size

        frame.setVisible(true);
        frame.setSize(500, 500);
    }
}
