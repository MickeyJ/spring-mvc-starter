
document.getElementById("form").addEventListener("submit", (e) =>{
  e.preventDefault();

  const nameInput = document.getElementById('user-name').value;
  const xhr = new XMLHttpRequest();

  xhr.open("POST", "/api/user?name=" + nameInput);
  xhr.onreadystatechange = () => {
    var status;
    if (xhr.readyState == 4) {
      status = xhr.status;
      if (status == 200)
        console.log(JSON.parse(xhr.responseText));
      else
        console.error(xhr.status)
    }
  };
  xhr.send();

});