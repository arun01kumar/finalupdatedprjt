<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculty Report Management</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style type="text/css">
    body {
        color: #566787;
		background: #f5f5f5;
		font-family: 'Varela Round', sans-serif;
		font-size: 13px;
	}
	a:link, a:visited {
   margin:5px 10px;
  //text-align: center;
  //text-decoration: none;
  //display: inline-block;
}
	
	.table-wrapper {
        background: #fff;
        padding: 20px 25px;
        margin: 30px 10px;
		border-radius: 3px;
        box-shadow: 0 1px 1px rgba(0,0,0,.05);
    }
	.table-title {        
		padding-bottom: 15px;
		background: #435d7d;
		color: #fff;
		padding: 16px 30px;
		margin: -20px -25px 10px;
		border-radius: 3px 3px 0 0;
    }
    .table-title h2 {
		margin: 5px 0 0;
		font-size: 24px;
	}
	.table-title .btn-group {
		float: right;
	}
	.table-title .btn {
		color: #fff;
	
		font-size: 13px;
		border: none;
		min-width: 10px;
		border-radius: 2px;
		border: none;
		outline: none !important;
		margin: 15px 15px;
	}
	.table-title .btn i {
		float: left;
		font-size: 21px;
		margin-right: 5px;
	}
	.table-title .btn span {
		float: left;
		margin-top: 2px;
	}
    table.table tr th, table.table tr td {
        border-color: #e9e9e9;
		padding: 12px 15px;
		vertical-align: middle;
    }
	table.table tr th:first-child {
		width: 60px;
	}
	table.table tr th:last-child {
		width: 100px;
	}
    table.table-striped tbody tr:nth-of-type(odd) {
    	background-color: #fcfcfc;
	}
	table.table-striped.table-hover tbody tr:hover {
		background: #f5f5f5;
	}
    table.table th i {
        font-size: 13px;
        margin: 0 5px;
        cursor: pointer;
    }	
    table.table td:last-child i {
		opacity: 0.9;
		font-size: 22px;
        margin: 0 5px;
    }
	table.table td a {
		font-weight: bold;
		color: #566787;
		display: inline-block;
		text-decoration: none;
		outline: none !important;
	}
	table.table td a:hover {
		color: #2196F3;
	}
	table.table td a.edit {
        color: #FFC107;
    }
    table.table td a.delete {
        color: #F44336;
    }
    table.table td i {
        font-size: 19px;
    }
	table.table .avatar {
		border-radius: 50%;
		vertical-align: middle;
		margin-right: 10px;
	}
    .pagination {
        float: right;
        margin: 0 0 5px;
    }
    .pagination li a {
        border: none;
        font-size: 13px;
        min-width: 30px;
        min-height: 30px;
        color: #999;
        margin: 0 2px;
        line-height: 30px;
        border-radius: 2px !important;
        text-align: center;
        padding: 0 6px;
    }
    .pagination li a:hover {
        color: #666;
    }	
    .pagination li.active a, .pagination li.active a.page-link {
        background: #03A9F4;
    }
    .pagination li.active a:hover {        
        background: #0397d6;
    }
	.pagination li.disabled i {
        color: #ccc;
    }
    .pagination li i {
        font-size: 16px;
        padding-top: 6px
    }
    .hint-text {
        float: left;
        margin-top: 10px;
        font-size: 13px;
    }    
	/* Custom checkbox */
	.custom-checkbox {
		position: relative;
	}
	.custom-checkbox input[type="checkbox"] {    
		opacity: 0;
		position: absolute;
		margin: 5px 0 0 3px;
		z-index: 9;
	}
	.custom-checkbox label:before{
		width: 18px;
		height: 18px;
	}
	.custom-checkbox label:before {
		content: '';
		margin-right: 10px;
		display: inline-block;
		vertical-align: text-top;
		background: white;
		border: 1px solid #bbb;
		border-radius: 2px;
		box-sizing: border-box;
		z-index: 2;
	}
	.custom-checkbox input[type="checkbox"]:checked + label:after {
		content: '';
		position: absolute;
		left: 6px;
		top: 3px;
		width: 6px;
		height: 11px;
		border: solid #000;
		border-width: 0 3px 3px 0;
		transform: inherit;
		z-index: 3;
		transform: rotateZ(45deg);
	}
	.custom-checkbox input[type="checkbox"]:checked + label:before {
		border-color: #03A9F4;
		background: #03A9F4;
	}
	.custom-checkbox input[type="checkbox"]:checked + label:after {
		border-color: #fff;
	}
	.custom-checkbox input[type="checkbox"]:disabled + label:before {
		color: #b8b8b8;
		cursor: auto;
		box-shadow: none;
		background: #ddd;
	}
	/* Modal styles */
	.modal .modal-dialog {
		max-width: 400px;
	}
	.modal .modal-header, .modal .modal-body, .modal .modal-footer {
		padding: 20px 30px;
	}
	.modal .modal-content {
		border-radius: 3px;
	}
	.modal .modal-footer {
		background: #ecf0f1;
		border-radius: 0 0 3px 3px;
	}
    .modal .modal-title {
        display: inline-block;
    }
	.modal .form-control {
		border-radius: 2px;
		box-shadow: none;
		border-color: #dddddd;
	}
	.modal textarea.form-control {
		resize: vertical;
	}
	.modal .btn {
		border-radius: 2px;
		min-width: 100px;
	}	
	.modal form label {
		font-weight: normal;
	}	
	ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #435d7d;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #fff;
}
a
{

margin-left:250px;
font-size:15px;
text-decoration:none;
font-style:bold;
}
</style>


<body>
<ul>
  <li><a class="active" href="module_reg.jsp">Module Registration</a></li>
  <li><a href="batch.jsp">Batch</a></li>
  <li><a href="faculty_rep.jsp">Report Management</a></li>
 <li><a href="Login.jsp">Logout</a></li>
</ul>
<div class="container">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
						<h2><b>Details</b></h2>
					</div>
					
                </div>
            </div>
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
						
                        <th>Faculty ID</th>
                        <th>Faculty Name</th>
						
                       
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                  
						
                       <c:forEach items="${rvo}" var="regvo">
                        <tr>
						
                       
                              <td>${regvo.associate_id}<input type="hidden" value="${regvo.associate_id}" id="b1"></td>
                                <td>${regvo.first_name}<input type="hidden" value="${regvo.first_name}" id="b2"></td>
                                 

                                 
                    

                                 
                                

                                 
						<td><a href="#editReport" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add Report</span></a>
						
													
					</td></tr>
                        </c:forEach> 
                </tbody>
            </table>
			
        </div>
    </div>
<!-- Edit Modal HTML -->
       <div id="editReport" class="modal fade">
              <div class="modal-dialog">
                     <div class="modal-content">
                      
                           <form action="Adminreportser" method="post">
                                  <div class="modal-header">                                  
                                         <h4 class="modal-title">Edit Report</h4>
                                         <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                  </div>
                                  <div class="modal-body">   
                                  
                                     
                                                                    
                                          <div class="form-group">
                                                <label>Faculty ID</label>
                                                <input type="text" name="fid" id="bid1" class="form-control" required>
                                         </div>
                                         
                                         <div class="form-group">
                                                <label>Batch ID</label>
                                                <input type="text" name="bid"  id="statdt1" class="form-control" required>
                                         </div>
                                         <div class="form-group">
                                                <label>Feedback</label>
                                                <input type="text" name="feedback" id="enddt1"  class="form-control" required>
                                         </div>
                                          <div class="form-group">
                                                <label>Weekly Report</label>
                                                <select class="form-control" name="wr">
                 <option value="0" class="form-control" >0</option>
				 <option value="1" class="form-control" >1</option>
  <option value="2" class="form-control">2</option>
  <option value="3" class="form-control">3</option>
  <option value="4" class="form-control">4</option>
 
</select>
                                               
                                         </div>
                                         <div class="form-group">
                                                <label>BHS Report</label>
                                                <select class="form-control" name="bhs" required>
                                                <option value="completed" class="form-control">Completed</option>
     	 <option value="Not Completed" class="form-control"> Not Completed</option>
     	 </select>
                                         </div>
                                         
                                         <div class="form-group">
                                                <label>Mock Test Report</label>
                                                 <select class="form-control" name="mtr" required>
                                                <option value="0" >0</option>
     	 <option value="1"> 1</option>
     	 <option value="2"> 2</option>
     	 <option value="3">3</option>
     	 </select>
                                         </div>
                                         <div class="form-group">
                                                <label>Innovation Project Report</label>
                                                <select class="form-control" name="ipr" required>
                                                <option value="No" >No</option>
     	 <option value="Yes">Yes,Not Completed</option>
     	  <option value="yes">Yes,Completed</option>
     	  </select>
                                         </div>
                                          
                                  </div>
                                  <div class="modal-footer">
                                         <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                       <input type="hidden" name="flg" value="Save">
                                         <input type="submit" class="btn btn-info" value="Save">
                                  </div>
                           </form>
                          
                     </div>
              </div>
       </div>
</body>
</html>
</body>
</html>