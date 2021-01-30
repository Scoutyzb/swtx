<!DOCTYPE html>  
<html>  
<head>  
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />  
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
    <title>价值计算</title>
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
    var point = new BMap.Point(108.99324996298002, 34.274544656809006);

    // 创建点坐标  
    map.centerAndZoom(point, 11);
    map.enableScrollWheelZoom(true);
    map.addEventListener("click", function (e){
        getValue(e);
    });
    function getValue(e){
        // alert(e.point.lng + ", " + e.point.lat);
        var data = "x="+e.point.lng+"&y="+e.point.lat;
        $.ajax({
            url: "fore/value",
            data: data,
            type: "GET",
            success: function (result){
                // console.log(result)
                open(result);
            },
            error: function (){
                alert("wrong");
            }
        })

    }
    // 初始化地图，设置中心点坐标和地图级别
    function getBoundary(){       
        var bdary = new BMap.Boundary();
        bdary.get("西安市新城区", function(rs){       //获取行政区域
            map.clearOverlays();        //清除地图覆盖物       
            var count = rs.boundaries.length; //行政区域的点有多少个
            if (count === 0) {
                alert('未能获取当前输入行政区域');
                return ;
            }
            var pointArray = [];
            for (var i = 0; i < count; i++) {
                var ply = new BMap.Polygon(rs.boundaries[i], {strokeWeight: 2, strokeColor: "#ff0000", fillColor: ""}); //建立多边形覆盖物
                map.addOverlay(ply);  //添加覆盖物
                pointArray = pointArray.concat(ply.getPath());
            }    
            map.setViewport(pointArray);    //调整视野  
            addlabel();               
        });   
    }


    setTimeout(function(){
        getBoundary();
    }, 2000);

    </script>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('speedChartMain'));
        option = {
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data: ['生活质量', '区域实力', '区域潜力']
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            xAxis: {
                type: 'category',
                boundaryGap: false,
                data: ['2016年', '2017年', '2018年', '2019年']
            },
            yAxis: {
                // show: false,
                // scale:true,
                type: 'value'
            },
            series: [{
                name: '生活质量',
                type: 'line',
                // stack: '总量',
                data: []
            },
                {
                    name: '区域实力',
                    type: 'line',
                    // stack: '总量',
                    data: []
                },
                {
                    name: '区域潜力',
                    type: 'line',
                    // stack: '总量',
                    data: []
                },
            ]
        };
        // 使用刚指定的配置项和数据显示图表。


        //弹出一个页面层
        function open(data){
            for (var i=0;i<4;i++) {
                option.series[0].data.push(data[i+16]['lifeQuality'])
            }
            for (var i=0;i<4;i++) {
                option.series[1].data.push(data[i+16]['areaPower'])
            }
            for (var i=0;i<4;i++) {
                option.series[2].data.push(data[i+16]['areaPotential'])
            }
            myChart.setOption(option);
            console.log(data);
            layer.open({
                title: '区域计算',
                type: 1,
                shade: false,
                area: ['620px', '460px'],
                shadeClose: false, //点击遮罩关闭
                content: $("#speedChart")
            });
            for (var i=0;i<3;i++) {
                option.series[i].data.length=0;
            }
        }
    </script>
</body>

</html>