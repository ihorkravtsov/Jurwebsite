/**
 * Created by User on 20.07.2017.
 */

var main = {
    addMessage: function () {
        var name = document.getElementById("name").value;
        var email = document.getElementById("email").value;
        var message = document.getElementById("message").value;
        $.ajax({
            type: "POST",
            url: "/Jurwebsite",
            dataType: "json",
            data: {requestType: "addMessage", name: name, email: email, message: message},
            success: function (data) {
                console.log(data);
              //  document.location.href = 'index.html';
            }
        });
    },
}