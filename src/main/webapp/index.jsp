 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nhóm 2 Bài tập 1</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h1>Tính chỉ số BMI</h1>

        <form method="post" action="check">
            <div class="form-group">
                
                <label for="weight">Nhập cân nặng: </label><br>
                <input class="form-control" type="number" step ="0.01" id="weight" name="weight"><br>
            </div> 
            <div class="form-group">

                <label for="height">Nhập chiều cao:</label><br>
                <input class="form-control" type="number" step ="0.01" id="height" name="height"><br><br>
            </div>    
          <input class="btn btn-primary" type="submit" value="Submit">
        </form>
    </div>
</body>
</html>