package com.example.demo.steps;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;

import static org.junit.Assert.assertEquals;

public class FixedAmountWithdrawStepdef {

	@假如("^我的账户中有余额\"([^\"]*)\"元$")
	public void 我的账户中有余额_元(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(1000, Double.valueOf(arg1).intValue());
	}
	
	@当("^我选择固定金额取款方式取出\"([^\"]*)\"元$")
	public void 我选择固定金额取款方式取出_元(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(1000, Double.valueOf(arg1).intValue());
	}
	
	@那么("^我应该收到现金\"([^\"]*)\"元$")
	public void 我应该收到现金_元(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(1000, Double.valueOf(arg1).intValue());
	}
	
	@那么("^我账户的余额应该是\"([^\"]*)\"元$")
	public void 我账户的余额应该是_元(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(1000, Double.valueOf(arg1).intValue());
	}

}
