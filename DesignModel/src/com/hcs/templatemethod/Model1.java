package com.hcs.templatemethod;

public class Model1 extends Model{
	
	private Boolean flag;

	@Override
	protected void doSomeThing() {
		System.out.println(" model1 does something ");
	}

	@Override
	protected void doAnyThing() {
		System.out.println(" model1 does anything ");
	}
	
	protected boolean istrue() {
		return this.flag;
	}
	
	public void setTrue(boolean isTrue){
		this.flag = isTrue;
	}
}
