/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progressBar;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author italo
 */
public class ProgressBar {
    
    private JFrame mainFrame;
    private JButton startButton;
    
    ProgressBar(){
        mainFrame = new JFrame("Progress Bar Exemple");
        mainFrame.setSize(600, 400);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(3);

        
        startButton = new JButton("Start");
        startButton.setBounds(50, 50, 100,50);
        mainFrame.add(startButton);
        
        
        
        mainFrame.setVisible(true);
                
    }
    
    public static void main(String[] args) {
        new ProgressBar();
    }
    
    private class Task extends Thread{
        
    }
}
