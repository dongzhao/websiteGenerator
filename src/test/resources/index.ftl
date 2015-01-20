<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>test</title><!-- CSS includes -->

<link rel="stylesheet" href="css/style.css" type="text/css" media="screen" charset="utf-8"/>
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" charset="utf-8"/>
<link rel="stylesheet" href="css/validationEngine.jquery.css" type="text/css" media="screen" charset="utf-8"/> 
<link rel="stylesheet" href="css/jquery.fancybox-1.3.4.css" type="text/css" media="screen" charset="utf-8"/>

<!-- JavaScript -->
<script type="text/javascript" src="core/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="core/js/jquery.easing-1.3.pack.js"></script>
<script type="text/javascript" src="core/js/jquery.mousewheel-3.0.4.pack.js"></script>

<link rel="canonical" href="index.html"/>
<script type="text/javascript" src="core/js/jquery.nivo.slider.js"></script>
<script type="text/javascript" src="core/js/jquery.validationEngine-en.js"></script> 
<script type="text/javascript" src="core/js/jquery.validationEngine.js"></script>
</head>

<body class="home ">
<!-- Site Container Start -->
<div class="container">

<!-- Header Start -->
${header}
<!-- Header End -->

<!-- Navigation Start -->
${navigation}
<!-- Navigation End -->

<div class="bannerCon">
  <div id="wrapper" class="clearfloat">
    <div class="content_top"><div class="widget slider widget0"><!-- Slider Start -->
<script type="text/javascript">
$(window).load(function() {
    $('#slider').nivoSlider({
        effect: 'fade', // Specify sets like: 'fold,fade,sliceDown'
        slices: 15, // For slice animations
        boxCols: 8, // For box animations
        boxRows: 4, // For box animations
        animSpeed: 500, // Slide transition speed
        pauseTime: 3000, // How long each slide will show
        startSlide: 0, // Set starting Slide (0 index)
        directionNav: true, // Next & Prev navigation
        controlNav: true, // 1,2,3... navigation
        controlNavThumbs: false, // Use thumbnails for Control Nav
        pauseOnHover: true, // Stop animation while hovering
        manualAdvance: false, // Force manual transitions
        prevText: 'Prev', // Prev directionNav text
        nextText: 'Next', // Next directionNav text
        randomStart: false, // Start on a random slide
        beforeChange: function(){}, // Triggers before a slide transition
        afterChange: function(){}, // Triggers after a slide transition
        slideshowEnd: function(){}, // Triggers after all slides have been shown
        lastSlide: function(){}, // Triggers when last slide is shown
        afterLoad: function(){} // Triggers when slider has loaded
    });
});
</script>
<div id="slider-container">
<div id="slider-wrapper" class="slider" style="width:100%;height:auto;max-height:390;overflow: hidden;" >
<div id="slider" class="nivoSlider">
<img src="images/slider/slid01.html?src=/images/slider/&amp;w=950&amp;h=390&amp;zc=1" title="#slide1" />
<img src="images/slider/slid02.html?src=/images/slider/&amp;w=950&amp;h=390&amp;zc=1" title="#slide2" />
<img src="images/slider/slid03.html?src=/images/slider/&amp;w=950&amp;h=390&amp;zc=1" title="#slide3" />
</div><div id="slide1" class="nivo-html-caption">Offering ??? service that you will not find elsewhere in Wollongong</div>
<div id="slide2" class="nivo-html-caption">Offering ??? service that you will not find elsewhere in Sydney</div>
<div id="slide3" class="nivo-html-caption">Offering ??? service that you will not find elsewhere in N.S.W</div></div><!-- Slider Wrapper End -->
</div><!-- Slider Container End --></div></div>  </div>
</div>

<!-- Content Start -->
<div id="wrapper" class="clearfloat">
<div class="content-middle clearfloat">
  <div class="heading">
	  	  <h1>Welcome to My Website</h1>
      </div><!-- .heading -->

  <div class="content clearfloat">
	  We offer a service that you will not find elsewhere in the Wollongong Area. <br />
<table border="0" cellspacing="10">
<tbody>
<tr>
<td><a href="products/index.html"><img border="0" src="images/shipping_small.jpg" height="164" width="198" /></a></td>
<td><a href="services/index.html"><img border="0" src="images/services_small.jpg" height="164" width="198" /></a></td>
<td><a href="about-us/index.html"><img border="0" src="images/aboutus_small.jpg" height="164" width="198" /></a></td>
</tr>
</tbody>
</table> 
  </div><!-- .content --> 
  
</div><!-- .content-middle --> 
</div><!-- Wrapper End -->

<!-- Footer Start -->
<div id="footer-contain">
	<div class="footer-mywork">
		<!-- Company Coyright -->
		<span class="left">
			<div class="footer-buss">&copy; 2014 ??? Services</div>
		</span>
		
		<a href="http://www.???.com.au/">Web Design</a> by ??? Australia
	</div><!-- Footer End -->
</div><!-- Footer Container End -->
</div><!-- Site Container End -->
</body>
</html>
