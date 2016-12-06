<%-- 
    Document   : Login
    Created on : 01/12/2016, 07:10:54 PM
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../../recursos/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-offset-5 col-md-3">

                    <form method="POST" action="inicio" class="center">
                        <div class="form-login">
                            <h4>Login</h4>
                            <input type="text" id="user" class="form-control input-sm chat-input" placeholder="user" />
                            </br>
                            <input type="text" id="pass" class="form-control input-sm chat-input" placeholder="pass" />
                            </br>
                            <div class="wrapper">
                                <input type="submit" name="enviar" class="btn btn-success">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
