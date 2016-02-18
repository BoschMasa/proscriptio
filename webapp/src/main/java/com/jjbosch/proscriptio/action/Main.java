package com.jjbosch.proscriptio.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/** Test action to see if the system is alive
 * 
 * @author Rittmann
 * @since 18.02.16
 */
public class Main extends ActionSupport {
	private Logger logger = LoggerFactory.getLogger(Main.class);
	
	private static final long serialVersionUID = 6943157882829475475L;
	
	/** Simple empty action to test spring + struts2 + tiles3 infrastructure
	 * 
	 * @return SUCCESS
	 */
	public String execute () {
		logger.trace("Executing Main.execute");
		
		return Action.SUCCESS;
	}
}
