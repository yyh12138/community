function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();

    $.ajax({
        type: "POST",
        url: "/comment",
        contentType: "application/json",
        data: JSON.stringify({
            "parentId": questionId,
            "content": content,
            "type": 1
        }),
        success: function (response) {
            if (response.code==200){
                $("#comment_section").hide();
            } else{
                if (response.code==2003){
                    var isAccept = confirm(response.message);
                    if (isAccept){
                        window.open("https://github.com/login/oauth/authorize?client_id=1a853dfb75ee2be297d4&redirect_uri=http://localhost:8888/callback&scope=user&state=1");
                        window.localStorage.setItem("closable",true);
                    }
                } else {
                    alert(response.message);
                }
            }
        },
        dataType: "json"
    });
}
