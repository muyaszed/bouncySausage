/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Graphics2D;
/**
 *
 * @author muyaszed
 */
public interface Renderable {
    
    public void render(Graphics2D g, float interpolation);
    
}
