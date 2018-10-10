package com.annotation.config;
import org.springframework.context.annotation.Configuration;

import com.springrecipes.beans.SequenceDaoImpl;
import com.springrecipes.beans.SequenceService;

import org.springframework.context.annotation.Bean;

@Configuration
public class SequenceConfig {
	@Bean
	public SequenceDaoImpl sequenceDaoImpl() {
		return new SequenceDaoImpl();
	}
	@Bean
	public SequenceService sequenceService() {
		SequenceService seq=new SequenceService();
		seq.setSequenceDao(sequenceDaoImpl());
		return seq;
	}
}
