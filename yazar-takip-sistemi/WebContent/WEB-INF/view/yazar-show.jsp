<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head><title>Yazar Listesi</title>
<link type="text/css" 
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/style.css "/>
</head>
<body>

         <!-- baslik kismi buraya yazilir -->
         <div id="wrapper">
         		<div id=header">
         			<h2>YAZARLAR LİSTESİNE HOŞ GELDİNİZ</h2>
         		</div>
         </div>
         
         <!-- yeni yazar ekleme butonu -->
        <div id="content">
        	<input type="button" value="Yeni Yazar ekle"
        						 onclick="window.location.href='yazarekle'"
        						 class="add-button">
        
        <!-- tablo yaratma -->
        
        <table>
        	<tr>
        		<th>Yazar Adi</th>
        		<th>Yazar Soyadı</th>
        		<th>Kitap Adi</th>
        		<th>İşlem Yap</th>
        	</tr>
        	
        	<!-- degerler aliniyor -->
        	<c:forEach var="tempdeger" items="${yazarlar}">
        	
        	<!-- kitap bilgileri sayfasına gidiyorum -->
       		<c:url var="kitaplink" value="/yazar/kitapbilgi">
       		    <c:param name="kitapid" value="${tempdeger.kitapbilgi.id }"></c:param>  <!-- parametre gonderiyorum -->
       		</c:url>
       		
       		<!-- kitap yazar güncellemeye gidiyorum -->
       		<c:url var="updatelink" value="/yazar/showFormForUpdate">
       		    <c:param name="yazarid" value="${tempdeger.id }"></c:param>  <!-- parametre gonderiyorum -->
       		</c:url>
       		
       		<!-- silme kismni yapiyorum burda -->
       		<c:url var="deletelink" value="/yazar/delete">
       		    <c:param name="yazarid" value="${tempdeger.id }"></c:param>  <!-- parametre gonderiyorum -->
       		</c:url>
        	
        	<tr>
        		<td>${tempdeger.yazarAdi}</td>
        		<td>${tempdeger.yazarSoyadi}</td>
        		<td><a href="${kitaplink}">${tempdeger.kitapAdi}</a></td>
        		<td><a href="${updatelink}">Düzenle</a>  |  <a href="${deletelink}" onclick="if(!(confirm('Bu yazar silinsinmi..'))) return false">Sil</a></td>
        	</tr>
        	</c:forEach>
        </table>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        </div>
         
         
         
         
         
         

</body>

</html>