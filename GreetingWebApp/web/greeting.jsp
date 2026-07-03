<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Greeting Result</title>

    <style>

        *{
            margin:0;
            padding:0;
            box-sizing:border-box;
            font-family:Segoe UI, Tahoma, Geneva, Verdana, sans-serif;
        }

        body{
            background:linear-gradient(135deg,#4facfe,#00f2fe);
            height:100vh;
            display:flex;
            justify-content:center;
            align-items:center;
        }

        .container{
            width:500px;
            background:#fff;
            padding:40px;
            border-radius:12px;
            text-align:center;
            box-shadow:0 10px 25px rgba(0,0,0,0.2);
        }

        h1{
            color:#2c3e50;
            margin-bottom:25px;
        }

        .message-box{
            background:#f8f9fa;
            border-left:6px solid #3498db;
            border:1px solid #ddd;
            border-radius:8px;
            padding:20px;
            font-size:22px;
            color:#2c3e50;
            margin-bottom:30px;
        }

        .back-btn{
            display:inline-block;
            padding:12px 30px;
            background:#3498db;
            color:#fff;
            text-decoration:none;
            border-radius:6px;
            font-size:16px;
            font-weight:bold;
            transition:0.3s;
        }

        .back-btn:hover{
            background:#2980b9;
        }

    </style>

</head>

<body>

<div class="container">

    <h1>Greeting Message</h1>

    <div class="message-box">
        ${greeting.message}
    </div>

    <a href="index.jsp" class="back-btn">← Back to Home</a>

</div>

</body>
</html>