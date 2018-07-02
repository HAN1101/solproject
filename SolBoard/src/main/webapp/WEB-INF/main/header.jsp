<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Board And Login</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="style.css" rel="stylesheet" type="text/css" />

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
</head>

<body>
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="index.html"><span>Board</span>Login<br />
          <small>Board ANd Login</small></a></h1>
      </div>
      <div class="clr"></div>
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="main.do">Home</a></li>
          <li><a href="../board/board.do">게시판</a></li>
          <li><a href="notice.do">게시글</a></li>
          <li data-toggle="modal" data-target="#myModal"><a>로그인</a></li>
        </ul>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
			
			<form class="form-signin" method=post action="../main/login_ok.do">
                <input type="text" class="form-control" id="email" name="email" placeholder="Email"  required autofocus>
                <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Password" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit" >로그인</button>
                <span class="clearfix"></span>
            </form>
			
			
			
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
</body>
</html>