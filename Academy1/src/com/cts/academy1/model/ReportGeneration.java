package com.cts.academy1.model;

public class ReportGeneration {

	
	private int faculty_id,batch_id;
	private String feedback;
	private int weekly_report;
	private String bhs_report;
	private int mock_test_report;
	private String innovation_project_report;
	private int weekly_report_earning_point,bhs_report_earning_point,mock_report_earning_point,innovation_report_earning_point;
	public ReportGeneration(int batch_id,int weekly_report_earning_point, int bhs_report_earning_point,
			int mock_report_earning_point, int innovation_report_earning_point) {
		super();
		
		this.batch_id = batch_id;
		this.weekly_report_earning_point = weekly_report_earning_point;
		this.bhs_report_earning_point = bhs_report_earning_point;
		this.mock_report_earning_point = mock_report_earning_point;
		this.innovation_report_earning_point = innovation_report_earning_point;
	}
	public ReportGeneration(int faculty_id, int batch_id, String feedback,
			int weekly_report, String bhs_report, int mock_test_report,String innovation_project_report) {
		super();
		this.faculty_id = faculty_id;
		this.batch_id = batch_id;
		this.feedback = feedback;
		this.weekly_report = weekly_report;
		this.bhs_report = bhs_report;
		this.mock_test_report = mock_test_report;
		/*this.innovation_project_report=innovation_project_report;
		this.weekly_report_earning_point = weekly_report_earning_point;
		this.bhs_report_earning_point = bhs_report_earning_point;
		this.mock_report_earning_point = mock_report_earning_point;
		this.innovation_report_earning_point = innovation_report_earning_point;*/
	}
	public ReportGeneration() {
		
	}
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public int getBatch_id() {
		return batch_id;
	}
	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public int getWeekly_report() {
		return weekly_report;
	}
	public void setWeekly_report(int weekly_report) {
		this.weekly_report = weekly_report;
	}
	public String getBhs_report() {
		return bhs_report;
	}
	public void setBhs_report(String bhs_report) {
		this.bhs_report = bhs_report;
	}
	public int getMock_test_report() {
		return mock_test_report;
	}
	public void setMock_test_report(int mock_test_report) {
		this.mock_test_report = mock_test_report;
	}
	public String getInnovation_project_report() {
		return innovation_project_report;
	}
	public void setInnovation_project_report(String innovation_project_report) {
		this.innovation_project_report = innovation_project_report;
	}
	public int getWeekly_report_earning_point() {
		return weekly_report_earning_point;
	}
	public void setWeekly_report_earning_point(int weekly_report_earning_point) {
		this.weekly_report_earning_point = weekly_report_earning_point;
	}
	public int getBhs_report_earning_point() {
		return bhs_report_earning_point;
	}
	public void setBhs_report_earning_point(int bhs_report_earning_point) {
		this.bhs_report_earning_point = bhs_report_earning_point;
	}
	public int getMock_report_earning_point() {
		return mock_report_earning_point;
	}
	public void setMock_report_earning_point(int mock_report_earning_point) {
		this.mock_report_earning_point = mock_report_earning_point;
	}
	public int getInnovation_report_earning_point() {
		return innovation_report_earning_point;
	}
	public void setInnovation_report_earning_point(
			int innovation_report_earning_point) {
		this.innovation_report_earning_point = innovation_report_earning_point;
	}
	
}
