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
public class printSubStr extends TagSupport {

    public int start, end;
    public String str;

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.println("<h2>Sub string</h2>  '" + str + "' from " + start + " to " + end + " is :'" + str.substring(start, end) + "'");

        } catch (Exception up) {
            up.printStackTrace();
        }
        return SKIP_BODY; //To change body of generated methods, choose Tools | Templates.
    }

}
