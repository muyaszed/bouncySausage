/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author muyaszed
 */
public class Game {
    
    public final static int WIDTH = 800, HEIGHT = 600;
    
    private String gameName = "Bouncy Sausage";
    
    private Canvas game = new Canvas();
    
    public void start() {
        //init windows
        Dimension gameSize = new Dimension(Game.WIDTH, Game.HEIGHT);
        JFrame gameWindow = new JFrame(gameName);
        gameWindow.setSize(gameSize);
        gameWindow.setResizable(false);
        gameWindow.setVisible(true);
        game.setSize(gameSize);
        game.setMinimumSize(gameSize);
        game.setMaximumSize(gameSize);
        game.setPreferredSize(gameSize);
        gameWindow.add(game);
        gameWindow.setLocationRelativeTo(null);
        
        //Game loop
        boolean running = true;
        while(running) {
            
        }
        
        //Game end
    }
    
}
