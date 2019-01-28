    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Lista pojazdow na parkingu</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Imie i nazwisko</th><th>Marka pojazdu</th><th>Model pojazdu</th><th>Numer rejestracyjny</th><th>Edycja</th><th>Usuwanie</th></tr>
    <c:forEach var="parkingSpace" items="${parkingSpaceList}"> 
    <tr>
    <td>${parkingSpace.id}</td>
    <td>${parkingSpace.ownerName}</td>
    <td>${parkingSpace.carBrand}</td>
    <td>${parkingSpace.carModel}</td>
    <td>${parkingSpace.registrationNumber}</td>
    <td><a href="edit/${parkingSpace.id}">Edytuj pojazd</a></td>
    <td><a href="delete/${parkingSpace.id}">Usun pojazd</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="add">Dodaj pojazd do parkingu</a>