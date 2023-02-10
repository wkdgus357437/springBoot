$(function(){

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

                  $(resultDiv).text("찾고자 하는 아이디가 없습니다.");
                  $(resultDiv).css('color', 'red');
                  $(resultDiv).css('font-weight', 'red');
              }else{
                  //삭제
                  if(confirm('삭제 하시겠습니까?')){
                  $.ajax({
                    type: 'post',
                    url: '/user/delete',
                    data: 'id=' + $('#searchId').val(),
                    success: function(){
                      alert("회원님의 정보를 삭제하였습니다.");
                      location.href='/user/list';
                    },
                    error:function(err){
                      console.log(err);
                    }

                  });
                  }
                }//else
          },
          error: function(err){
              console.log(err);
          }
      });//ajax

  });

});