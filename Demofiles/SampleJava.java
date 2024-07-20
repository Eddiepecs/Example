import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class DigitalClock extends JFrame {
    private JLabel clockLabel;

    public DigitalClock() {
        // Set up the frame
        setTitle("Digital Clock");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create and set up the clock label
        clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(JLabel.CENTER);
        clockLabel.setFont(new Font("Serif", Font.BOLD, 30));
        add(clockLabel, BorderLayout.CENTER);

        // Timer to update the clock every second
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                updateClock();
            }
        }, 0, 1000);

        // Make the frame visible
        setVisible(true);
    }

    private void updateClock() {
        // Get current time and format it
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        formatter.setTimeZone(TimeZone.getDefault());
        String timeString = formatter.format(now);

        // Update the clock label
        clockLabel.setText(timeString);
    }

    public static void main(String[] args) {
        // Run the clock
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DigitalClock();
            }
        });
    }
}
