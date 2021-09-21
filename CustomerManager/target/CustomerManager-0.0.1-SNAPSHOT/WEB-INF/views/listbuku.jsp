<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Buku</title>
</head>
<body>
<div align="center">
    <h2>LIST BUKU</h2>
    
    <h3><a href="new">New Buku</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>Kode Buku</th>
            <th>Kode Kategori</th>
            <th>Judul</th>
            <th>Harga</th>
            <th>Stok</th>
        </tr>
        <c:forEach items="${listBuku}" var="buku">
        <tr>
            <td>${buku.kodebuku}</td>
            <td>${buku.kodekategori}</td>
            <td>${buku.namabuku}</td>
            <td>${buku.hargabuku}</td>
            <td>${buku.stok}</td>
            <td>
                <a href="edit?kodebuku=${buku.kodebuku}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="delete?kodebuku=${buku.kodebuku}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>