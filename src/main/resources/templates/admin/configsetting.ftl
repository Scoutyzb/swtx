<link rel="stylesheet" href="static/js/lay-module/step-lay/step.css" media="all">
<div class="layuimini-container layuimini-page-anim">
    <div class="layuimini-main">

        <div class="layui-fluid">
            <div class="layui-card">
                <div class="layui-card-body" style="padding-top: 40px;">
                    <div class="layui-carousel" id="stepForm" lay-filter="stepForm" style="margin: 0 auto;">
                        <div carousel-item >
                            <div>
                                <div style=" height:40px " ></div>
                                <form class="layui-form" style="margin: 0 auto;max-width: 480px;padding-top: 40px;">
                                    <div class="layui-form-item">
                                        <label class="layui-form-label" >POI新增:</label>
                                        <div class="layui-input-block">
                                            <input name="potPoiAsc" type="text" placeholder="请填写权重" class="layui-input" lay-verify="number" required/>
                                        </div>
                                    </div>
                                    <div style=" height:10px " ></div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">POI变化:</label>
                                        <div class="layui-input-block">
                                            <input name="potPoiChange"type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>
                                    <div style=" height:10px " ></div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">POI减少:</label>
                                        <div class="layui-input-block">
                                            <input name="potPoiDes" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>

                                    <div style=" height:30px " ></div>
                                    <div class="layui-form-item">
                                        <div class="layui-input-block">
                                            <button class="layui-btn" lay-submit lay-filter="formStep">
                                                &emsp;下一步&emsp;
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div>
                                <form class="layui-form" style="margin: 0 auto;max-width: 480px;padding-top: 40px;">
                                <div style=" height:40px " ></div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">情感指数:</label>
                                    <div class="layui-input-block">
                                        <input name="lifeEmotion" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                    </div>
                                </div>

                                <div class="layui-form-item">
                                    <label class="layui-form-label">交通指数:</label>
                                    <div class="layui-input-block">
                                        <input name="lifeTraffic" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">教育指数:</label>
                                    <div class="layui-input-block">
                                        <input name="lifeEducation" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">娱乐指数:</label>
                                    <div class="layui-input-block">
                                        <input name="lifeEntertainment" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                    </div>
                                </div>
                                <div class="layui-form-item">
                                    <label class="layui-form-label">医疗指数:</label>
                                    <div class="layui-input-block">
                                        <input name="lifeHostpital" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                    </div>
                                </div>
                                <div style=" height:30px " ></div>
                                <div class="layui-form-item">
                                    <div class="layui-input-block">
                                        <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                        <button class="layui-btn" lay-submit lay-filter="formStep">
                                            &emsp;下一步&emsp;
                                        </button>
                                    </div>
                                </div>
                                </form>
                            </div>
                            <div>
                                <form name = "form1" id = "form1" class="layui-form" style="margin: 0 auto;max-width: 480px;padding-top: 40px;">
                                    <div style=" height:40px " ></div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">消费水平:</label>
                                        <div class="layui-input-block">
                                            <input name="areaConsume" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>

                                    <div class="layui-form-item">
                                        <label class="layui-form-label">房屋价格:</label>
                                        <div class="layui-input-block">
                                            <input name="areaHousePrice" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">工业用地:</label>
                                        <div class="layui-input-block">
                                            <input name="areaIndustryArea" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">商业用地:</label>
                                        <div class="layui-input-block">
                                            <input name="areaCommericalArea" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>
                                    <div class="layui-form-item">
                                        <label class="layui-form-label">住宅用地:</label>
                                        <div class="layui-input-block">
                                            <input name="areaHouseArea" type="text" placeholder="请填写权重" value="" class="layui-input" lay-verify="number" required>
                                        </div>
                                    </div>
                                    <div style=" height:30px " ></div>
                                    <div class="layui-form-item">
                                        <div class="layui-input-block">
                                            <button type="button" class="layui-btn layui-btn-primary pre">上一步</button>
                                            <button class="layui-btn" lay-submit lay-filter="formStep" onclick="mergeForm()">
                                                &emsp;提交&emsp;
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div>
                                <div style="text-align: center;margin-top: 90px;">
                                    <i class="layui-icon layui-circle"
                                       style="color: white;font-size:30px;font-weight:bold;background: #52C41A;padding: 20px;line-height: 80px;">&#xe605;</i>
                                    <div style="font-size: 24px;color: #333;font-weight: 500;margin-top: 30px;">
                                        设置成功
                                    </div>
                           
                                </div>
                                <div style="text-align: center;margin-top: 50px;">
                                    <button class="layui-btn next">重新设置</button>
                                    <button class="layui-btn layui-btn-primary" onclick="window.location.href='/admin'">查看权重</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <div style="color: #666;margin-top: 30px;margin-bottom: 40px;padding-left: 30px;">
                        <h3>说明</h3><br>
                        <h4>此处可设置价值计算模块中各种权重</h4>
                        <p>    区域潜力：由POI的新增、减少、以及类型变化计算得来</p>
                        <p>    区域生活质量：由情感，交通，教育，娱乐，医疗等指数计算得来</p>
                        <p>    区域实力：由情感，交通，教育，娱乐，医疗等指数计算得来</p>

                    </div>
                </div>
            </div>
        </div>

    </div>
</div>
<script>

    layui.use(['form', 'step'], function () {
        var $ = layui.$,
            form = layui.form,
            step = layui.step;

        /**
         * 初始化表单，要加上，不然刷新部分组件可能会不加载
         */
        form.render();

        step.render({
            elem: '#stepForm',
            filter: 'stepForm',
            width: '100%', //设置容器宽度
            stepWidth: '750px',
            height: '500px',
            stepItems: [{
                title: '潜力权重设置'
            }, {
                title: '生活质量权重设置'
            }, {
                title: '区域实力权重设置'
            }, {
                title: '确认设置'
            }]
        });


        form.on('submit(formStep)', function (data) {
            step.next('#stepForm');
            return false;
        });

        form.on('submit(formStep2)', function (data) {
            step.next('#stepForm');
            return false;
        });

        $('.pre').click(function () {
            step.pre('#stepForm');
        });

        $('.next').click(function () {
            step.next('#stepForm');
        });
    })


    function mergeForm(){
        var data = $('form').serializeArray();
        // $.each(t, function() {
        //     data[this.name] = this.value;
        // });
        $.ajax({
            type: "POST",
            dataType: "json",
            url: "/admin/config",
            data: data,
            success: function (result){
                console.log(result);
            },
            error: function (){
                alert("权重设置失败");
                window.location.href="/"
            }
        });


    }
</script>
