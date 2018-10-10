package com.springrecipes.beans;
import  org.springframework.stereotype.Component;
import  java.util.Map;
import java.util.HashMap;


@Component
public class SequenceDaoImpl implements SequenceDao{
	private Map<String,Sequence> sequences;
	private Map<String,Integer> values;
	
	
	public SequenceDaoImpl() {
		sequences=new HashMap<>();
		sequences.put("IT", new Sequence("IT","30","A"));
		values=new HashMap<>();
		values.put("IT", 100000);
		
}
public Sequence getSequence(String sequenceId) {
	return sequences.get(sequenceId);
}

public int getNextValue(String sequenceId) {
	int value=values.get(sequenceId);
	values.put(sequenceId,++value);
	return value;
}

}
