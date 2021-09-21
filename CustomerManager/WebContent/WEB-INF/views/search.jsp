<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Result</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>Kode Buku</th>
            <th>Nama Buku</th>
            <th>Kode Kategori</th>
            <th>Harga</th>
              <th>Stok</th>
        </tr>
        <c:forEach items="${result}" var="buku">
        <tr>
            <td>${buku.kodebuku}</td>
            <td>${buku.namabuku}</td>
            <td>${buku.kodekategori}</td>
            <td>${buku.hargabuku}</td>
            <td>${buku.stok}</td>
        </tr>
        </c:forEach>
    </table>
    
     <a href="listbuku"></i>BACK TO LIST</a>
</div>   
</body>
</html>