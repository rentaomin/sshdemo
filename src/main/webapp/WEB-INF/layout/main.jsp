<%@ include file="/WEB-INF/common/common-tag.jspf"%>
<!doctype html>
<html class="no-js">
 <%@ include file="/WEB-INF/common/common-js.jspf"%>
<%-- 被装饰页面的head --%>
<decorator:head />

<body class="hold-transition skin-blue sidebar-mini fixed">
	<div class="wrapper">
	
		<header id="1" class="main-header">
			<%@ include file="/WEB-INF/layout/main-header.jspf"%>
		</header>
		
		<!-- Left side column. contains the logo and sidebar -->
		<aside id="2" class="main-sidebar">
			<%@ include file="/WEB-INF/layout/main-sidebar.jspf"%>
		</aside>
		
		<div id="3" class="content-wrapper" >
			<!-- Main content -->
			<section class="content">
				<!-- 被装饰页面的body -->
				<decorator:body />
			</section>
		</div >
		
	</div>
</body>
</html>
