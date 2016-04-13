<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
  <head>
    <meta charset="UTF-8">
    <title>Signup Form</title>
    <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style1.css">
  </head>

  <body>
    <div id="header">

          <div> <a id="title"href="http://stackoverflow.com/">CMAD Projects</a></div>

        <div id="right"></div>
        <div id="center">
  <a id="login" href="http://www.google.com"> login </a>
  <a id="signup" href="http://www.gmail.com"> sign up </a>
  <input name="q" type="text" placeholder="" value="Search Q&A" tabindex="1" autocomplete="off" maxlength="240">
</div>
      </div>

<!-- Form-->
<div class="form">
  <div class="form-panel two">
    <div class="form-header">
      <h1>Register Account</h1>
    </div>
    <div class="form-content">
      <form>
        <div class="form-group">
          <label for="username">Display Name</label>
          <input type="text" id="username" name="username" required="required"/>
        </div>
        <div class="form-group">
          <label for="email">Email Address</label>
          <input type="email" id="email" name="email" required="required"/>
        </div>
        <div class="form-group">
          <label for="password">Password</label>
          <input type="password" id="password" name="password" required="required"/>
        </div>
        <div class="form-group">
          <label for="cpassword">Confirm Password</label>
          <input type="password" id="cpassword" name="cpassword" required="required"/>
        </div>
        <div class="form-group">
          <button type="submit">Register</button>
        </div>
      </form>
    </div>
</div>
<fieldset>
<div class="pen-footer">
<i class="material-icons">Aleadry have a account?</i>
<a href="login.html" target="_blank">Login</a></div>
</div>
  </fieldset>
</body>
</html>
