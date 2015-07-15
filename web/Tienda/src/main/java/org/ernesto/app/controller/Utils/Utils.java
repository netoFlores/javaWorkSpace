package org.ernesto.app.controller.Utils;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Utils {
    
    public static void addMessage(String summary, String detail){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary, detail));
    }
}
