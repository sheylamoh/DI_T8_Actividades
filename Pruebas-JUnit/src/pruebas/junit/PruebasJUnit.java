/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas.junit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 6teme
 */
public class PruebasJUnit {
    
     public static int max(int[] a)
    {
        int i, m = 0;

        if (a == null)
        {
            return 0;
        } else if (a.length == 0)
        {
            return 0;
        }
        
        m = a[0];
        for (i = 0; i < a.length; i++)
        {
            if (a[i] > m)
            {
                m = a[i];
            }
        }
        return m;
    }
    
}
