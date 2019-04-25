<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script src="https://unpkg.com/ionicons@4.5.5/dist/ionicons.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="/js/search.js"></script>
    
    <title>Chill Pill</title>
</head>
<body>
        <header id="header">
            <nav>
                <div class="logo">
                    <a href="/drugs"><img src="/images/chpi.png" alt="chpi"></a>
                    
                </div>
                <div class="menu">
                    <ul>
                        <li><a href="javascript:void(0)" class="btn btn-outline-primary">Search</a></li>
                        <li><a href="#data" class="btn btn-outline-primary">Project</a></li>
                        <li><a href="#footer"  class="btn btn-outline-primary">Contact</a></li>
                    </ul>
                </div>
            </nav>
        </header>
        <div class="rellax chillin"></div>
        <div class="rellax text"></div>
        <div class="rellax clouds"></div>
        <div class="whitepsace"></div>
        <div class="content" id="content">  
            <h1>Take a Chill Pill</h1> 
            <h1>we got you covered.</h1>
            <form id="searchBar">
            	<i class="fa fa-user-md" aria-hidden="true"></i>
            	<input id="searchStr" name="searchStr" type="search" class="search" placeholder="Type your drug name(like Advair, Insulen, etc)">
            </form>
            <select id="coverage" name="coverageName" class="form-control">
            	<c:forEach items="${insurances}" var="insurance">
            	<option value="${insurance.coverage}">${insurance.name}</option>
            	
            	</c:forEach>
            </select>
            <div class="wrapper">
                <table class="table table-striped" id="theTable">
                    
                </table>
       		</div>
                <script src="/js/rellax.min.js"></script>
                <script type="text/javascript">
                    var rellax = new Rellax('.rellax');

                    function msg(){
                        alert("This is a test data");
                    }
                </script>
            </div>
       	 </div>
         <div class="doctorExperience" id="data">
	         <h2>Doctor Experience</h2>
	         <p id="p">Give the best prescription advice for your client with Chill Pill</p>
	         <div class="info info1">
	             <img src="/images/hello.png" alt="hello">
	             <p >Doctors have an obligation to prescribe what is best for their clients, however finding the most cost-effective prescription can be difficult and takes valuable time away from your client. With Chill Pill, we have a database design to make finding out cost of prescription simple, clean, and easy.</p>
	         </div>
	         <div class="info info2" >
	             <img src="/images/doctor.png" alt="doctor">
	             <p>Doctors in hospitals can use Chill Pill to find up-to-date drug pricing, review your patients insurance, estimate their out of pocket cost, and a comparsing other brands of the same drug simply with a click. </p>
	         </div>
	         <div class="info info3">
	             <img src="/images/saveTime.png" alt="time">
	             <p>Chill Pills save time and money for your patients as well as help doctors worldwide get the right medicine at the right price for their patience. </p>
             </div>
             
             <div id="backTop"><a href="#header">Back to Top</a></div>
             
         <div class="footer" id="footer">
         <p> ChillPill@VRCP.org.
          VRCP '19, April 22 - 2019, San Jose, CA, USA Copyright is
          held by the owner/author(s). Future Publication rights licensed to Victory L. and Ryan T.
          </p>
         </div>
         
         
         <script>
         window.onscroll = function(){myFunction()};
         
         var navbar = document.getElementById("menu");
         var sticky = navbar.offsetTop;
         
         function myFunction() {
        	 if (window.pageYOffset >= sticky) {
        		 navbar.classList.add("sticky")
        	 } else {
        		 navbar.classList.remove("")
        	 }
         }
</body>
</html>