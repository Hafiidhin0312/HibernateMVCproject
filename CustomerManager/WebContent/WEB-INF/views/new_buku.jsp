<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}


</style>
</head>
<body>
    <div align="center">
        <h2>New Buku</h2>
        <form:form action="savebuku" method="post" modelAttribute="buku">
            <table border="0" cellpadding="5">
            
                           
                <tr>
                    <td>Kode Buku: </td>
                    <td><form:input path="kodebuku" /></td>
                </tr>
               
                <tr>
                    <td>Nama Buku: </td>
                    <td><form:input path="namabuku" /></td>
                </tr>
                <tr>
                
                  <tr>
                    <td>Kategori Buku: </td>
					<td><form:select path="kodekategori">  
			        <form:option value="FIK" label="Fiksi"/>  
			        <form:option value="FST" label="Filsafat"/>  
			        <form:option value="KOM" label="Komputer"/>  
			        <form:option value="NVL" label="Novel"/>  
			        <form:option value="SAI" label="Sains"/>  
			        </form:select></td>
               
                </tr>
                <tr>
                    <td>Harga Buku: </td>
                    <td><form:input path="hargabuku" /></td>       
                </tr> 
                
                    <tr>
                    <td>Stok: </td>
                    <td><form:input path="stok" /></td>
                </tr>   
                
                   
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
        
        <a href="listbuku"></i>BACK TO LIST</a>
    </div>
</body>
</html>