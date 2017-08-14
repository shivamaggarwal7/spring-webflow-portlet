package com.example.plugins;

import org.springframework.webflow.mvc.portlet.AbstractFlowHandler;

public class ViewFlowHandler extends AbstractFlowHandler {

    public String getFlowId() {
	return "appFlow";
    }

}
