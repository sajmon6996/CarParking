<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edytowanie pojazdu</h1>
<form:form method="POST" action="/CarParking/editsave">
	<table>
		<tr>
			<td></td>
			<td><form:hidden path="id" /></td>
		</tr>
		<tr>
			<td>Imie i nazwisko :</td>
			<td><form:input path="ownerName" /></td>
		</tr>
		<tr>
			<td>Marka pojazdu :</td>
			<td><form:input path="carBrand" /></td>
		</tr>
		<tr>
			<td>Model pojazdu :</td>
			<td><form:input path="carModel" /></td>
		</tr>
		<tr>
			<td>Numer rejestracyjny :</td>
			<td><form:input path="registrationNumber" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Zapisz zmiany" /></td>
		</tr>
	</table>
</form:form>
