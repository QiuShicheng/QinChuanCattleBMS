<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>

<html>
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
          <li class="active"><a href="upload.jsp">What We Do</a></li>
          <li><a href="https://nbcic.nwsuaf.edu.cn/">About</a></li>
          <li><a href="contact.jsp">Contact</a></li>
        </ul>
      </nav>
    </header>
    
    <main class="probootstrap-main">
      <section class="probootstrap-bg probootstrap-animate" data-animate-effect="fadeInLeft" >
       
          <h1 class="mb-5">QinChuanCattleBMS</h1>
           <br/><br/>
                    <h3>具体操作</h3>
      <div class="mb-5"><img src=""  style="position:absolute; left:100px;" alt=""></div>
      <div class="row">
      1、pcd文件上传：<span>${Msg}</span><br/>
<form action="UploadServlet" method="post" enctype="multipart/form-data">
    <input type="file" name="testImg"/> &nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit"/>
</form>
<br/><br/>
2、请选择已上传文件进行数据处理：
<form action="changeServlet" method="post" enctype="text/pain">
    <input type="text" name="txt"/>
    <input type="submit" name="change"  value="网页转换"/>
</form>
<br/><br/>
<span>http://localhost:8080/potree/${address}.html</span><br>
<a href="http://localhost:8080/potree/${address}.html" target="_blank">点击查看网页</a>
<br />

3、json文件上传：<span>${Msg1}</span><br />
<form action="jsonUploadServlet" method="post" enctype="multipart/form-data">
    <input type="file" name="test"/> &nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit"/>
</form>
<ol>
<li>体高：<span>${BH}</span></li>
<li>腰高：<span>${WH}</span></li>
<li>体斜长：<span>${BL}</span></li>
<li>尻长：<span>${RL}</span></li>
<li>尻宽：<span>${RW}</span></li>
<li>臀端高：<span>${HH}</span></li>
<li>腰角宽：<span>${HW}</span></li>
</ol>
</div>
      </section>

      <section class="probootstrap-animate mb-5">
        <h1 class="mb-4 text-primary">秦川牛体尺测量</h1>
        <p class="lead">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;秦川牛作为我国地方黄牛的代表性品种，以其肉质细嫩多汁、耐粗饲、抗病力强、适应性广等优点而享誉海内外，被誉为“国之瑰宝”。
                    秦川牛体型是畜牧养殖与育种工作关注的重要内容，在实际生产中体尺评定仍由人工测量完成。秦川牛体型指标繁多，数据获取工作量大。
                    通过本网站后，将完成一整套面向活体秦川牛的3D点云图像采集、预处理、曲面重构、体尺特征分析的过程，可实现活体牛体尺数据的准确测量，
                    有助于解决在养殖规模化发展的现况下繁杂劳动问题，对畜牧业发展产生积极影响。</p>

        <p class="mb-5"></p>
      </section>
      <section>
        <h3 class="mb-4 text-primary">测量步骤</h3>
      <nav class="probootsrap-nav">
        <ol>
          <li>选择类型为pcd的文件，并将文件上传提交</li>
          <li class="active">输入文件名并点击文件类型替换按钮</li>
          <li>点击相关网页的超链接打开交互网页</li>
          <li>在交互页面获取数据顺序为：体高、腰高、体斜长、尻长、尻宽、臀端高、腰角宽</li>
          <li>在交互页面获取数据之后保存json文件，并以牛耳标命名</li>
          <li>将json文件上传，点击查询按钮，即可显示测量数据</li>
          
        </ol>
      </nav>
      </section>

    </main>

    <footer class="probootstrap-animate">
      <div><p>
      <p>Copyright &copy; QinChuanCattleBMS.All rights reserved.Design by  <a href="https://cie.nwafu.edu.cn/" title="NWSUAF">CIE_NWSUAF</a></p></div>
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