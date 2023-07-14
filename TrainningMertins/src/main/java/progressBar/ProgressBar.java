/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progressBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author italo
 */
public class ProgressBar {
    
    private JFrame mainFrame;
    private JButton startButton;
    private JProgressBar progressBar;
    
    ProgressBar(){
        mainFrame = new JFrame("Progress Bar Exemple");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(3);

        
        startButton = new JButton("Start");
        startButton.setBounds(50, 50, 100,50);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Teste");
            }
        });
        
        progressBar = new JProgressBar(0, 100);
        progressBar.setBounds(50, 150, 500, 50);
        
        
        mainFrame.add(progressBar);
        mainFrame.add(startButton);
        mainFrame.setVisible(true);
                
    }
    
    public static void main(String[] args) {
        new ProgressBar();
    }
    
    private class Task extends Thread{
        
        @Override
        public void run(){
            for (int i = 0; i < 100; i++) {
                progressBar.setValue(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
        }
    }
}
