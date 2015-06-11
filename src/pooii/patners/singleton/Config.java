/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooii.patners.singleton;

/**
 *
 * @author Valmir
 */
public class Config {
    private static Config config;
    
    private Config(){        
    }
    
    public static Config getIstance(){
        if(config==null){
            config=new Config();
        }
        return config;
    }        
    
}
