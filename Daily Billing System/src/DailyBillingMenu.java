import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DailyBillingMenu {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Daily Billing System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Get screen dimensions
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height / 2; // Use half the screen height for balance

        // Set frame size to full screen width and half the height
        frame.setSize(screenWidth, screenHeight);
        frame.setLocationRelativeTo(null); // Center the frame

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu menu = new JMenu("Menu");

        // Create menu items
        JMenuItem bikeMenuItem = new JMenuItem("Bike");
        JMenuItem dailyExpenseMenuItem = new JMenuItem("Daily Expense");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Add menu items to the menu
        menu.add(bikeMenuItem);
        menu.add(dailyExpenseMenuItem);
        menu.addSeparator(); // Add a separator
        menu.add(exitMenuItem);

        // Add menu to the menu bar
        menuBar.add(menu);

        // Set the menu bar in the frame
        frame.setJMenuBar(menuBar);

        // Add ActionListeners to menu items
        bikeMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Bike window
                openBikeWindow();
            }
        });

        dailyExpenseMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Daily Expense window
                openDailyExpenseWindow();
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Exit the application
                System.exit(0);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    // Method to open the "Bike" window
    private static void openBikeWindow() {
        JFrame bikeFrame = new JFrame("Bike Details");
        bikeFrame.setSize(400, 300);
        bikeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Bike Details Feature Coming Soon!", SwingConstants.CENTER);
        bikeFrame.add(label);

        bikeFrame.setVisible(true);
    }

    // Method to open the "Daily Expense" window
    private static void openDailyExpenseWindow() {
        JFrame expenseFrame = new JFrame("Daily Expense");
        expenseFrame.setSize(400, 300);
        expenseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Daily Expense Feature Coming Soon!", SwingConstants.CENTER);
        expenseFrame.add(label);

        expenseFrame.setVisible(true);
    }
}
