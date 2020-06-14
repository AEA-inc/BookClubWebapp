<%--
  Created by IntelliJ IDEA.
  User: KB
  Date: 6/13/2020
  Time: 7:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>AddBook</title>
</head>
<body>
<div class="container">
    <header> Addbook</header>
</div>
<div  class="container">
<form>
    <div class="form-group">
        <label for="Ttl">Book Title</label>
        <input name="book_title" type="Title" class="form-control" id="Ttl"placeholder="Title">
    </div>
    <div class="form-group">
        <label for="Aut">Author</label>
        <input type="Author" class="form-control" id="Aut" placeholder="Auther">
    </div>
    <div class="form-group">
    <label for="prc">Price</label>
    <input type="password" class="form-control" id="prc">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
    </div>





<div class="container">

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Book ID</th>
            <th>Book Title</th>
            <th>Author</th>
            <th>Price</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>John</td>
            <td>Doe</td>
            <td>john@example.com</td>
            <td>ssss</td>
        </tr>
        <tr>
            <td>Mary</td>
            <td>Moe</td>
            <td>mary@example.com</td>
        </tr>
        <tr>
            <td>July</td>
            <td>Dooley</td>
            <td>july@example.com</td>
        </tr>
        <tr>
            <td>John</td>
            <td>Doe</td>
            <td>john@example.com</td>
            <td>ssss</td>
        </tr>
        </tbody>
    </table>
    </div>
</div>
</body>
</html>
