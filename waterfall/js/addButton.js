
    mui.init();
   /* document.getElementById("icon-add").addEventListener('tap', function() {
        mui.plusReady(function() {
            var nwating = plus.nativeUI.showWaiting(); //显示原生等待框
            var webview_sub = plus.webview.create(
                '../html/itemAdd.html',
                'itemAdd', 
                {}, 
                {
                    name: 'davis'
                }
            ); //后台创建webview并打开页面
            webview_sub.addEventListener('loaded', function() {
                nwating.close(); //关闭等待框
                webview_sub.show('slide-in-right', 150); //把新的webview窗口显示出来
            }, false);
        });
    })*/

document.getElementById("icon-add").addEventListener('tap', function() {
mui.openWindow({
    url:'../html/itemAdd.html',
    id:'itemAdd',
 });
}
)