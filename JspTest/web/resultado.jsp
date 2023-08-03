<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
</head>
<body>
    <h1>Resultado</h1>
    <%
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operacao = request.getParameter("operacao");
        int resultado = 0;

        if ("soma".equals(operacao)) {
            resultado = num1 + num2;
        } else if ("subtracao".equals(operacao)) {
            resultado = num1 - num2;
        }
    %>
    <p>O resultado da operação é: <%= resultado %></p>
</body>
</html>
