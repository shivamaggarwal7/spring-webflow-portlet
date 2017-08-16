# spring-webflow-portlet

We begin with initial configuration for getting started with the Liferay spring webflow portlet.This
is built on top of spring mvc portlet.In order to configure:

- In spring config file
	- Configurations for **flow-registry** and **flow-executor** needs to be done
	- Flow registry for web flow definition file(s) needs to be configured
	- Being a portlet environment,we need to configure **PortletModeHandlerMapping**
	  implementation,which defines the parent(initial) flow definition file
	  
- By convention,different flows are defined in subsequent packages and flow definitions and
  views and clubbed together in single package
- The view state id in a flow file is set same as view file name,by convention
- A flow definition consists of states(view,transition,evaluate expression) 