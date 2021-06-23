<%-- 
    Document   : login
    Created on : Apr 4, 2018, 1:01:28 PM
    Author     : DRH
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
    <head>
       
        <title>SEPEM</title>
        <link href="<c:url value="/resources/static/css/index.css" />" rel="stylesheet">
         
    </head>
    <body>
   
   <%--  <h1> <%
    String attribut=(String)request.getAttribute("title");
    out.println(attribut);
    %></h1>
    ${title }--%>
    
        <form:form modelAttribute="login" action="pageprincipale">

            <div class="boite-login">
                <h2>Connexion</h2>
                <div class="label-And-text">                                 
                    <input type="text" name="login" required="" id="text-login"/>
                    <label>Nom d'utilisateur</label>
                </div>
                <div class="label-And-text">                                 
                    <input type="password" name="pass" required="" id="text-login"/>
                    <label>Mot de passe</label>
                </div>
                <div class="bouton-submit">
                    <input type="submit" value="Connexion"/>
                </div>
            </div>
        </form:form>
    </body>
</html>
