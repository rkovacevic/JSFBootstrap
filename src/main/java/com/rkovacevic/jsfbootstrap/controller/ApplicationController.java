package com.rkovacevic.jsfbootstrap.controller;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("app")
@ApplicationScoped
public class ApplicationController {

	public static final String applicationName = "JSF 2 + Twitter Bootstrap";
	
	public String getApplicationName() {
		return applicationName;
	}
}
