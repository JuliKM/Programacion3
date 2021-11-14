function duplicarNum(){
    var content = document.getElementById('numero').innerHTML;
    var num = parseInt(content);

    content = num*2;

    document.getElementById('numero').innerHTML = content;
}