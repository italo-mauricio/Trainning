<!DOCTYPE html>
<html>
<head>
    <title>Calculadora B�sica</title>
</head>
<body>
    <h1>Calculadora B�sica</h1>
    
    <form action="resultado.jsp" method="GET">
        <label for="num1">N�mero 1:</label>
        <input type="number" id="num1" name="num1" required><br>
        
        <label for="num2">N�mero 2:</label>
        <input type="number" id="num2" name="num2" required><br>
        
        <input type="radio" id="operacaoSoma" name="operacao" value="soma" required>
        <label for="operacaoSoma">Soma</label>
        
        <input type="radio" id="operacaoSubtracao" name="operacao" value="subtracao" required>
        <label for="operacaoSubtracao">Subtra��o</label>
        
        <button type="submit">Calcular</button>
    </form>
</body>
</html>
