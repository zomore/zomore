<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
		<meta name="author" content="www.divmb.com">

		<link rel="shortcut icon" href="../assets/images/favicon_1.ico">

		<title>zomore</title>
		
		<link href="../assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet" type="text/css" />

		    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="../assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="../assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="../assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="../assets/css/responsive.css" rel="stylesheet" type="text/css" />
        <link href="../assets/plugins/switchery/dist/switchery.min.css" rel="stylesheet" />

        <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
       <!-- <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>-->
        <![endif]-->
        <link href="../assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
        <link href="../assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet">
        <link href="../assets/plugins/clockpicker/dist/jquery-clockpicker.min.css" rel="stylesheet">
        <link href="../assets/css/menu.css" rel="stylesheet" type="text/css">
        <link href="../assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">
        <script src="../assets/js/modernizr.min.js"></script>

	</head>

	<body class="fixed-left">

		<!-- Begin page -->
		<div id="wrapper" class="forced enlarged">

            <!-- Top Bar Start -->
            <div class="topbar">

                <!-- LOGO -->
                <div class="topbar-left">
                    <div class="text-center">
                        <a href="index.html" class="logo"><i class="icon-magnet icon-c-logo"></i><span>Ub<i class="md md-album"></i>ld</span></a>
                    </div>
                </div>

                <!-- Button mobile view to collapse sidebar menu -->
                <div class="navbar navbar-default" role="navigation">
                    <div class="container">
                        <div class="">
                            <div class="pull-left">
                                <button class="button-menu-mobile open-left">
                                    <i class="ion-navicon"></i>
                                </button>
                                <span class="clearfix"></span>
                            </div>

                            <form role="search" class="navbar-left app-search pull-left hidden-xs">
			                     <input type="text" placeholder="搜索..." class="form-control">
			                     <a href=""><i class="fa fa-search"></i></a>
			                </form>


                            <ul class="nav navbar-nav navbar-right pull-right">
                                <li class="dropdown hidden-xs">
                                    <a href="#" data-target="#" class="dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="true">
                                        <i class="icon-bell"></i> <span class="badge badge-xs badge-danger">3</span>
                                    </a>
                                    <ul class="dropdown-menu dropdown-menu-lg">
                                        <li class="notifi-title"><span class="label label-default pull-right">New 3</span>Notification</li>
                                        <li class="list-group nicescroll notification-list">
                                           <!-- list item-->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-diamond fa-2x text-primary"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">A new order has been placed A new order has been placed</h5>
                                                    <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                           <!-- list item-->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-cog fa-2x text-custom"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">New settings</h5>
                                                    <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                           <!-- list item-->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-bell-o fa-2x text-danger"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">Updates</h5>
                                                    <p class="m-0">
                                                        <small>There are <span class="text-primary font-600">2</span> new updates available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                           <!-- list item-->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-user-plus fa-2x text-info"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">New user registered</h5>
                                                    <p class="m-0">
                                                        <small>You have 10 unread messages</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                           <!-- list item-->
                                           <a href="javascript:void(0);" class="list-group-item">
                                              <div class="media">
                                                 <div class="pull-left p-r-10">
                                                    <em class="fa fa-diamond fa-2x text-primary"></em>
                                                 </div>
                                                 <div class="media-body">
                                                    <h5 class="media-heading">A new order has been placed A new order has been placed</h5>
                                                    <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                 </div>
                                              </div>
                                           </a>

                                           <!-- list item-->
                                            <a href="javascript:void(0);" class="list-group-item">
                                                <div class="media">
                                                    <div class="pull-left p-r-10">
                                                     <em class="fa fa-cog fa-2x text-custom"></em>
                                                    </div>
                                                    <div class="media-body">
                                                      <h5 class="media-heading">New settings</h5>
                                                      <p class="m-0">
                                                        <small>There are new settings available</small>
                                                    </p>
                                                    </div>
                                              </div>
                                           </a>
                                        </li>
                                        <li>
                                            <a href="javascript:void(0);" class="list-group-item text-right">
                                                <small class="font-600">See all notifications</small>
                                            </a>
                                        </li>
                                    </ul>
                                </li>
                                <li class="hidden-xs">
                                    <a href="#" id="btn-fullscreen" class="waves-effect waves-light"><i class="icon-size-fullscreen"></i></a>
                                </li>
                                <li class="hidden-xs">
                                    <a href="#" class="right-bar-toggle waves-effect waves-light"><i class="icon-settings"></i></a>
                                </li>
                                <li class="dropdown">
                                    <a href="" class="dropdown-toggle profile" data-toggle="dropdown" aria-expanded="true"><img src="../assets/images/users/avatar-1.jpg" alt="user-img" class="img-circle"> </a>
                                    <ul class="dropdown-menu">
                                        <li><a href="javascript:void(0)"><i class="ti-user m-r-5"></i> Profile</a></li>
                                        <li><a href="javascript:void(0)"><i class="ti-settings m-r-5"></i> Settings</a></li>
                                        <li><a href="javascript:void(0)"><i class="ti-lock m-r-5"></i> Lock screen</a></li>
                                        <li><a href="javascript:void(0)"><i class="ti-power-off m-r-5"></i> Logout</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <!--/.nav-collapse -->
                    </div>
                </div>
            </div>
            <!-- Top Bar End -->


<!-- ========== Left Sidebar Start ========== -->

            <div class="left side-menu">
                <div class="sidebar-inner slimscrollleft">
                    
                    <!--- Divider -->
                    <div id="sidebar-menu">
                        <ul>
                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><font class="hidetxt">商品</font></a>
                             <ul class="list-unstyled">
                              <div class="title">商品</div>
                                <li><a href="${pageContext.request.contextPath}/superAdmin/findAll.do">管理员管理</a></li>
                                <li><a href="${pageContext.request.contextPath}/superAdmin/findAllShop.do">商铺管理</a></li>
                                <li><a href="flot-chart.html">Flot Chart</a></li>
                                <li><a href="peity-chart.html">Peity Charts</a></li>
                                <li><a href="charts-sparkline.html">Sparkline Charts</a></li>
                                <li><a href="chart-radial.html">Radial charts</a></li>
                                <li><a href="other-chart.html">Other Chart</a></li>
                            </ul> 
              </li>

                            <li class="has_sub">
                               <a href="#" class="waves-effect waves-light"><font class="hidetxt">库存</font><span class="pull-right"><i class="md md-add"></i></span></a>
                                                              
                  <ul class="list-unstyled">
                  <div class="title">
                    库存
                  </div>
                                   <li><a href="morris-chart.html">Morris Chart</a></li>
                                   <li><a href="chartjs.html">Chartjs</a></li>
                                   <li><a href="flot-chart.html">Flot Chart</a></li>
                                   <li><a href="peity-chart.html">Peity Charts</a></li>
                                   <li><a href="charts-sparkline.html">Sparkline Charts</a></li>
                                   <li><a href="chart-radial.html">Radial charts</a></li>
                                   <li><a href="other-chart.html">Other Chart</a></li>
                               </ul> 
                 
                           </li>

                           

                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><font class="hidetxt">数据</font><span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="typography.html">Typography</a></li>
                                    <li><a href="buttons.html">Buttons</a></li>
                                    <li><a href="panels.html">Panels</a></li>
                                    <li><a href="checkbox-radio.html">Checkboxs-Radios</a></li>
                                    <li><a href="tabs-accordions.html">Tabs &amp; Accordions</a></li>
                                    <li><a href="modals.html">Modals</a></li>
                                    <li><a href="bootstrap-ui.html">BS Elements</a></li>
                                    <li><a href="progressbars.html">Progress Bars</a></li>
                                    <li><a href="notification.html">Notification</a></li>
                                    <li><a href="sweet-alert.html">Sweet-Alert</a></li>
                                </ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><font class="hidetxt">会员</font><span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="grid.html">Grid</a></li>
                                    <li><a href="portlets.html">Portlets</a></li>
                                    <li><a href="widgets.html">Widgets</a></li>
                                    <li><a href="nestable-list.html">Nesteble</a></li>
                                    <li><a href="ui-sliders.html">Sliders </a></li>
                                    <li><a href="gallery.html">Gallery </a></li>
                                    <li><a href="pricing.html">Pricing Table </a></li>
                                </ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><font class="hidetxt">员工</font><span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="material-icon.html">Material Design</a></li>
                                    <li><a href="ion-icons.html">Ion Icons</a></li>
                                    <li><a href="font-awesome.html">Font awesome</a></li>
                                </ul>
                            </li>
                            
                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><font class="hidetxt">营销</font><span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="form-elements.html">General Elements</a></li>
                                    <li><a href="form-validation.html">Form Validation</a></li>
                                    <li><a href="form-advanced.html">Advanced Form</a></li>
                                    <li><a href="form-wizard.html">Form Wizard</a></li>
                                    <li><a href="form-editor.html">WYSIWYG Editor</a></li>
                                    <li><a href="code-editor.html">Code Editors</a></li>
                                    <li><a href="form-uploads.html">Multiple File Upload</a></li>
                                    <li><a href="form-xeditable.html">X-editable</a></li>
                                </ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><font class="hidetxt">货流</font><span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="tables.html">Basic Tables</a></li>
                                    <li><a href="table-datatable.html">Data Table</a></li>
                                    <li><a href="tables-editable.html">Editable Table</a></li>
                                    <li><a href="responsive-table.html">Responsive Table</a></li>
                                </ul>
                            </li>

                            <li class="has_sub">
                                <a href="#" class="waves-effect waves-light"><font class="hidetxt">设置</font><span class="pull-right"><i class="md md-add"></i></span></a>
                                <ul class="list-unstyled">
                                    <li><a href="morris-chart.html">Morris Chart</a></li>
                                    <li><a href="chartjs.html">Chartjs</a></li>
                                    <li><a href="flot-chart.html">Flot Chart</a></li>
                                    <li><a href="peity-chart.html">Peity Charts</a></li>
                                    <li><a href="charts-sparkline.html">Sparkline Charts</a></li>
                                    <li><a href="chart-radial.html">Radial charts</a></li>
                                    <li><a href="other-chart.html">Other Chart</a></li>
                                </ul>
                            </li>

                           

                           

                        
                        </ul>
                        <div class="clearfix"></div>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
            <!-- Left Sidebar End --> 

<!-- ============================================================== -->
<!-- Start right Content here -->
<!-- ============================================================== -->
			<div class="content-page">
				<!-- Start content -->
				<div class="content">
					<div class="container">

						<!-- Page-Title -->
						<div class="row">
							<div class="col-sm-12">
								<p style="font-size: 17px;">会员资料</p>
							</div>
						</div>
							
<!--Custom Toolbar-->
<!--===================================================-->
						<div class="row">
							<div class="col-sm-12">
								<div class="card-box">
                 <div class="col-sm-8" style="margin-bottom: 10px;">
									<div class="button-list">
                   <!-- Full width modal -->
                   <button class="btn btn-primary waves-effect waves-light" data-toggle="modal" data-target="#con-close-modal">新增商铺</button>
                   <div class="fileupload btn btn-primary waves-effect waves-light">
                      <span>导入</span>
                        <input type="file" class="upload">
                      </div>
                   <button class="btn btn-primary waves-effect waves-light" data-toggle="modal" data-target="#full-width-modal">导出</button>
                   <button onclick="printout()" class="btn btn-primary waves-effect waves-light" data-toggle="modal" data-target="#full-width-modal" value="">打印</button>
                   </div>
                  </div>
                  <div class="col-sm-1" style="margin-bottom: 10px;">
                   <div class="btn-group">
                    <button type="button" class="btn btn-info dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false">启用<span class="caret"></span></button>
                    <ul class="dropdown-menu" role="menu">
                       <li><a href="#">Action</a></li>
                       <li><a href="#">Another action</a></li>
                       <li><a href="#">Something else here</a></li>
                       <li class="divider"></li>
                       <li><a href="#">Separated link</a></li>
                     </ul>
                    </div>
                  </div>
                  <div class="col-sm-2">
                    <form role="form">
                      <div class="input-group">
                        <input type="text" id="example-input1-group2" name="example-input1-group2" class="form-control" placeholder="条码/名称/拼音码">
                        <span class="input-group-btn">
                          <button type="button" class="btn waves-effect waves-light btn-primary" style="padding: 6px 12px">搜索</button>
                        </span>
                      </div>
                    </form>
                  </div>
                  <div class="col-sm-1">
                     <div class="button-list">
                      <!-- Small modal -->
                       <button class="btn btn-primary waves-effect waves-light" data-toggle="modal" data-target="#con-close-modal1">高级搜索</button>
                     </div>
                  </div>

									<table id="demo-custom-toolbar"  data-toggle="table" class="table-bordered table table-hover">
										<thead>
											<tr>
												<th data-field="state" data-checkbox="true"></th>
                                                <th scope="col">用户名</th>
                                                <th scope="col">注册时间</th>
                                                <th scope="col">邮箱</th>
                                                <th scope="col">电话</th>
                                                <th scope="col">姓名</th>
                                                <th scope="col">地址</th>
                                                <th scope="col">店铺名称</th>
                                                <th scope="col">所属行业</th>
                                                <th scope="col">到期时间</th>
                                                <th scope="col">角色名称</th>
                                                <th scope="col">操作</th>
										</thead>
										
										<tbody>
                                        <c:forEach items="${headShopList}" var="head">
                                            <tr>
                                                <td></td>
                                                <td>${head.username }</td>
                                                <td>${head.registrationTimeStr}</td>
                                                <td>${head.mail }</td>
                                                <td>${head.phoneNumber }</td>
                                                <td>${head.name }</td>
                                                <td>${head.address}</td>
                                                <td>${head.shopName}</td>
                                                <td>${head.industry}</td>
                                                <td>${head.dueTimeStr}</td>
                                                <td>${head.roleStr}</td>
                                                <td><a  href="${pageContext.request.contextPath}/superAdmin/findShopById.do?headId=${head.headId}" class="btn bg-olive btn-xs" <%--data-target="#con-close-modal1"  data-toggle="modal"--%>>修改</a></td>
                                            </tr>
                                        </c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						
                    </div> <!-- container -->
                </div> <!-- content -->
            </div>
<!-- ============================================================== -->
<!-- End Right content here -->
<!-- ============================================================== -->


            <!-- Right Sidebar -->
            <div class="side-bar right-bar nicescroll">
                <h4 class="text-center">Chat</h4>
                <div class="contact-list nicescroll">
                    <ul class="list-group contacts-list">
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-1.jpg" alt="">
                                </div>
                                <span class="name">Chadengle</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-2.jpg" alt="">
                                </div>
                                <span class="name">Tomaslau</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-3.jpg" alt="">
                                </div>
                                <span class="name">Stillnotdavid</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-4.jpg" alt="">
                                </div>
                                <span class="name">Kurafire</span>
                                <i class="fa fa-circle online"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-5.jpg" alt="">
                                </div>
                                <span class="name">Shahedk</span>
                                <i class="fa fa-circle away"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-6.jpg" alt="">
                                </div>
                                <span class="name">Adhamdannaway</span>
                                <i class="fa fa-circle away"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-7.jpg" alt="">
                                </div>
                                <span class="name">Ok</span>
                                <i class="fa fa-circle away"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-8.jpg" alt="">
                                </div>
                                <span class="name">Arashasghari</span>
                                <i class="fa fa-circle offline"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-9.jpg" alt="">
                                </div>
                                <span class="name">Joshaustin</span>
                                <i class="fa fa-circle offline"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                        <li class="list-group-item">
                            <a href="#">
                                <div class="avatar">
                                    <img src="../assets/images/users/avatar-10.jpg" alt="">
                                </div>
                                <span class="name">Sortino</span>
                                <i class="fa fa-circle offline"></i>
                            </a>
                            <span class="clearfix"></span>
                        </li>
                    </ul>  
                </div>
            </div>
            <!-- /Right-bar -->

            <!-- 新增商品资料弹窗 -->
            <!-- ============================================================== -->
            <form action="${pageContext.request.contextPath}/superAdmin/saveAdmin.do" method="get">
                <div id="con-close-modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                <h4 class="modal-title">会员资料</h4>
                            </div>

                            <div class="modal-body">
                                <div class="row">
                                    <div class="col-md-10">
                                        <div class="form-group">
                                            <label for="field-1" class="control-label">是否启用</label>
                                        </div>
                                    </div>
                                    <div class="col-md-1">
                                        <div class="switchery-demo">
                                            <input type="checkbox" checked data-plugin="switchery" data-color="#34d3eb" data-size="small"/>
                                        </div>
                                    </div>
                                </div>
                                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                                <div class="row">
                                    <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                    <div class="col-md-11">
                                        <div class="input-group">
                                            <span class="input-group-addon">用户名:</span>
                                            <input class="form-control" type="text" name="username" id="username" placeholder="请输入用户名">
                                        </div></br>
                                    </div>
                                </div>
                                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                                <div class="row">
                                    <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                    <div class="col-md-11">
                                        <div class="input-group">
                                            <span class="input-group-addon">密码:</span>
                                            <input class="form-control" type="password" name="password" id="password" placeholder="请输入密码">
                                        </div></br>
                                    </div>
                                </div>
                                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                                <div class="row">
                                    <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <span class="input-group-addon">Email:</span>
                                            <input class="form-control"  type="text" name="mail" id="mail" placeholder="请输入邮箱">
                                        </div>
                                    </div>
                                    <div class="col-md-5">
                                        <div class="input-group">
                                            <span class="input-group-addon">姓名:</span>
                                            <input class="form-control" itype="text" name="name" id="name" placeholder="请输入姓名">
                                        </div>
                                    </div>
                                </div></br>
                                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                                <div class="row">
                                    <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                    <div class="col-md-6">
                                        <div class="input-group">
                                            <span class="input-group-addon">店铺名称:</span>
                                            <input class="form-control" ype="text" name="shopName" id="shopName" placeholder="请输入店铺名称">
                                        </div>
                                    </div>
                                    <div class="col-md-5">
                                        <div class="input-group">
                                            <span class="input-group-addon">手机号:</span>
                                            <input class="form-control" type="text" name="phoneNumber" id="phoneNumber" placeholder="请输入手机号">
                                        </div>
                                    </div>
                                </div></br>
                                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                                <div class="row">
                                    <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                    <div class="col-md-11">
                                        <div class="input-group">
                                            <span class="input-group-addon">注册日期:</span>
                                            <input class="form-control" type="date" name="registrationTime" id="registrationTime" placeholder="请输入注册日期">
                                        </div>
                                    </div>
                                </div></br>
                                <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="col-md-8">
                                            <div class="input-group">
                                                <span class="input-group-addon">到期日期:</span>
                                                <input class="form-control" ype="date" name="dueTime" id="dueTime" placeholder="请输入到期时间">
                                            </div></br>
                                            <div class="input-group">
                                                <span class="input-group-addon">地址:</span>
                                                <input class="form-control" type="text" name="address" id="address" placeholder="请输入地址">
                                            </div></br>
                                            <div class="input-group">
                                                <span class="input-group-addon">所属行业:</span>
                                                <input class="form-control" type="text" name="industry" id="industry" placeholder="请输入所属行业"">
                                            </div></br>
                                            <div class="input-group">
                                                <span class="input-group-addon">角色名称:</span>
                                                <select name="role">
                                                    <option value="1">连锁店</option>
                                                    <option value="2">直营店</option>
                                                    <option value="3">加盟店</option>
                                                    <option value="4">单店</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <img src="assets/images/small/img3.jpg" alt="image" class="img-responsive img-thumbnail" width="200"/>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="border-bottom: 2px dashed #e5e5e5;"></div></br><div>
                        </div>



                            <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                            <button type="button" class="btn btn-info waves-effect waves-light">保存</button>
                        </div>
                    </div>
                </div>
        </div><!-- /.modal -->
        </form>
        <!-- ============================================================== -->
        <!-- 修改商品资料弹窗 -->
        <!-- ============================================================== -->
        <form action="${pageContext.request.contextPath}/superAdmin/saveAdmin.do" method="get">
            <div id="con-close-modal1" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                            <h4 class="modal-title">会员资料</h4>
                        </div>

                        <div class="modal-body">
                            <div class="row">
                                <div class="col-md-10">
                                    <div class="form-group">
                                        <label for="field-1" class="control-label">是否启用</label>
                                    </div>
                                </div>
                                <div class="col-md-1">
                                    <div class="switchery-demo">
                                        <input type="checkbox" checked data-plugin="switchery" data-color="#34d3eb" data-size="small"/>
                                    </div>
                                </div>
                            </div>
                            <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                            <div class="row">
                                <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                <div class="col-md-11">
                                    <div class="input-group">
                                        <span class="input-group-addon">用户名:</span>
                                        <input class="form-control" type="text" name="username" id="username" placeholder="请输入用户名">
                                    </div></br>
                                </div>
                            </div>
                            <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                            <div class="row">
                                <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                <div class="col-md-11">
                                    <div class="input-group">
                                        <span class="input-group-addon">密码:</span>
                                        <input class="form-control" type="password" name="password" id="password" placeholder="请输入密码">
                                    </div></br>
                                </div>
                            </div>
                            <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                            <div class="row">
                                <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                <div class="col-md-6">
                                    <div class="input-group">
                                        <span class="input-group-addon">Email:</span>
                                        <input class="form-control"  type="text" name="mail" id="mail" placeholder="请输入邮箱">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">姓名:</span>
                                        <input class="form-control" itype="text" name="name" id="name" placeholder="请输入姓名">
                                    </div>
                                </div>
                            </div></br>
                            <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                            <div class="row">
                                <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                <div class="col-md-6">
                                    <div class="input-group">
                                        <span class="input-group-addon">店铺名称:</span>
                                        <input class="form-control" ype="text" name="shopName" id="shopName" placeholder="请输入店铺名称">
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="input-group">
                                        <span class="input-group-addon">手机号:</span>
                                        <input class="form-control" type="text" name="phoneNumber" id="phoneNumber" placeholder="请输入手机号">
                                    </div>
                                </div>
                            </div></br>
                            <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                            <div class="row">
                                <div class="col-md-1" style="width: 1%;color: #FF0000;padding-top: 2%;">*</div>
                                <div class="col-md-11">
                                    <div class="input-group">
                                        <span class="input-group-addon">注册日期:</span>
                                        <input class="form-control" type="date" name="registrationTime" id="registrationTime" placeholder="请输入注册日期">
                                    </div>
                                </div>
                            </div></br>
                            <div style="border-bottom: 2px dashed #e5e5e5;"></div></br>

                            <div class="row">
                                <div class="col-md-12">
                                    <div class="col-md-8">
                                        <div class="input-group">
                                            <span class="input-group-addon">到期日期:</span>
                                            <input class="form-control" ype="date" name="dueTime" id="dueTime" placeholder="请输入到期时间">
                                        </div></br>
                                        <div class="input-group">
                                            <span class="input-group-addon">地址:</span>
                                            <input class="form-control" type="text" name="address" id="address" placeholder="请输入地址">
                                        </div></br>
                                        <div class="input-group">
                                            <span class="input-group-addon">所属行业:</span>
                                            <input class="form-control" type="text" name="industry" id="industry" placeholder="请输入所属行业"">
                                        </div></br>
                                        <div class="input-group">
                                            <span class="input-group-addon">角色名称:</span>
                                            <select name="role">
                                                <option value="1">连锁店</option>
                                                <option value="2">直营店</option>
                                                <option value="3">加盟店</option>
                                                <option value="4">单店</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <img src="assets/images/small/img3.jpg" alt="image" class="img-responsive img-thumbnail" width="200"/>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div style="border-bottom: 2px dashed #e5e5e5;"></div></br><div>
                    </div>



                        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">取消</button>
                        <button type="button" class="btn btn-info waves-effect waves-light">保存</button>
                    </div>
                </div>
            </div>
            </div><!-- /.modal -->
        </form>
        <!-- ============================================================== -->
                           </div> 
                          </div>
                         <!-- END wrapper -->
    
        <script>
            var resizefunc = [];
        </script>

        <!-- jQuery  -->
        <script src="../assets/js/jquery.min.js"></script>
        <script src="../assets/js/bootstrap.min.js"></script>
        <script src="../assets/js/detect.js"></script>
        <script src="../assets/js/fastclick.js"></script>
        <script src="../assets/js/jquery.slimscroll.js"></script>
        <script src="../assets/js/jquery.blockUI.js"></script>
        <script src="../assets/js/waves.js"></script>
        <script src="../assets/js/wow.min.js"></script>
        <script src="../assets/js/jquery.nicescroll.js"></script>
        <script src="../assets/js/jquery.scrollTo.min.js"></script>
        <script src="../assets/pages/jquery.bs-table.js"></script>
        <!-- Modal-Effect -->
        <script src="../assets/plugins/custombox/dist/custombox.min.js"></script>
        <script src="../assets/plugins/custombox/dist/legacy.min.js"></script>
        <script src="../assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
        <script src="../assets/plugins/switchery/dist/switchery.min.js"></script>
        <script src="../assets/plugins/bootstrap-maxlength/bootstrap-maxlength.min.js" type="text/javascript"></script>
        <script src="../assets/js/jquery.core.js"></script>
        <script src="../assets/js/jquery.app.js"></script>
        <script src="../assets/js/timejquery.js"></script>
        <script src="../assets/js/mjquery.js"></script>

        <script src="../assets/plugins/moment/moment.js"></script>
        <script src="../assets/plugins/timepicker/bootstrap-timepicker.min.js"></script>
        <script src="../assets/plugins/mjolnic-bootstrap-colorpicker/dist/js/bootstrap-colorpicker.min.js"></script>
        <script src="../assets/plugins/bootstrap-datepicker/dist/js/bootstrap-datepicker.min.js"></script>
        <script src="../assets/plugins/clockpicker/dist/jquery-clockpicker.min.js"></script>
        <script src="../assets/plugins/bootstrap-daterangepicker/daterangepicker.js"></script>


	
	</body>
</html>