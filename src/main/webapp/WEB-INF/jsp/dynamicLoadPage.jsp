<%@page pageEncoding="UTF-8" contentType="text/html;UTF-8" %>
<html>
<head>
    <title>${titleName}</title>
    <script src="/resources/js/jquery-2.1.4.min.js"></script>
</head>
<body>
<table name="dynamicTable" border="1">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>地址</td>
        <td>工种</td>
        <td>类别</td>
    </tr>
</table>
<script type="text/javascript">
    $(function(){
        var categorys = {"coder":"程序员","manager":"项目经理"};
        var jobs = {"tester":"测试","developer":"开发","qualitier":"质量","product":"产品","design":"设计"};
        //$('table[name="dynamicTable"]').append("<tr><td>张三</td><td>20</td><td>海淀区</td><td>研究员</td></tr>");
        $.ajax({
            type:"GET",
            url:"/get_dynamic_load_page_data.do",
            dataType:"json",
            success:function (data) {
                if(data.length > 0){
                    for(var i=0;i<data.length;i++){
                        var str = "<tr><td>"+data[i]["userName"]+"</td><td>"+data[i]["age"]+"</td><td>"+data[i]["address"]+"</td><td><input type='hidden' name='jobs' value='"+data[i]["programLanguage"]+"'/></td><td><input type='hidden' name='category' value='"+data[i]["category"]+"'></td></tr>";
                        $('table[name="dynamicTable"]').append(str);
                    }
                }
                $('input[name="category"]').each(function (i) {
                    $(this).parent("td").append(categorys[$(this).val()]);
                    var job = $('input[name="jobs"]')[i];
                    $(job).parent("td").append(jobs[$(job).val()]);
                });
            },
            error:{
            }
        });
//        setInterval(function () {
//            alert('zhangsan');
//        },1000);
    });
</script>
</body>
/*
$(document).ready(function() {

});
*/
</html>