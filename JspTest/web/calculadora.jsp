<!DOCTYPE html>
<html>
<head>
    <title>Calculadora Básica</title>
</head>
<body>
    <h1>Calculadora Básica</h1>
    
    <form action="resultado.jsp" method="GET">
        <label for="num1">Número 1:</label>
        <input type="number" id="num1" name="num1" required><br>
        
        <label for="num2">Número 2:</label>
        <input type="number" id="num2" name="num2" required><br>
        
        <input type="radio" id="operacaoSoma" name="operacao" value="soma" required>
        <label for="operacaoSoma">Soma</label>
        
        <input type="radio" id="operacaoSubtracao" name="operacao" value="subtracao" required>
        <label for="operacaoSubtracao">Subtração</label>
        
        <button type="submit">Calcular</button>
    </form>
</body>
</html>
