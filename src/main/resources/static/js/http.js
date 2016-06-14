var dataBtn = document.getElementById("data-btn");

dataBtn.addEventListener("mousedown", function () {
  var xhr = new XMLHttpRequest();
  xhr.open("POST", "/api/user?name=Joe");
  xhr.onreadystatechange = function () {
    var status;
    if (xhr.readyState == 4) {
      status = xhr.status;
      if (status == 200)
        console.log(JSON.parse(xhr.responseText));
      else
        console.log(status)
    }
  };
  xhr.send();
});