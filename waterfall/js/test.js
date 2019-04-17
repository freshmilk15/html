var json = { 
    data:[ 
        {name:'花瓣小小裙花瓣',price:'128',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_01.jpg'}, 
        {name:'时尚牛仔短裤',price:'298',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_02.jpg'}, 
        {name:'白色婚纱',price:'668',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_03.jpg'}, 
        {name:'绿色防晒衣',price:'218',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_04.jpg'}, 
        {name:'格纹小短裙',price:'88',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_05.jpg'}, 
        {name:'复古旗袍',price:'128',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_06.jpg'}, 
        {name:'花瓣小小裙花瓣',price:'128',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_07.jpg'}, 
        {name:'时尚牛仔短裤',price:'298',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_08.jpg'}, 
        {name:'白色婚纱',price:'668',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_09.jpg'}, 
        {name:'绿色防晒衣',price:'218',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_10.jpg'}, 
        {name:'格纹小短裙',price:'118',details:'质量超好特别的舒适，夏天首选。',src:'../images/temporary/img_11.jpg'} 
    ] 
} 

for(var i=0;i<json.data.length;i++){ 
    var chtml = '<li><p class="product_picture"><img src="'+json.data[i].src+'"></p>' 
            +'<p class="product_np"><a>'+json.data[i].name+'</a><a>￥'+json.data[i].price+'</a></p>' 
            +'<p class="product_ie">'+json.data[i].details+'</p></li>' 
 
    if($('.BoxLeft').height() < $('.BoxRight').height()){ 
        $('.BoxLeft').append(chtml); 
    }else{ 
        $('.BoxRight').append(chtml); 
    } 
} 
