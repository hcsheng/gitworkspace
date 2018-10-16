package com.hcs.templatemethod;

/**
 * 
* @ClassName: Model
* @Description: 模板方法 模式
* @author A18ccms a18ccms_gmail_com
* @date 2018年9月27日 上午6:48:39
* 应用场景：
* 多个子类有公共方法且逻辑基本相同；
* 
* 优点：
* 1、行为由父类控制，子类实现；
* 2、提取公共部分代码；
* 3、封装不变部分，扩展可变部分；
 */
public abstract class Model {
	//基本方法
	protected abstract void doSomeThing();
	//基本方法
	protected abstract void doAnyThing();
	//模板方法
	public final void template() {
		if(this.istrue()) {
			this.doSomeThing();
			
			this.doAnyThing();
		}
	}
	
	//钩子函数
	protected boolean istrue() {
		return true;
	}
}
