$("input").each(function () {
        var str=$(this).valueOf();
        showerror(str);
    });

$(document).ready(function () {
    $("input").focus(function () {
        var classnames=$(this).attr("class")+"error";
        $("#"+classnames).css('display','none');

    })
});
$(document).ready(function () {
    $("input").blur(function () {
        var classname=$(this).attr("class")+"error";
        var c=$(this).attr("class");
        var text2=$("."+c).val();
        if(text2===""){
            showerror(text2,classname);
     }else {
            checkfunction(text2,c);
        }

    })
});

   function checkfunction(text,name) {
        var v="check_"+name;
       window [v](text,name);
   };

    function check_name(text,name) {

    if(text.length<6||text.length>10){
        $("#"+name+"error").html("用户名6-10长度").css('display','inline');
        return false;
    }
       $.ajax({
           type:"GET",
           url:"/user/registname",
           dateType:"json",
           async:false,
           data: {username:$("#username").val()},
           success:function (date) {
               alert(1);
           }
       }
   );

   }
// $(document).ready(function(){
//     $('#codeserror').di);
//
// });
 var v=window.onload=function creatCode (){
    var codes= document.getElementById("vertify_code");
    var code='';
    var num=['1','D','2','3','4','5','6','7','8','9','0','A','b','c','e','F','f','h','i','j','K','l','m','o','p','q','x','M','y','n','r','g','K'];
    for (var i=0;i<4;i++){
        var index = Math.floor(Math.random()*30);
            code += num[index];


    }
    codes.value=code;

};

     function reCode() {
          v();
  }
   function check_codes(text,name) {
       var codes= document.getElementById("vertify_code");
       var fcode=codes.value;
       if(text===fcode){
          return true;
       }else {
           $("#"+name+"error").html("验证码错误，请重输").css('display','inline');
       }

   }
//    function check_pwd() {
//
//    }
//
// function check_nemails() {
//
// }

  function showerror(str,classname){
     if (str!=="") {
         $("#"+classname).css('display','none');
     } else {
          $("#"+classname).css('display','inline');
      }
  }





