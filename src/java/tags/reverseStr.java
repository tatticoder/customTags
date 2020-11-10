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
public class reverseStr extends TagSupport {

    public String inp;

    public void setInp(String inp) {
        this.inp = inp;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            StringBuilder sb = new StringBuilder(inp).reverse();
            out.println("<h2>Reverse</h2>'" + inp + "' turns to '" + sb.toString() + "'");
        } catch (Exception up) {
            up.printStackTrace();
        }

        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }

}
