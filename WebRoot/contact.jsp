<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>

<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

		<title></title>
		<meta name="description" content="Free Bootstrap 4 Theme by uicookies.com">
		<meta name="keywords" content="">
    
    <link href="https://fonts.googleapis.com/css?family=Crimson+Text:400,400i,600|Work+Sans:400,600" rel="stylesheet">

		<link rel="stylesheet" href="assets/css/bootstrap/bootstrap.css">
    <link rel="stylesheet" href="assets/css/animate.css">
    <link rel="stylesheet" href="assets/fonts/ionicons/css/ionicons.min.css">

    <link rel="stylesheet" href="assets/fonts/fontawesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="assets/css/slick.css">
    <link rel="stylesheet" href="assets/css/slick-theme.css">

    <link rel="stylesheet" href="assets/css/helpers.css">
    <link rel="stylesheet" href="assets/css/style.css">

	</head>
	<body>
    
    <header class="probootstrap-header">
      <a class="probootstrap-logo" href="index.jsp">
        <h1>Frontier</h1>
      </a>
      <nav class="probootsrap-nav">
        <ul>
          <li><a href="index.jsp">Home</a></li>
          <li><a href="upload.jsp">What We Do</a></li>
          <li><a href="https://nbcic.nwsuaf.edu.cn/">About</a></li>
          <li class="active"><a href="contact.jsp">Contact</a></li>
        </ul>
      </nav>
    </header>
    
    <main class="probootstrap-main mb-5">

      <section class="probootstrap-bg probootstrap-animate" data-animate-effect="fadeInLeft" style="background-image: url(assets/images/3hao.jpg);"></section>

      <section class="probootstrap-animate mb-5">
        <h1 class="mb-4 text-primary">联系我们</h1>
        <p class="lead">Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
        </div>
      </section>
      <section>
        <form action="#" method="post" class="probootstrap-form probootstrap-animate">
              <div class="row">
                <div class="col-md-6">
                  <div class="form-group">
                    <label for="fname">First Name</label>
                    <input type="text" class="form-control" id="fname" name="fname">
                  </div>
                </div>
                <div class="col-md-6">
                  <div class="form-group">
                    <label for="lname">Last Name</label>
                    <input type="text" class="form-control" id="lname" name="lname">
                  </div>
                </div>
              </div>
              <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email">
              </div>
              <div class="form-group">
                <label for="message">Message</label>
                <textarea cols="30" rows="10" class="form-control" id="message" name="message"></textarea>
              </div>
              <div class="form-group">
                <input type="submit" class="btn btn-primary" id="submit" name="submit" value="Send Message">
              </div>
            </form>
      </section>

    </main>

    <footer class="probootstrap-animate">
    
    <div class="form-group">
                    <h4 class="mb-4 text-primary">关于我们</h4>
                    <p>西北农林科技大学信息工程学院计算机控制系<br>    &amp;  宁夏肉牛</p>
                <p>Copyright &copy; QinChuanCattleBMS.All rights reserved.Design by  <a href="https://cie.nwafu.edu.cn/" title="NWSUAF">CIE_NWSUAF</a></p>
                </div>
      <p>
        <a href="#" class="pr-3 pl-0"><i class="ion-social-facebook"></i></a>
        <a href="#" class="p-3"><i class="ion-social-twitter"></i></a>
        <a href="#" class="p-3"><i class="ion-social-linkedin"></i></a>
      </p>
      
    </footer>

    
    <script src="assets/js/jquery.min.js"></script>
    
    <script src="assets/js/popper.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/slick.min.js"></script>

    <script src="assets/js/jquery.waypoints.min.js"></script>
    <script src="assets/js/jquery.easing.1.3.js"></script>

    <script src="assets/js/main.js"></script>
	</body>
</html>