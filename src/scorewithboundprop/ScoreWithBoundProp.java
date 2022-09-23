/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithboundprop;

import java.util.Scanner;

/**
 *
 * @author feifei
 */
public class ScoreWithBoundProp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LiveScoreBean scoreBean = new LiveScoreBean();
        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        scoreBean.addPropertyChangeListener(sub1);
        scoreBean.addPropertyChangeListener(sub2);
        
        while(true){
            System.out.print("Enter Score : ");
            String data = sc.nextLine();
            if ( data.equalsIgnoreCase("") ) {
                break;
            }
            scoreBean.setScoreProperty(data);
        }
        
        
    }
    
}
