<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome TO OHC</title>
</head>
<body>
<h1><marquee>Welcome to Admin system</marquee></h1>

<br>

<pre><h4>


@hostname = http://localhost:8892/api/v1/admin/

### Request 1
GET {{hostname}}get

#####
POST  {{hostname}}add
content-type: application/json

{
    "id":15,
    "fname":"pradeep",
    "mname":"t",
    "lname":"kadam",
    "city":"kolhapur"
}

#######
DELETE {{hostname}}del/1
content-type: application/json



#######
PUT   {{hostname}}update
content-type: application/json

{
    "id":1,
    "fname":"pk",
    "mname":"pk",
    "lname":"pk",
    "city":"kolhapur"
}

### Request 1
GET {{hostname}}getid/44
### Request 1
GET {{hostname}}get/pk
#####





##################Docter#################
@hostnamed = http://localhost:8892/api/v1/docter/
### Request 1
GET {{hostnamed}}get

#####
POST  {{hostnamed}}add
content-type: application/json

{
    "id":15,
    "fname":"dr",
    "mname":"Bhatia",
    "lname":"Capgemin",
    "city":"pune"
}

#######
DELETE {{hostnamed}}del/1
content-type: application/json



#######
PUT   {{hostnamed}}update
content-type: application/json

{
    "id":1,
    "fname":"pk",
    "mname":"pk",
    "lname":"pk",
    "city":"pune"
}

### Request 1
GET {{hostnamed}}getid/44
### Request 1
GET {{hostnamed}}get/pk
#####







##################Docter#################
@hostnamep = http://localhost:8892/api/v1/patient/
### Request 1
GET {{hostnamep}}get

#####
POST  {{hostnamed}}add
content-type: application/json

{
    "id":15,
    "fname":"pa",
    "mname":"Chetan",
    "lname":"kota",
    "city":"pune"
    
}

#######
DELETE {{hostnamep}}del/1
content-type: application/json



#######
PUT   {{hostnamep}}update
content-type: application/json

{
    "id":1,
    "fname":"prk",
    "mname":"tk",
    "lname":"kadam",
    "city":"kolhapur"
}

### Request 1
GET {{hostnamep}}getid/44
### Request 1
GET {{hostnamep}}get/prk


</h4>
</pre>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  
<link rel="apple-touch-icon" type="image/png" href="https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png" />
<meta name="apple-mobile-web-app-title" content="CodePen">

<link rel="shortcut icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />

<link rel="mask-icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />


  <meta charset="utf-8">
  <meta name='viewport' content='width=device-width, initial-scale=1'>

  <title>CodePen - Responsive Fixed Animated NavBar</title>

  <link rel="stylesheet" media="screen" href="https://cpwebassets.codepen.io/assets/fullpage/fullpage-1580f96ce81ff0a427cf57dda2748ce646c38efc201ae5942a29958cffa6856d.css" />
  
  
<link rel="apple-touch-icon" type="image/png" href="https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png" />
<meta name="apple-mobile-web-app-title" content="CodePen">

<link rel="shortcut icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />

<link rel="mask-icon" type="image/x-icon" href="https://cpwebassets.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg" color="#111" />




  <title>CodePen - Responsive Fixed Animated NavBar</title>
  <script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage("resize", "*");
  }
</script>


  <style>
    html { font-size: 15px; }
    html, body { margin: 0; padding: 0; min-height: 100%; }
    body { height:100%; display: flex; flex-direction: column; }
    .referer-warning {
      background: black;
      box-shadow: 0 2px 5px rgba(0,0,0, 0.5);
      padding: 0.75em;
      color: white;
      text-align: center;
      font-family: var(--cp-font-family);
      line-height: 1.2;
      font-size: 1rem;
      position: relative;
      z-index: 2;
    }
    .referer-warning h1 { font-size: 1.2rem; margin: 0; }
    .referer-warning a { color: #56bcf9; } /* $linkColorOnBlack */
  </style>
</head>

<body class="">
  
    <iframe
      id="result"
      srcdoc="
<!DOCTYPE html>
<html lang=&quot;en&quot; >

<head>

  <meta charset=&quot;UTF-8&quot;>
  
<link rel=&quot;apple-touch-icon&quot; type=&quot;image/png&quot; href=&quot;https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png&quot; />
<meta name=&quot;apple-mobile-web-app-title&quot; content=&quot;CodePen&quot;>

<link rel=&quot;shortcut icon&quot; type=&quot;image/x-icon&quot; href=&quot;https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico&quot; />

<link rel=&quot;mask-icon&quot; type=&quot;image/x-icon&quot; href=&quot;https://cpwebassets.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg&quot; color=&quot;#111&quot; />


  <title>CodePen - Responsive Fixed Animated NavBar</title>
  
  
  
  
<style>
@import url('https://fonts.googleapis.com/css?family=Quicksand:400,500,700');
html,
body {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: &quot;Quicksand&quot;, sans-serif;
    font-size: 62.5%;
    font-size: 10px;
}
/*-- Inspiration taken from abdo steif -->
/* --> https://codepen.io/abdosteif/pen/bRoyMb?editors=1100*/

/* Navbar section */

.nav {
    width: 100%;
    height: 65px;
    position: fixed;
    line-height: 65px;
    text-align: center;
}

.nav div.logo {
    float: left;
    width: auto;
    height: auto;
    padding-left: 3rem;
}

.nav div.logo a {
    text-decoration: none;
    color: #fff;
    font-size: 2.5rem;
}

.nav div.logo a:hover {
    color: #00E676;
}

.nav div.main_list {
    height: 65px;
    float: right;
}

.nav div.main_list ul {
    width: 100%;
    height: 65px;
    display: flex;
    list-style: none;
    margin: 0;
    padding: 0;
}

.nav div.main_list ul li {
    width: auto;
    height: 65px;
    padding: 0;
    padding-right: 3rem;
}

.nav div.main_list ul li a {
    text-decoration: none;
    color: #fff;
    line-height: 65px;
    font-size: 2.4rem;
}

.nav div.main_list ul li a:hover {
    color: #00E676;
}


/* Home section */

.home {
    width: 100%;
    height: 100vh;
    background-image: url(https://images.unsplash.com/photo-1498550744921-75f79806b8a7?ixlib=rb-0.3.5&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;s=b0f6908fa5e81286213c7211276e6b3d&amp;auto=format&amp;fit=crop&amp;w=1500&amp;q=80);
    background-position: center top;
	background-size:cover;
}

.navTrigger {
    display: none;
}

.nav {
    padding-top: 20px;
    padding-bottom: 20px;
    -webkit-transition: all 0.4s ease;
    transition: all 0.4s ease;
}


/* Media qurey section */

@media screen and (min-width: 768px) and (max-width: 1024px) {
    .container {
        margin: 0;
    }
}

@media screen and (max-width:768px) {
    .navTrigger {
        display: block;
    }
    .nav div.logo {
        margin-left: 15px;
    }
    .nav div.main_list {
        width: 100%;
        height: 0;
        overflow: hidden;
    }
    .nav div.show_list {
        height: auto;
        display: none;
    }
    .nav div.main_list ul {
        flex-direction: column;
        width: 100%;
        height: 100vh;
        right: 0;
        left: 0;
        bottom: 0;
        background-color: #111;
        /*same background color of navbar*/
        background-position: center top;
    }
    .nav div.main_list ul li {
        width: 100%;
        text-align: right;
    }
    .nav div.main_list ul li a {
        text-align: center;
        width: 100%;
        font-size: 3rem;
        padding: 20px;
    }
    .nav div.media_button {
        display: block;
    }
}


/* Animation */
/* Inspiration taken from Dicson https://codemyui.com/simple-hamburger-menu-x-mark-animation/ */

.navTrigger {
    cursor: pointer;
    width: 30px;
    height: 25px;
    margin: auto;
    position: absolute;
    right: 30px;
    top: 0;
    bottom: 0;
}

.navTrigger i {
    background-color: #fff;
    border-radius: 2px;
    content: '';
    display: block;
    width: 100%;
    height: 4px;
}

.navTrigger i:nth-child(1) {
    -webkit-animation: outT 0.8s backwards;
    animation: outT 0.8s backwards;
    -webkit-animation-direction: reverse;
    animation-direction: reverse;
}

.navTrigger i:nth-child(2) {
    margin: 5px 0;
    -webkit-animation: outM 0.8s backwards;
    animation: outM 0.8s backwards;
    -webkit-animation-direction: reverse;
    animation-direction: reverse;
}

.navTrigger i:nth-child(3) {
    -webkit-animation: outBtm 0.8s backwards;
    animation: outBtm 0.8s backwards;
    -webkit-animation-direction: reverse;
    animation-direction: reverse;
}

.navTrigger.active i:nth-child(1) {
    -webkit-animation: inT 0.8s forwards;
    animation: inT 0.8s forwards;
}

.navTrigger.active i:nth-child(2) {
    -webkit-animation: inM 0.8s forwards;
    animation: inM 0.8s forwards;
}

.navTrigger.active i:nth-child(3) {
    -webkit-animation: inBtm 0.8s forwards;
    animation: inBtm 0.8s forwards;
}

@-webkit-keyframes inM {
    50% {
        -webkit-transform: rotate(0deg);
    }
    100% {
        -webkit-transform: rotate(45deg);
    }
}

@keyframes inM {
    50% {
        transform: rotate(0deg);
    }
    100% {
        transform: rotate(45deg);
    }
}

@-webkit-keyframes outM {
    50% {
        -webkit-transform: rotate(0deg);
    }
    100% {
        -webkit-transform: rotate(45deg);
    }
}

@keyframes outM {
    50% {
        transform: rotate(0deg);
    }
    100% {
        transform: rotate(45deg);
    }
}

@-webkit-keyframes inT {
    0% {
        -webkit-transform: translateY(0px) rotate(0deg);
    }
    50% {
        -webkit-transform: translateY(9px) rotate(0deg);
    }
    100% {
        -webkit-transform: translateY(9px) rotate(135deg);
    }
}

@keyframes inT {
    0% {
        transform: translateY(0px) rotate(0deg);
    }
    50% {
        transform: translateY(9px) rotate(0deg);
    }
    100% {
        transform: translateY(9px) rotate(135deg);
    }
}

@-webkit-keyframes outT {
    0% {
        -webkit-transform: translateY(0px) rotate(0deg);
    }
    50% {
        -webkit-transform: translateY(9px) rotate(0deg);
    }
    100% {
        -webkit-transform: translateY(9px) rotate(135deg);
    }
}

@keyframes outT {
    0% {
        transform: translateY(0px) rotate(0deg);
    }
    50% {
        transform: translateY(9px) rotate(0deg);
    }
    100% {
        transform: translateY(9px) rotate(135deg);
    }
}

@-webkit-keyframes inBtm {
    0% {
        -webkit-transform: translateY(0px) rotate(0deg);
    }
    50% {
        -webkit-transform: translateY(-9px) rotate(0deg);
    }
    100% {
        -webkit-transform: translateY(-9px) rotate(135deg);
    }
}

@keyframes inBtm {
    0% {
        transform: translateY(0px) rotate(0deg);
    }
    50% {
        transform: translateY(-9px) rotate(0deg);
    }
    100% {
        transform: translateY(-9px) rotate(135deg);
    }
}

@-webkit-keyframes outBtm {
    0% {
        -webkit-transform: translateY(0px) rotate(0deg);
    }
    50% {
        -webkit-transform: translateY(-9px) rotate(0deg);
    }
    100% {
        -webkit-transform: translateY(-9px) rotate(135deg);
    }
}

@keyframes outBtm {
    0% {
        transform: translateY(0px) rotate(0deg);
    }
    50% {
        transform: translateY(-9px) rotate(0deg);
    }
    100% {
        transform: translateY(-9px) rotate(135deg);
    }
}

.affix {
    padding: 0;
    background-color: #111;
}






.myH2 {
	text-align:center;
	font-size: 4rem;
}
.myP {
	text-align: justify;
	padding-left:15%;
	padding-right:15%;
	font-size: 20px;
}
@media all and (max-width:700px){
	.myP {
		padding:2%;
	}
}
</style>

  <script>
  window.console = window.console || function(t) {};
</script>

  
  
  <script>
  if (document.location.search.match(/type=embed/gi)) {
    window.parent.postMessage(&quot;resize&quot;, &quot;*&quot;);
  }
</script>


</head>

<body translate=&quot;no&quot; >
  <nav class=&quot;nav&quot;>
        <div class=&quot;container&quot;>
            <div class=&quot;logo&quot;>
                <a href=&quot;#&quot;>Your Logo</a>
            </div>
            <div id=&quot;mainListDiv&quot; class=&quot;main_list&quot;>
                <ul class=&quot;navlinks&quot;>
                    <li><a href=&quot;#&quot;>About</a></li>
                    <li><a href=&quot;#&quot;>Portfolio</a></li>
                    <li><a href=&quot;#&quot;>Services</a></li>
                    <li><a href=&quot;#&quot;>Contact</a></li>
                </ul>
            </div>
            <span class=&quot;navTrigger&quot;>
                <i></i>
                <i></i>
                <i></i>
            </span>
        </div>
    </nav>

    <section class=&quot;home&quot;>
    </section>
    <div style=&quot;height: 1000px&quot;>
        <!-- just to make scrolling effect possible -->
			<h2 class=&quot;myH2&quot;>What is this ?</h2>
			<p class=&quot;myP&quot;>This is a responsive fixed navbar animated on scroll</p>
			<p class=&quot;myP&quot;>I took inspiration from  ABDO STEIF (<a href=&quot;https://codepen.io/abdosteif/pen/bRoyMb?editors=1100&quot;>https://codepen.io/abdosteif/pen/bRoyMb?editors=1100</a>)
			and Dicson <a href=&quot;https://codepen.io/dicson/pen/waKPgQ&quot;>(https://codepen.io/dicson/pen/waKPgQ)</a></p>
			<p class=&quot;myP&quot;>I HOPE YOU FIND THIS USEFULL</p>
			<p class=&quot;myP&quot;>Albi</p>
				<p class=&quot;myP&quot;>
				
				Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsum ratione facere animi impedit rem labore sint repellendus ipsa sapiente voluptatem aut excepturi quo itaque, ab earum cumque. Voluptatem beatae id inventore quod voluptate qui deserunt, quis placeat, tempora ex totam, dolore sequi harum eos voluptatibus animi labore officiis minus laboriosam
				Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsum ratione facere animi impedit rem labore sint repellendus ipsa sapiente voluptatem aut excepturi quo itaque, ab earum cumque. Voluptatem beatae id inventore quod voluptate qui deserunt, quis placeat, tempora ex totam, dolore sequi harum eos voluptatibus animi labore officiis minus laboriosam
				Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsum ratione facere animi impedit rem labore sint repellendus ipsa sapiente voluptatem aut excepturi quo itaque, ab earum cumque. Voluptatem beatae id inventore quod voluptate qui deserunt, quis placeat, tempora ex totam, dolore sequi harum eos voluptatibus animi labore officiis minus laboriosam
				Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsum ratione facere animi impedit rem labore sint repellendus ipsa sapiente voluptatem aut excepturi quo itaque, ab earum cumque. Voluptatem beatae id inventore quod voluptate qui deserunt, quis placeat, tempora ex totam, dolore sequi harum eos voluptatibus animi labore officiis minus laboriosam
				Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ipsum ratione facere animi impedit rem labore sint repellendus ipsa sapiente voluptatem aut excepturi quo itaque, ab earum cumque. Voluptatem beatae id inventore quod voluptate qui deserunt, quis placeat, tempora ex totam, dolore sequi harum eos voluptatibus animi labore officiis minus laboriosam
			</p>
    </div>

<!-- Jquery needed -->
    <script src=&quot;https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js&quot;></script>
    <script src=&quot;js/scripts.js&quot;></script>

<!-- Function used to shrink nav bar removing paddings and adding black background -->
    <script>
        $(window).scroll(function() {
            if ($(document).scrollTop() > 50) {
                $('.nav').addClass('affix');
                console.log(&quot;OK&quot;);
            } else {
                $('.nav').removeClass('affix');
            }
        });
    </script>
    <script src=&quot;https://cpwebassets.codepen.io/assets/common/stopExecutionOnTimeout-1b93190375e9ccc259df3a57c1abc0e64599724ae30d7ea4c6877eb615f89387.js&quot;></script>

  
      <script id=&quot;rendered-js&quot; >
$('.navTrigger').click(function () {
  $(this).toggleClass('active');
  console.log(&quot;Clicked menu&quot;);
  $(&quot;#mainListDiv&quot;).toggleClass(&quot;show_list&quot;);
  $(&quot;#mainListDiv&quot;).fadeIn();

});
//# sourceURL=pen.js
    </script>

  

</body>

</html>
 
"
      sandbox="allow-downloads allow-forms allow-modals allow-pointer-lock allow-popups allow-presentation  allow-scripts allow-top-navigation-by-user-activation" allow="accelerometer; camera; encrypted-media; display-capture; geolocation; gyroscope; microphone; midi; clipboard-read; clipboard-write" allowTransparency="true"
      allowpaymentrequest="true" allowfullscreen="true" class="result-iframe">
      </iframe>

  </div>
</body>
</html>


</body>
</html>