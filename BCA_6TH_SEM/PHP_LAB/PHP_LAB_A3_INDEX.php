<?php
    session_start();
    $report = "";
    
    if(isset($_POST["btn"])){ // Fixed `issest` to `isset`
        $uname = $_POST["uname"];
        $pwd = $_POST["pword"];
        
        if($uname == "user2" && $pwd == "password") { // Fixed `=` to `==`
            $_SESSION["un"] = $uname;
            $_SESSION["pw"] = $pwd;
            header("Location: PHP_LAB_A3_WELCOME.php"); // Fixed `header(Location:...)`
            die();
        } else{
            $report = "Username or Password is Wrong. Please Try Again!";
        }
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h2>Login</h2>
        <form method="post">
            <p>Username : <input type="text" name="uname" required></p>
            <p>Password : <input type="password" name="pword" required></p>
            <p><input type="submit" name="btn" value="Login"></p> <!-- Added submit button -->
        </form>
        <h3 style="color: red;"><?= $report ?></h3>
    </body>
</html>
