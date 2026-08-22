<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>ITI Admission API Docs</title>
    <link rel="shortcut icon" type="image/ico" href="${pageContext.request.contextPath}/iti.png" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/expe1011.css" />
    <style>
        .page-header {
            background-color: #000000;
            color: #FFFFCC;
            padding: 15px 20px;
            text-align: center;
            font-family: "book antiqua", "times new roman", times;
        }
        .page-header h1 {
            color: #FFFFCC;
            margin: 0;
            font-size: 24px;
        }
        .page-header p {
            margin: 5px 0 0 0;
            font-size: 14px;
            color: #CCCCCC;
        }
        .swagger-frame {
            width: 100%;
            height: 700px;
            border: 1px solid #CCCCCC;
            margin: 15px 0;
        }
    </style>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
</head>
<body>
    <div class="page-header">
        <h1>ITI Admission API Documentation</h1>
        <p>Interactive Swagger UI embedded as an application page</p>
    </div>
    <div class="content">
        <div class="alert">
            <strong>Note:</strong> If the Swagger UI does not appear, open <a href="${pageContext.request.contextPath}/swagger-ui.html">/swagger-ui.html</a> directly.
        </div>
        <div class="swagger-frame">
            <iframe src="${pageContext.request.contextPath}/swagger" width="100%" height="100%" frameborder="0"></iframe>
        </div>
    </div>
</body>
</html>