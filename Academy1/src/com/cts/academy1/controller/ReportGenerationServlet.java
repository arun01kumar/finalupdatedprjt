package com.cts.academy1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.academy1.BO.ReportGeneratiionDAO;
import com.cts.academy1.BO.ReportGenerationBO;
import com.cts.academy1.model.ReportGeneration;

/**
 * Servlet implementation class ReportGenerationServlet
 */
@WebServlet("/ReportGenerationServlet")
public class ReportGenerationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportGenerationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	       
	        //int n=Integer.parseInt(request.getParameter("AdminId"));  
	        int fid=Integer.parseInt(request.getParameter("fid"));  
	        System.out.println(fid);
	        int bid=Integer.parseInt(request.getParameter("bid"));
	        String feedback=request.getParameter("feedback");
	        int wr=Integer.parseInt(request.getParameter("wr"));
	        String bhs=request.getParameter("bhs");
	        int mtr=Integer.parseInt(request.getParameter("mtr"));
	        String ipr=request.getParameter("ipr");  
	       /* int wrep=Integer.parseInt(request.getParameter("wrep"));  
	        int brp=Integer.parseInt(request.getParameter("brp"));
	        int mockep=Integer.parseInt(request.getParameter("mockep"));
	        int ipep=Integer.parseInt(request.getParameter("ipep"));*/
	        ReportGenerationBO abo=new   ReportGenerationBO();
	        ReportGeneration avo=new   ReportGeneration(fid,bid,feedback,wr,bhs,mtr,ipr);
	         avo.setFaculty_id(fid);
	         System.out.println(fid);
	         avo.setBatch_id(bid);
	         System.out.println(bid);
	         avo.setFeedback(feedback);
	         avo.setWeekly_report(wr);
	         avo.setBhs_report(bhs);
	         avo.setMock_test_report(mtr);
	         avo.setInnovation_project_report(ipr);
	         /*avo.setWeekly_report_earning_point(wrep);
	         avo.setBhs_report_earning_point(brp);
	         avo.setMock_report_earning_point(mockep);
	         avo.setInnovation_report_earning_point(ipep);*/
	         ReportGeneratiionDAO adao=new ReportGeneratiionDAO();
	         abo.insertReport(avo); 
	         
	            RequestDispatcher rd=request.getRequestDispatcher("faculty_rep.jsp");
	            rd.forward(request, response);
	         }
		
		
			
		
		
		
	}


