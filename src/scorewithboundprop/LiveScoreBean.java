/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithboundprop;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author feifei
 */
public class LiveScoreBean implements Serializable {
    
    public static final String score_PROPERTY = "score";
    
    private String score;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScoreProperty() {
        return score;
    }
    
    public void setScoreProperty(String value) {
        String oldScore = score;
        score = value;
        propertySupport.firePropertyChange(score_PROPERTY, oldScore, score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
