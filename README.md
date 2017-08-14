# spring-webflow-portlet

We begin with initial configuration for getting started with the Liferay spring webflow portlet.This
is built on top of spring mvc portlet.In order to configure:

- In spring config file
	- Configurations for flow-registry and flow-executor needs to be done
	- Flow registry for web flow definition file(s) needs to be configured
	- Being a portlet environment,we need to configure PortletModeHandlerMapping,which
	  defines the parent(initial) flow definition file
	  
- By convention,different flows are defined in subsequent packages and flow defintions and
  views and clubbed together in single package
- The view state id in a flow file is generally same as view file name
- A flow consists of states(view,transition,evaluate expression)
- PortletModeHandlerMapping initiates a flow beginning  