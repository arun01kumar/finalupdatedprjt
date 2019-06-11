package com.cts.academy1.BO;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cts.academy1.configure.MyConnection;
import com.cts.academy1.model.ReportGeneration;
public class ReportGeneratiionDAO {
	Connection con=MyConnection.getConnection();
	public ReportGeneration getReport(int faculty_id){
		ReportGeneration avo=new ReportGeneration();
		String str="select batch_id,weekly_report_earning_point,bhs_report_earning_point,mock_report_earning_point,innovation_report_earning_point from report_management where faculty_id=?";
		try {
			PreparedStatement ps=con.prepareStatement(str);
			ps.setInt(1,faculty_id);
		      ResultSet rs=ps.executeQuery();
		      
		      while(rs.next())
		      {
		                   avo=new ReportGeneration(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5));
		                 
		      }
		     
			}
			
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return avo;
	}
	public void insertReport(ReportGeneration avo){
		
		 try
         {
                int week_earn = 0,bhs_earn=0,mock_earn=0,ip_earn=0;
              
   
                if(avo.getWeekly_report()==0)
                {
                	week_earn=0;
              	  avo.setWeekly_report_earning_point(week_earn);
                }
                else if(avo.getWeekly_report()==1||avo.getWeekly_report()==2)
                {
              	  week_earn=5;
              	avo.setWeekly_report_earning_point(week_earn);
                }
                else if(avo.getWeekly_report()==3||avo.getWeekly_report()==4)
                {
              	  week_earn=4;
              	avo.setWeekly_report_earning_point(week_earn);
                }   
                if(avo.getBhs_report().equals("completed"))
                {
              	  bhs_earn=5;
              	  avo.setBhs_report_earning_point(bhs_earn);
                }
                else  if(avo.getBhs_report().equals("Not completed"))
                {
                	  bhs_earn=0;
                	  avo.setBhs_report_earning_point(bhs_earn);
                  }
                if(avo.getMock_test_report()==0)
                {
              	  mock_earn=0;
              	  avo.setMock_report_earning_point(mock_earn);
                }
                else if(avo.getMock_test_report()==1)
                {
                	  mock_earn=5;
                	  avo.setMock_report_earning_point(mock_earn);
                  }
                else if(avo.getMock_test_report()==2)
                {
                	  mock_earn=8;
                	  avo.setMock_report_earning_point(mock_earn);
                  }
                else if(avo.getMock_test_report()==3)
                {
                	  mock_earn=10;
                	  avo.setMock_report_earning_point(mock_earn);
                  }
                if(avo.getInnovation_project_report().equals("No"))
                {
              	  ip_earn=0;
              	  avo.setInnovation_report_earning_point(ip_earn);
                }
                else  if(avo.getInnovation_project_report().equals("Yes"))
                {
                	  ip_earn=2;
                	  avo.setInnovation_report_earning_point(ip_earn);
                  }
                else  if(avo.getInnovation_project_report().equals("yes"))
                {
                	  ip_earn=5;
                	  avo.setInnovation_report_earning_point(ip_earn);
                  }
                Connection con=MyConnection.getConnection();
                PreparedStatement ps=con.prepareStatement("insert into report_management(faculty_id,batch_id,feedback,weekly_report,bhs_report,mock_test_report,innovation_project_report,weekly_report_earning_point,bhs_report_earning_point,mock_report_earning_point,innovation_report_earning_point) values(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setInt(1,avo.getFaculty_id());
                ps.setInt(2,avo.getBatch_id());
                ps.setString(3,avo.getFeedback());
                ps.setInt(4,avo.getWeekly_report());
                ps.setString(5,avo.getBhs_report());
                ps.setInt(6,avo.getMock_test_report());
                ps.setString(7,avo.getInnovation_project_report());
                ps.setInt(8,avo.getWeekly_report_earning_point());
                ps.setInt(9,avo.getBhs_report_earning_point());
                ps.setInt(10,avo.getMock_report_earning_point());
                ps.setInt(11,avo.getInnovation_report_earning_point());
                ps.execute();
                

         }
         catch(Exception e)
         {
                System.out.println(e);
                
         }
  }
	
}