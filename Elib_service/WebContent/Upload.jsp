<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload to Database Demo</title>
</head>
<body>
    <center>
        <h1>File Upload to Database Demo</h1>
        <form method="post" action="uploadServlet" enctype="multipart/form-data">
            <table border="0">
                <tr>
                    <td>File Name: </td>
                    <td><input type="text" name="fileName" size="50"/></td>
                </tr>
                <tr>
                    <td>Description: </td>
                    <td><input type="text" name="description" size="50"/></td>
                </tr>
                <tr>
                 <tr>
                    <td>Author: </td>
                    <td><input type="text" name="author" size="50"/></td>
                </tr>
                 <tr>
                    <td>Date: </td>
                    <td><input type="text" name="date" size="50"/></td>
                </tr>
                    <td>File: </td>
                    <td><input type="file" name="file" size="50"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Save">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>