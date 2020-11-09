/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author sicarius
 */
public class tagHandler extends TagSupport{

    @Override
    public int doStartTag() throws JspException {
        try{
        
            JspWriter out = pageContext.getOut();
            out.println("<h1>this is new tage from js</h1>");
        
        }
        
        catch(Exception up)
        {
        up.printStackTrace();
        }
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }
    
}
