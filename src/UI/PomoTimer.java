package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DecimalFormat;

public class PomoTimer {

    private Timer timer;
    private int delay;
    private int period;
    private int minutes;
    private int seconds;
    private String doubleMinutes;
    private String doubleSeconds;

    private JLabel label;
    private TimerTask task;
    DecimalFormat decimalFormat;

    public PomoTimer() {
        initLabel();
        initTimer();
    }

    public void initLabel() {
        label = new JLabel();
    }

    public void initTimer() {
        decimalFormat = new DecimalFormat("00");
        delay = 1000;
        period = 1500000;
        minutes = 25;
        seconds = 0; 
        timer = new Timer();
        task = new TimerTask(){
            public void run() {
                System.out.println();
                seconds--;
                doubleSeconds = decimalFormat.format(seconds);
                doubleMinutes = decimalFormat.format(minutes);

                label.setText(doubleMinutes + ":" + doubleSeconds);
                
                if (seconds == -1) {
                    seconds = 59;
                    minutes--;
                    label.setText(doubleMinutes + ":" + doubleSeconds);
                }

                if (minutes == 0 && seconds == 0) {
                    timer.cancel();
                }
            }
        };
        
        timer.schedule(task, delay, period);
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
