<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head><title>Kitap Bilgi Listesi</title>
<link type="text/css" 
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/style.css "/>
</head>
<body>

<!-- baslik kismi buraya yazilir -->
         <div id="wrapper">
         		<div id=header">
         			<h2>KİTAP HAKKINDA BİLGİ</h2>
         		</div>
         </div>

         <table>
         <tr>
         	<th>Kitap Sayfa Sayısı</th>
         	<th>Kitap Basım Yılı</th>
         	<th>Kitap Özeti</th>
         </tr>
         <tr>
         	<td>${kitapbilgi.kitapsayfa}</td>
         	<td>${kitapbilgi.kitapbasimyili}</td>
         	<td>${kitapbilgi.kitapozeti}</td>
         </tr>
         
         </table>
         
        <div style="clear; both;"></div>
		<p> <a href="${pageContext.request.contextPath }/yazar/list"> Geri Dön </a> </p>

</body>
</html>