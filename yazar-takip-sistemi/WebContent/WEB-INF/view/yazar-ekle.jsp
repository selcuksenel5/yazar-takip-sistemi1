<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head><title>Yeni Yazar Ekle</title>
<link type="text/css" rel="stylesheet" href="${ pageContext.request.contextPath}/resources/style.css">
<link type="text/css" rel="stylesheet" href="${ pageContext.request.contextPath}/resources/add-customer-style.css">
</head>
<body>

		<div id="wrapper">
				<div id="header">
						<h2>Yazar Takip Sistemi</h2>
						</div>
				</div>

<div id="container">
<h3>Yazar Kaydet </h3> 
<form:form action="yazarkaydetaction" modelAttribute="yazarbilgi" method="post">
		<table>
			<tbody>
			
				<tr>
					<td><label>Yazar Adi</label></td>
					<td><form:input path="yazarAdi"/></td>
				</tr>
				
				<tr>
					<td><label>Yazar Soyadi</label></td>
					<td><form:input path="yazarSoyadi"/></td>
				</tr>
				
				<tr>
					<td><label>Kitap Adi</label></td>
					<td><form:input path="kitapAdi"/></td>
				</tr>
				
				<tr>
					<td><label>Kitap Sayfası</label></td>
					<td><form:input path="kitapbilgi.kitapsayfa"/></td>
				</tr>
				
				<tr>
					<td><label>Kitap Basım Yılı</label></td>
					<td><form:input path="kitapbilgi.kitapbasimyili"/></td>
				</tr>
				
				<tr>
					<td><label>Kitap Özeti</label></td>
					<td><form:input path="kitapbilgi.kitapozeti"/></td>
				</tr>
				
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Kaydet"/></td>
				</tr>
			
			</tbody>
		</table>
</form:form>




</div>

<div style="clear; both;"></div>
		<p> <a href="${pageContext.request.contextPath }/yazar/list"> Geri Dön </a> </p>

</body>
</html>