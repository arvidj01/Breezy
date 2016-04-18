package com.windhaven_consulting.breezy.component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.windhaven_consulting.breezy.embeddedcontroller.DigitalOutputPin;

public abstract class Component implements Comparable<Component>, Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	
	private String id;
	
	private List<DigitalOutputPin> outputPins = new ArrayList<DigitalOutputPin>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addOutputPin(DigitalOutputPin pin) {
		outputPins.add(pin);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<DigitalOutputPin> getOutputPins() {
		return outputPins;
	}
	
	protected DigitalOutputPin getOutputPin(int index) {
		return outputPins.get(index);
	}
	
	protected DigitalOutputPin getOutputPin() {
		return outputPins.get(0);
	}

	@Override
	public int compareTo(Component o) {
		return this.name.compareTo(o.getName());
	}

	public abstract void test();
}
