package com.springrecipes.beans;

public interface SequenceDao {
public  Sequence getSequence(String sequencId);
public int getNextValue(String sequenceId);
}
