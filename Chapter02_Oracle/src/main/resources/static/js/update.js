$(function(){
    $('#updateDiv').hide();

    //아이디 찾기
    $('#searchIdBtn').click(function(){
        $('#resultDiv').empty();

        $.ajax({
            type: 'post',
            url: '/user/getUser',
            data: 'id=' + $('#searchId').val(),
            // dataType: 'json', 데이터타입을 빼면 null값도 웹에 반환한다.
            //getUser에서 id를 찾으면 제대로 JSON으로 오지만 id가 없으면 JSON으로 받지 못한다.
            // 따라서 dataType: json 을 주석처리한다.
            success: function(data){
                //alert(JSON.stringify(data));

                if(data == ""){
                    $('#updateDiv').hide();

                    $(resultDiv).text("회원정보를 찾을 수 없음.");
                    $(resultDiv).css('color', 'red');
                    $(resultDiv).css('font-weight', 'red');
                }else{
                    $('#updateDiv').show();

                    $('#name').val(data.name);
                    $('#id').val(data.id);
                    //$('#pwd').val(data.pwd);
                }
            },
            error: function(err){
                console.log(err);
            }
        });//ajax

    });

});

//취소버튼
$('#resetBtn').click(function(){
    $('#searchIdBtn').trigger('click');  //강제 이벤트 발생
});

$('#updateBtn').click(function(){
  $("#nameDiv").empty();
    $("#pwdDiv").empty();

    if ($("#name").val() == "") {
      $("#nameDiv").text("이름을 입력하세요");
      $("#name").focus();
    } else if ($("#pwd").val() == "") {
      $("#pwdDiv").text("비밀번호를 입력하세요");
      $("#pwd").focus();
    } else {

  $.ajax({
    type: 'post',
    url: '/user/update',
    data: $('#updateForm').serialize(),
    success: function(){
      alert("회원님의 정보를 수정하였습니다.");
             location.href = "/user/list";
    },
    error:function(err){
    console.log(err);
  }
    });
  }
});
