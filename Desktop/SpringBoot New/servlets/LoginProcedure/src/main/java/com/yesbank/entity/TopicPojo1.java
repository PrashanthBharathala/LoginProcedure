package com.yesbank.entity;

public class TopicPojo1
{

	private int topicCount;
	private int ruleCount;
	private int actionCount;
	private int pendingAuth;
	public int getTopicCount() {
		return topicCount;
	}
	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}
	public int getRuleCount() {
		return ruleCount;
	}
	public void setRuleCount(int ruleCount) {
		this.ruleCount = ruleCount;
	}
	public int getActionCount() {
		return actionCount;
	}
	public void setActionCount(int actionCount) {
		this.actionCount = actionCount;
	}
	public int getPendingAuth() {
		return pendingAuth;
	}
	public void setPendingAuth(int pendingAuth) {
		this.pendingAuth = pendingAuth;
	}
	@Override
	public String toString() {
		return "TopicPojo1 [topicCount=" + topicCount + ", ruleCount=" + ruleCount + ", actionCount=" + actionCount
				+ ", pendingAuth=" + pendingAuth + "]";
	}
	
	
	
}
