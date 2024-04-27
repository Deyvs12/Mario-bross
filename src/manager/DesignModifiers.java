/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import designs.Christmas;
import designs.Halloween;
import designs.DiaDeMuertos;

/**
 *
 * @author flapl
 */
public class DesignModifiers {
    
    private static DesignModifiers instance;
    
    //Halloween sprite = new Halloween();
    //Christmas sprite = new Christmas();
    DiaDeMuertos sprite = new DiaDeMuertos();
    
    public String sSprite, background, mario, brick, heart, gameOver, icon, menu;
   
    public DesignModifiers(){
        sSprite = sprite.spriteSeason();
        mario = sprite.marioSeason();
        brick = sprite.brickSeason();
        background = sprite.backgroundSeason();
        heart = sprite.heartSeason();
        gameOver = sprite.gameoverSeason();
        icon = sprite.iconSeason();
        menu = sprite.menuSeason();
        
    }  
    
    public static DesignModifiers getInstance(){
        if (instance == null){
            instance = new DesignModifiers();
        }
        return instance;
    }
    
}
