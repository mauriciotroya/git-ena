<%-- 
    Document   : login
    Created on : 24/08/2019, 23:48:28
    Author     : Andres1996
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autenticacion</title>
        <link rel="stylesheet" type="text/css" href="./css/ena.css">
    </head>
    <body>
        <div class="formulario">
            <form action="Autenticacion" method="post">
                <div class="cabecera">
                    Menu Principal!
                </div>
                <div class="input_text">
                    Usuario: <input type="text" name="usuario" placeholder="Usuario" id="usuario"> <br>
                    Password: <input type="password" name="pass" placeholder="Password" id="pass"> 
                </div>
                <div class="checkbox">
                    <Input type="checkbox"> Recordar
                </div>
                <div class="btn_enviar">
                    <input type="submit" name="ingresar" id="ingresar" value="Ingresar" > 
                </div>
                <script language="JavaScript" type="text/javascript">
alert("este texto es el que modificas");
</script>
                        
            </form>
        </div>
    </body>
</html>
