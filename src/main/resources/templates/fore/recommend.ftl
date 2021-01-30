<!DOCTYPE html>  
<html>  
<head>  
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />  
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
    <title>推荐系统</title>
    <style type="text/css">  
        html{height:100%}  
        body{height:100%;margin:0px;padding:0px}  
        #container{height:100%}  
    </style>  
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=3.0&ak=oNdm16ON6tl7UIRIHnTWySXu9L3dlo7B"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <!-- 你必须先引入jQuery1.8或以上版本 -->
    <script src="https://cdn.bootcdn.net/ajax/libs/layer/3.1.1/layer.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 引入 ECharts 文件 -->
    <script src="https://cdn.bootcdn.net/ajax/libs/echarts/5.0.1/echarts.min.js"></script>
</head>  
<body>
</body>  
</html>

<body>
    <div id="container"></div>
    <div id="speedChart" style="display: none;">
        <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
        <div id="speedChartMain" style="width: 600px; height: 400px;"></div>
    </div>
    <script type="text/javascript">
    var map = new BMap.Map("container");
    // 创建地图实例  
    var point = new BMap.Point(108.953556,34.267832);

    // 创建点坐标  
    map.centerAndZoom(point, 14);
    map.enableScrollWheelZoom(true);

    function SearchControl(){
        this.defaultAnchor = BMAP_ANCHOR_TOP_RIGHT;
        this.defaultOffset = new BMap.Size(80,10);
    }
    SearchControl.prototype = new BMap.Control();
    SearchControl.prototype.initialize = function(map){
        var searchBar = document.createElement('div');
        var lng = document.createElement('input');
        var lat = document.createElement('input');
        var submit = document.createElement('input');
        searchBar.appendChild(lng);
        searchBar.appendChild(lat);
        searchBar.appendChild(submit);

        submit.type = 'button';
        submit.value = "Search";
        submit.style.height = '25px';
        submit.style.border = "none";
        submit.style.borderRadius = '5px';
        submit.style.backgroundColor = 'white';
        submit.onclick = function(){
            getRe();
        }

        lng.style.height = '25px';
        lng.id = "lng";
        lng.style.border = 'none';
        lng.placeholder = "bd坐标系经度";

        lat.style.height = '25px';
        lat.id = "lat";
        lat.style.border = 'none';
        lat.placeholder = "bd坐标系纬度";




        searchBar.style.display = 'flex';
        searchBar.style.boxShadow = "0 2px 6px 0 rgba(27, 142, 236, 0.5)";

        map.getContainer().appendChild(searchBar);
        return searchBar;
    };
    map.addControl(new SearchControl());

    function getRe(){
        if($("#lat").val()==""||$("#lng").val()=="")
            getPosandRe();
        else{
            var point = new BMap.Point($("#lng").val(),$("#lat").val());
            var center = new BMap.Marker(point);


            var label = new BMap.Label("中心位置",{offset:new BMap.Size(20,-10)});
            center.setLabel(label);
            map.addOverlay(center);
            getRecommend(point);

        }
    }


    var geolocation = new BMap.Geolocation();
    var gc = new BMap.Geocoder();
    function getPosandRe() {
        geolocation.getCurrentPosition(function (r) {
            if (this.getStatus() == BMAP_STATUS_SUCCESS) {
                var mk = new BMap.Marker(r.point);
                map.addOverlay(mk);
                map.panTo(r.point);
                alert('您的位置：' + r.point.lng + ',' + r.point.lat);

                var pt = r.point;
                map.panTo(pt);//移动地图中心点

                gc.getLocation(pt, function (rs) {
                    var addComp = rs.addressComponents;
                    //alert(addComp.city);
                    alert(addComp.province + addComp.city + addComp.district + addComp.street + addComp.streetNumber);
                });
                getRecommend(r.point)
            } else {
                alert('failed' + this.getStatus());
            }
        });
    }
    function getRecommend(point){
        var data = "x="+point.lng+"&y="+point.lat;
        $.ajax({
            url: "fore/recommend",
            data: data,
            type: "GET",
            success: function (result){
                if(result.length===0)
                    alert("您周围没有推荐点，可以尝试扩大范围呢亲")
                else
                    addLabels(result)
            },
            error: function (){
                alert("wrong");
            }
        })
    }
    function addLabels(result){
        var markers = [];
        var optss = [];
        var infoWindows = [];
        for(var i = 0;i<result.length;i++){
            var opts = {
                width: 1000,
                height: 700,
                title: result[i]['name']
            };
            var content = '地址:'+result[i]['address']+"<br>"+'评论：<br>'+result[i]['comment'] ;
            infoWindows[i] = new BMap.InfoWindow(content, opts);
        }

        for(var i = 0;i<result.length;i++) {
            var p = new BMap.Point(result[i]['posx'], result[i]['posy']);
            var marker = new BMap.Marker(p);
            markers.push(marker);
            markers[i].setLabel(new BMap.Label(result[i]['name'],{offset:new BMap.Size(20,-10)}));
            map.addOverlay(markers[i]);
            (function(i)
            {
                markers[i].addEventListener("click", function (){
                    map.openInfoWindow(infoWindows[i], new BMap.Point(result[i]['posx'], result[i]['posy']));
                });
            })(i);

        }

    }

    </script>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例

        // 使用刚指定的配置项和数据显示图表。


        //弹出一个页面层
        function open(data){

        }
    </script>
</body>

</html>