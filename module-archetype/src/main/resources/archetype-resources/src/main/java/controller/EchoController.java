#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ${groupId}.config.ProviderNameConfig;

@RestController
public class EchoController {
	private static final Logger LOG = LoggerFactory.getLogger(EchoController.class);

	@Autowired
	private ProviderNameConfig providerNameConfig;

	@RequestMapping(value = "/echo/{param}", method = RequestMethod.GET)
	public String echo(@PathVariable String param) {
		LOG.info("${artifactId} -- request param: [" + param + "]");
		String result = "request param: " + param + ", response from " + providerNameConfig.getName();
		LOG.info("${artifactId} -- provider config name: [" + providerNameConfig.getName() + ']');
		LOG.info("${artifactId} -- response info: [" + result + "]");
		return result;
	}
}