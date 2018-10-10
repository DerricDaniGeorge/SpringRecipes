package com.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springrecipes.beans.SequenceGenerator;

@Configuration
public class SequenceGeneratorConfiguration {
	@Bean
	public SequenceGenerator sequenceGenerator() {
		SequenceGenerator seq=new SequenceGenerator();
		seq.setInitial(100000);
		seq.setSuffix("A");
		seq.setPrefix("30");
		return seq;
	}
}
