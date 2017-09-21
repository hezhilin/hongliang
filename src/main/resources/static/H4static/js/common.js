//CommonFuns.activeMenu="anti";
var menus = [ {
	code : "mhgl",
	name : "门户管理",
	link : "#",
	linkType : ""

}, {
	code : "zygl",
	name : "资源管理",
	link : "zygl-js.html",
	linkType : "",
	child : [ {
		name : "资源检索",
		code : "js",
		link : "zygl-js.html",
		linkType : "",
	}, {
		name : "资源维护",
		code : "zywh",
		link : "zygl-js.html",
		linkType : ""
	}, {
		name : "资源审核",
		code : "zysh",
		link : "zygl-js.html",
		linkType : ""
	}, {
		name : "下架回收",
		code : "xjhs",
		link : "zygl-js.html",
		linkType : ""
	}, {
		name : "发布设置",
		code : "fbsz",
		link : "zygl-js.html",
		linkType : ""
	}, {
		name : "批量导入",
		code : "pldr",
		link : "zygl-js.html",
		linkType : ""
	}, {
		name : "导出备份",
		code : "dcbf",
		link : "zygl-js.html",
		linkType : ""
	}, {
		name : "来源管理",
		code : "lygl",
		link : "zygl-js.html",
		linkType : ""
	}, {
		name : "资源统计",
		code : "zytj",
		link : "zygl-js.html",
		linkType : ""
	} ]
}, {
	code : "tkgl",
	name : "题库管理",
	link : "tkgl-tm.html",
	linkType : "",
	child : [ {
		name : "题目管理",
		code : "tm",
		link : "tkgl-tm.html",
		linkType : ""
	}, {
		name : "试卷管理",
		code : "sjgl",
		link : "tkgl-sjgl.html",
		linkType : ""
	}, {
		name : "标签管理",
		code : "bqgl",
		link : "tkgl-bqgl.html",
		linkType : ""
	}, {
		name : "题库管理",
		code : "tkgl",
		link : "tkgl-tkgl.html",
		linkType : ""
	} ]
}, {
	code : "yygl",
	name : "应用管理",
	link : "yygl-xxkkgl.html",
	linkType : "",
	child : [ {
		name : "学校开课管理",
		code : "xxkkgl",
		link : "yygl-xxkkgl.html",
		linkType : "",
	}, {
		name : "课节统计管理",
		code : "lskjtjgl",
		link : "yygl-xxkkgl.html",
		linkType : ""
	}, {
		name : "作业统计管理",
		code : "zytjgl",
		link : "yygl-xxkkgl.html",
		linkType : ""
	}, {
		name : "答疑统计管理",
		code : "dytjgl",
		link : "yygl-xxkkgl.html",
		linkType : ""
	}, {
		name : "个人资源建设统计",
		code : "grzyjstj",
		link : "yygl-xxkkgl.html",
		linkType : ""
	}, {
		name : "学生自主学习统计",
		code : "xszzxxtj",
		link : "yygl-xxkkgl.html",
		linkType : ""
	} ]
}, {
	code : "kjgl",
	name : "空间管理",
	link : "kjgl-jmhf.html",
	linkType : "",
	child : [ {
		name : "界面换肤",
		code : "jmhf",
		link : "kjgl-jmhf.html",
		linkType : ""
	}, {
		name : "日志设置",
		code : "rzsz",
		link : "kjgl-rzsz.html",
		linkType : ""
	}, {
		name : "网盘设置",
		code : "wpsz",
		link : "kjgl-wpsz.html",
		linkType : ""
	}, {
		name : "开始,停止",
		code : "kstz",
		link : "kjgl-kstz.html",
		linkType : ""
	}, {
		name : "统计",
		code : "tj",
		link : "kjgl-tj.html",
		linkType : ""
	}, {
		name : "查询",
		code : "cx",
		link : "kjgl-cx.html",
		linkType : ""
	}, {
		name : "数据备份",
		code : "sjbf",
		link : "kjgl-sjbf.html",
		linkType : ""	
} ]	
}, {
	code : "ggdm",
	name : "公共代码",
	link : "ggdm-xn.html",
	linkType : "",
	child : [ {
		name : "学年",
		code : "xn",
		link : "ggdm-xn.html",
		linkType : ""
	}, {
		name : "学期",
		code : "xq",
		link : "ggdm-xq.html",
		linkType : ""
//		child : [{name:"上学期",code:"sxq",link:"ggdm-xq.html",linkType:""},{name:"下学期",code:"xxq",link:"ggdm-xq-xxq.html",linkType:""}]
	}, {
		name : "学段",
		code : "xd",
		link : "ggdm-xd.html",
		linkType : ""
	}, {
		name : "区划",
		code : "qh",
		link : "ggdm-qh.html",
		linkType : ""
	}, {
		name : "学科",
		code : "xk",
		link : "ggdm-xk.html",
		linkType : ""
	}, {
		name : "年级",
		code : "nj",
		link : "ggdm-nj.html",
		linkType : ""
	}, {
		name : "版本",
		code : "bb",
		link : "ggdm-bb.html",
		linkType : ""
	}, {
		name : "章节",
		code : "zj",
		link : "ggdm-zj.html",
		linkType : ""
	}, {
		name : "知识点",
		code : "zsd",
		link : "ggdm-zsd.html",
		linkType : ""
	}, {
		name : "资源类型",
		code : "zylx",
		link : "ggdm-zylx.html",
		linkType : ""
	}, {
		name : "资源格式",
		code : "zygs",
		link : "ggdm-zygs.html",
		linkType : ""
	}, {
		name : "资源来源",
		code : "zyly",
		link : "ggdm-zyly.html",
		linkType : ""
	}, {
		name : "资源公开",
		code : "zygk",
		link : "ggdm-zygk.html",
		linkType : ""
	}, {
		name : "试题题型",
		code : "sttx",
		link : "ggdm-sttx.html",
		linkType : ""
	}, {
		name : "试题难度",
		code : "stnd",
		link : "ggdm-stnd.html",
		linkType : ""
	}, {
		name : "试卷类型",
		code : "sjlx",
		link : "ggdm-sjlx.html",
		linkType : ""
	} ]
}, {
	code : "xtgl",
	name : "系统管理",
	link : "xtgl-zzjggl.html",
	linkType : "",
	child : [ {
		name : "组织机构",
		code : "zzjggl",
		link : "xtgl-zzjggl.html",
		linkType : ""
	}, {
		name : "用户管理",
		code : "yhgl",
		link : "xtgl-yhgl.html",
		linkType : ""
	}, {
		name : "角色管理",
		code : "yhjsgl",
		link : "xtgl-yhjsgl.html",
		linkType : ""
	}, {
		name : "权限管理",
		code : "qxgl",
		link : "xtgl-qxgl.html",
		linkType : ""
	}, {
		name : "日志管理",
		code : "rzgl",
		link : "xtgl-rzgl.html",
		linkType : ""
	}, {
		name : "审计管理",
		code : "sjgl",
		link : "xtgl-sjgl.html",
		linkType : ""
	}, 
	]
} ];
var initMenu = function() {
	$("#top-nav ul").html("");
	var tpl = $("<li><a href=\"\">菜单模板</a></li>");
	$(menus).each(function(i, m) {
		var nav = tpl.clone();
		nav.find("a").text(m.name).attr("code", m.code).prop("href", m.link);
		$("#top-nav ul").append(nav);
	});

};
var initLeftBar = function(leftBar,barCode) {
    var leftBarUl=$("div.sidebar-nav ul#main_menu");
	$(leftBarUl).find("li.nav_li").remove();
	var tpl = $("<li class='nav_li'><a href=\"\"><i class=\"icon-chevron-right\"></i><span>学段</span></a></li>");
	$(leftBar).each(function(i,n){
		var nav = tpl.clone();
		nav.attr("code", n.code).find("a").prop("href", n.link).find("span").html(n.name);
		if(n.child){
			initChildLeftBar(nav,n.child,n.code==barCode);
		}
		
		
		$(leftBarUl).append(nav);
		
	});
	activeLeftBar(barCode);
};
var initChildLeftBar = function(li,childLeftBar,isOpen) {
	li.find("a").prop("href", "#");
	li.addClass("accordion");
	var leftBarUl=$("<ul class=\"nav nav-pills nav-stacked\" style=\"display: none;\"></ul>");
	var tpl = $("<li><a href=''>&nbsp;&nbsp;&nbsp;&nbsp;<i class=\"icon-forward\"></i><span>子菜单</span></a></li>");
	$(childLeftBar).each(function(i,n){
		var nav = tpl.clone();
		nav.attr("code", n.code).find("a").prop("href", n.link).find("span").html(n.name);
		$(leftBarUl).append(nav);
	});
	$(li).find('a').click(function(e) {
		e.preventDefault();
		var $ul = $(this).siblings('ul');
		var $li = $(this).parent();
		if ($ul.is(':visible')){
			$(li).find("> i").removeClass("icon-chevron-down").addClass("icon-chevron-right");
			$li.removeClass('active');
		}
		else{
			$(li).find("> i").removeClass("icon-chevron-right").addClass("icon-chevron-down");
			$li.addClass('active');
		}
		$ul.slideToggle();
	});
	//$('.accordion li.active:first').parents('ul').slideDown();
	if(isOpen){
		//icon-chevron-down
		$(li).find("> i").removeClass("icon-chevron-right").addClass("icon-chevron-down");
		leftBarUl.slideDown();
	};
	
	
	$(li).append(leftBarUl);
//	activeLeftBar(barCode);
};



//<li class="accordion">
//<a href="#"><i class="icon-plus"></i><span>二级菜单示例</span></a>
//<ul class="nav nav-pills nav-stacked" style="display: none;">
//<li><a href="#">子菜单1</a></li>
//</ul>
//</li> 

var activeLeftBar=function(barCode){
	var li=$("div.sidebar-nav ul#main_menu").find("li.nav_li[code='"+barCode+"']");
	li.find("> a").css("background-color","#42A1D9");
	li.find("> a").css("color","white");
	li.hover(function(){
		li.find("> a").css("background-color","white");
		$(this).find("> a").css("color","#2071a1");
	},function(){
		li.find("> a").css("background-color","#42A1D9");
		$(this).find("> a").css("color","white");
	});

};

window.activeMenu = function(code,barCode) {
	$("#top-nav ul").find("a[code='" + code + "']").addClass("cur");
	$(menus).each(function(i, m) {
		if(m.code==code){
			initLeftBar(m.child,barCode);	
		}
	});
};
$(function($) {
	initMenu();
	$(".btn-addModel").click(function(){
		showPopup('#addModal');
	});
	$(".btn-query").click(function(){
		showQueryPopup('#queryModal',this);
	});
	$(".btn-update").click(function(){
		showPopup('#updateModal');
	});
	$(".btn-del").click(function(){
		showPopup('#delModal');
	});
	$(".btn-updateState").click(function(){
		showPopup('#updateStateModal');
	});
});

/*弹出框*/
var showPopup=function(id){
//	e.preventDefault();
	$(id).modal('show');
};
/*查看详细信息弹出框*/
var showQueryPopup=function(id,i){
//	var query='序号：<input type="text" name="number" readonly="readonly"><br>';
//	e.preventDefault();
	$(id).modal('show');
	var th=$(i).parents("table").find("th");
	var td=$(i).parents("tr").find("td");
	$(id).find(".modal-body").html("").css("padding-left","30px");
	for(var no=0;no<th.size()-1;no++){
		$(id).find(".modal-body").append(th.eq(no).text()+"："+td.eq(no).html()+"<br><br>");
	}
};

$(function($) {
});
