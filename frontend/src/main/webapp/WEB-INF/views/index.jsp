<html><!DOCTYPE html>
<html lang="en">
<head>
  <title>Archie Singh</title>
  <meta charset="utf-8">
  
  </head>
<body>
<%@include file="header.jsp" %>
<div class="container">
  
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="${e}/resources/images/cover.PNG" alt="cover picture" style="width:100%;">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>

      <div class="item">
        <img src="${e}/resources/images/watch.PNG" alt="watch offer" style="width:100%;">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>
      
      <div class="item">
        <img src="${e}/resources/images/citizen.PNG" alt="citizen watch" style="width:100%;">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>
    
    
      <div class="item">
        <img src="${e}/resources/images/lov.PNG" alt="offer" style="width:100%;">
        <div class="carousel-caption">
          <h3></h3>
          <p></p>
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
  <br>
  <br>
          <img src="${e}/resources/images/brands.PNG" alt="Lights" style="width:100%">
  <br>
  <br>
   <div class="row">
    <div class="col-md-4">
      <div class="thumbnail">
        <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/4" target="_blank"></c:if>
          <img src="${e}/resources/images/Capture.PNG" alt="Lights" style="width:100%">
          <div class="caption">
            
          </div>
        </a>
      </div>
    </div>
    
    <div class="col-md-4">
      <div class="thumbnail">
       <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/10" target="_blank"></c:if>
          <img src="${e}/resources/images/cchaps.PNG" alt="Lights" style="width:100%">
          <div class="caption">
                      </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
       <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/5" target="_blank"></c:if>
          <img src="${e}/resources/images/fastrack.PNG" alt="Lights" style="width:100%">
          <div class="caption">
            
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
       <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/7" target="_blank"></c:if>
          <img src="${e}/resources/images/citizenn.PNG" alt="Lights" style="width:100%">
          <div class="caption">
            
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
       <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/1" target="_blank"></c:if>
          <img src="${e}/resources/images/fossil.PNG" alt="Lights" style="width:100%">
          <div class="caption">
            
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
       <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/8" target="_blank"></c:if>
          <img src="${e}/resources/images/invicta.PNG" alt="Lights" style="width:100%">
          <div class="caption">
            
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
       <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/6" target="_blank"></c:if>
          <img src="${e}/resources/images/timex.PNG" alt="Lights" style="width:100%">
          <div class="caption">
            
          </div>
        </a>
      </div>
    </div>
    <div class="col-md-4">
      <div class="thumbnail">
       <c:if test='<%=session.getAttribute("loggedIn")!=null%>'>
        <a href="${e}productlist/3" target="_blank"></c:if>
          <img src="${e}/resources/images/titan.PNG" alt="Lights" style="width:100%">
          <div class="caption">
            
          </div>
        </a>
      </div>
    </div>
    
    
  
  
  
</div>  
</div>
<%@include file="footer.jsp" %>
</body>
</html>

