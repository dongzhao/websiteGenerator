<div id="wrapper" class="clearfloat">
<div class="content-middle clearfloat">
  <div class="heading">
	  	  <h1>${title}</h1>
      </div><!-- .heading -->

  <div class="content clearfloat">
	  ${description}. <br />
<table border="0" cellspacing="10">
<tbody>
<tr>
<#list imageInfos as imageInfo>
<td><a href="${imageInfo.navigationName}/index.html"><img border="0" src="images/${imageInfo.imageName}" height="${imageInfo.imageHeight}" width="${imageInfo.imageWidth}" /></a></td>
</#list>
</tr>
</tbody>
</table>
  </div><!-- .content -->

</div><!-- .content-middle -->
</div><!-- Wrapper End -->
