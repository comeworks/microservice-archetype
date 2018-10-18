#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId}.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix = "provider.config")
public class ProviderNameConfig {
	private String name = "echo-provider-default-name";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}