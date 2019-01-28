<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Dodaj pojazd do parkingu</h1>
       <form:form method="post" action="save">  
      	<table >
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
          <td> </td>  
          <td><input type="submit" value="Zapisz" /></td>  
         </tr>  
        </table>  
       </form:form>  
