<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Buku</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
 @charset "ISO-8859-1";

@import url('https://fonts.googleapis.com/css2?family=Quicksand:wght@300&display=swap');

h1,h2,h3,h4,h5,h6,span,small, p,a, button,table{
  font-family: 'Quicksand', sans-serif;
}
#data{
  margin: auto;
  width: 80%;
  padding: 10px;
}

#tambahdata{
	padding:10px;
    text-shadow: 1px 1px 1px #ccc;
    font-size: 1em
}

#tambahdata a {
  background-color: #009933;
  color:white;
  text-decoration:none;
  padding:10px;
}

table {
	width :80%;
	border : border-collapse;
	
}

th, td {
  padding: 15px;
  text-align : center;
}


tr:nth-child(even) {
	background-color: #f2f2f2;
	}
	
#elementID {
    color: #fff;
    text-shadow: 1px 1px 1px #ccc;
    font-size: 1.5em;
}


input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 1px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=number], select {
  width: 50%;
  padding: 12px 20px;
  margin: 1px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  float:left;
}

input[type=submit] {
  width: 10%;
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

#form {
	margin: auto;
  width:80%;
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
#form a {
  background-color: #009933;
  color:white;
  text-decoration:none;
  padding:10px;
}

#tambah a {
  background-color: #0ABEF8;
}

#tambah a:link, a:visited {
  background-color: #0ABEF8;
  color: black;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

#tambah a:hover, a:active {
  background-color: red;
}
</style>
</head>
<body>
<div align="center">
    <h2>LIST BUKU</h2>
   
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    
    <div id=tambah>
    <h3><a href="newbuku">New Buku</a></h3>
    </div>
    <table border="1" cellpadding="5">
        <tr>
            <th>Kode Buku</th>
            <th>Kode Kategori</th>
            <th>Judul</th>
            <th>Harga</th>
            <th>Stok</th>
                 <th>deskripsi</th>
            <th>Aksi</th>
        
        </tr>
        <c:forEach items="${listBuku}" var="buku">
        <tr>
            <td>${buku.kodebuku}</td>
            <td>${buku.kodekategori}</td>
            <td>${buku.namabuku}</td>
            <td>${buku.hargabuku}</td>
            <td>${buku.stok}</td>
             <td>${buku.kategori.deskripsi}</td>
           
            
      
            <td>
                <a href="editbuku?kodebuku=${buku.kodebuku}"><i class="fa fa-pencil-square-o" id="elementID" aria-hidden="true" style="color:blue"></i></a> 
                &nbsp;&nbsp;&nbsp;
                
                <a href="deletebuku?kodebuku=${buku.kodebuku}" onclick="return confirm('Are you sure you want to delete this item?');"><i class="fa fa-trash-o" id="elementID" aria-hidden="true" style="color:red"></i></a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>

<script>

function ConfirmDelete()
{
  var x = confirm("Mau di hapus ?");
  if (x)
      return true;
  else
    return false;
}




</script>   
</body>
</html>