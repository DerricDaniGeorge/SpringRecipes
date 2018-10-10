package com.springrecipes.beans;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class SequenceService {
	

	private SequenceDao sequenceDao;
	public void setSequenceDao(SequenceDao sequenceDao) {
		this.sequenceDao=sequenceDao;
	}
	public String generate(String sequenceId) {
		Sequence seq=sequenceDao.getSequence(sequenceId);
		return seq.getPrefix()+sequenceDao.getNextValue(sequenceId)+seq.getSuffix();
	}
}
