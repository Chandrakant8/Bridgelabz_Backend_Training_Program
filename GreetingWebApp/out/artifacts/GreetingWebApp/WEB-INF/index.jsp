<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Greeting Application</title>

    <style>
        *{
            margin:0;
            padding:0;
            box-sizing:border-box;
            font-family:Segoe UI,Tahoma,Geneva,Verdana,sans-serif;
        }

        body{
            background:linear-gradient(135deg,#4facfe,#00f2fe);
            height:100vh;
            display:flex;
            justify-content:center;
            align-items:center;
        }

        .container{
            width:420px;
            background:#fff;
            padding:40px;
            border-radius:15px;
            box-shadow:0 15px 35px rgba(0,0,0,0.2);
        }

        h1{
            text-align:center;
            color:#2c3e50;
            margin-bottom:10px;
        }

        p{
            text-align:center;
            color:#666;
            margin-bottom:30px;
        }

        label{
            display:block;
            font-weight:600;
            margin-bottom:8px;
            color:#333;
        }

        input[type=text]{
            width:100%;
            padding:12px;
            border:1px solid #ccc;
            border-radius:8px;
            font-size:16px;
            margin-bottom:25px;
            transition:.3s;
        }

        input[type=text]:focus{
            outline:none;
            border-color:#3498db;
            box-shadow:0 0 8px rgba(52,152,219,.3);
        }

        input[type=submit]{
            width:100%;
            padding:13px;
            border:none;
            border-radius:8px;
            background:#3498db;
            color:#fff;
            font-size:16px;
            cursor:pointer;
            transition:.3s;
        }

        input[type=submit]:hover{
            background:#2980b9;
        }
    </style>

</head>

<body>

<div class="container">

    <h1>Greeting Web Application</h1>

    <p>Enter your name to receive a personalized greeting.</p>

    <form action="greet" method="get">

        <label for="name">Your Name</label>

        <input
                type="text"
                id="name"
                name="name"
                placeholder="Enter your name"
                required>

        <input type="submit" value="Generate Greeting">

    </form>

</div>

</body>
</html>