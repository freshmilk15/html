// 拍照获取图片
function getImage() {
    var c = plus.camera.getCamera();
    c.captureImage(function(e) {
        plus.io.resolveLocalFileSystemURL(e, function(entry) {
        	//var imgSrc = entry.toLocalURL() + "?version=" + new Date().getTime(); //拿到图片路径
            // 其他操作,比如预览展示
            console.log(e);
            /*console.log(entry.toLocalURL());
            console.log(imgSrc);*/
            var path = entry.toLocalURL();
            console.log(path);
            $(".headimg")[0].src = path;
            
                     
        }, function(e) {
            console.log("读取拍照文件错误：" + e.message);
        });
    }, function(s) {
        console.log("error" + s);
    }, {
        filename: "_doc/camera/"
    })
}


// 从相册中选择图片 
function galleryImg(){
	// 从相册中选择图片
    plus.gallery.pick( function(e){
    	
	    	var fileSrc = e.files[0];
            // 其他操作,比如预览展示
            $(".headimg")[0].src = fileSrc;
            
            
    	
    }, function ( e ) {
    	console.log( "取消选择图片" );
    },{
    	filter: "image",
    	multiple: true,
    	maximum: 1,
    	system: false,
    	onmaxed: function() {
    		plus.nativeUI.alert('最多只能选择1张图片');
    	}
    });
}


// 上传的方法
function upload(id){
   	//MicroTaskGUID = common.guid();
   	
   	
   	var url = localStorage.getItem("serverUrl")+"/Image/uploadItem"   	
   	//var files = mui(".headimg"); // 要上传的 img 标签
   	var files = document.getElementById('headimg');//找到图片
   	var text = document.getElementById('tip').value;//找到图片说明
   	
	
	var wt=plus.nativeUI.showWaiting();

    var task = plus.uploader.createUpload(url,
        {method:"POST"},
        function(t,status){ //上传完成
            if(status==200){
            	console.log("上传成功："+t.responseText);
            	wt.close(); //关闭等待提示按钮
            }else{
                console.log("上传失败："+status);
                wt.close(); //关闭等待提示按钮
            }
        }
    );
    //添加其他参数
	task.addData("tip",text);
	task.addData("id",id);
    // 页面中要上传的 图片路径
    task.addFile(files.src,{key:"file"});
    task.start();
	
}







			           
			