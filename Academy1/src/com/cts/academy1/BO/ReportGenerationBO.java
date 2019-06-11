package com.cts.academy1.BO;

import com.cts.academy1.model.ReportGeneration;

public class ReportGenerationBO {
	

	 ReportGeneratiionDAO adao;
		public  ReportGenerationBO(){
			adao=new  ReportGeneratiionDAO();
		}
	
	public void insertReport( ReportGeneration avo) {
		adao.insertReport(avo);
		
	}

	public ReportGeneration getReport(int faculty_id){
		return adao.getReport(faculty_id);
	}
	

}
