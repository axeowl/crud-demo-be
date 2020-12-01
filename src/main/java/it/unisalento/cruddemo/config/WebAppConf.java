package it.unisalento.cruddemo.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebAppConf {

	@Bean
	@Qualifier
	public ModelMapper modelMapper() {
		ModelMapper m = new ModelMapper();
		m.getConfiguration().setAmbiguityIgnored(true);
		//m.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return m;
	}
}
