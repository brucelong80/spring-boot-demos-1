$(document).ready(function(){
    $("#text").bind("click",function(){
        alert("我的id为text，你点击时触发");
    });

    $("#text1").on("click",function(){
        alert("hellworl");
    });

    $("#text2").click(function(){
        alert($("#text2").val());

    });
});