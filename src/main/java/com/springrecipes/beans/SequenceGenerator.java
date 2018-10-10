package com.springrecipes.beans;
import java.beans.ConstructorProperties;

public class SequenceGenerator {
	private String prefix,suffix;
	private int initial,counter;
	private PrefixGenerator prefixGenerator;
	
	public SequenceGenerator() {}
	public SequenceGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator=prefixGenerator;
	}
	@ConstructorProperties({"prefix","suffix","initial"})
	public SequenceGenerator(String prefix,String suffix,int initial) {
		this.prefix=prefix;
		this.suffix=suffix;
		this.initial=initial;
	}
	@ConstructorProperties({"prefix","suffix"})
	public SequenceGenerator(String prefix,String suffix) {
		this.prefix=prefix;
		this.suffix=suffix;
	}
	@ConstructorProperties({"prefix","initial"})
	public SequenceGenerator(String prefix,int initial) {
		this.prefix=prefix;
		this.initial=initial;
	}
	@ConstructorProperties({"initial","suffix"})
	public SequenceGenerator(int initial,String suffix) {
		this.initial=initial;
		this.suffix=suffix;
	}
	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator=prefixGenerator;
	}
	public void setSuffix(String suffix) {
		this.suffix=suffix;
	}
	public void setInitial(int initial) {
		this.initial=initial;
	}
	public void setPrefix(String prefix) {
		this.prefix=prefix;
	}
	public synchronized String getSequence() {
		StringBuffer buffer=new StringBuffer();
		buffer.append(prefixGenerator.getPrefix());
		buffer.append(initial+counter++);
		buffer.append(suffix);
		return buffer.toString();
	}
}
