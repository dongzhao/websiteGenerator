<div class="bannerCon">
  <div id="wrapper" class="clearfloat">
    <div class="content_top">

<div class="widget slider widget0"><!-- Slider Start -->
<script type="text/javascript" src="js/slideshow.js"></script>
<div id="slider-container">

<div id="slider-wrapper" class="slider" style="width:100%;height:auto;max-height:390;overflow: hidden;" >

<div id="slider" class="nivoSlider">
<#list slideImageInfo?keys as key>
  <img src="images/slider/${key}.html?src=/images/slider/&amp;w=950&amp;h=390&amp;zc=1" title="#${key}" />
</#list>
</div>

<#list slideImageInfo?keys as key>
<div id="${key}" class="nivo-html-caption">${slideImageInfo.get(key)}</div>
</#list>

</div><!-- Slider Wrapper End -->
</div><!-- Slider Container End -->
</div></div>  </div>
</div>
