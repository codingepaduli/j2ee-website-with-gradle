<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="it">
	<head>
		<meta charset="UTF-8">
        <title>Calcolatrice</title>
	</head>
	<body>
		<h1>Calcolatrice</h1>
		
		<form method="post" action="calcolatrice">
            Inserisci il primo numero:
            <input type=text name="num1">
    
            Inserisci il secondo numero:
            <input type=text name="num2">

			Seleziona il formato per l'output che desideri:
			<select name="formato">
				<option value="XML">XML</option>
				<option value="JSON">JSON</option>
				<option value="HTML" selected>HTML</option>
			</select>

			<input type="submit" value="Invia">
		<form>
	</body>
</html>
