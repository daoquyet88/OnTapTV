function xuLyDeBai(id){
    document.getElementById("myDIV").style.display = "block";
    document.getElementById("myCapNhap").style.display = "block";
    document.getElementById("myThem").style.display = "none";
    alert(id);
    var objs=document.getElementsByClassName(id);
    document.getElementById("txtMD").value=objs[0].innerHTML;
    document.getElementById("txtTD").value=objs[1].innerHTML;
    document.getElementById("txtND").value=objs[2].innerHTML;
    document.getElementById("txtTG").value=objs[3].innerHTML;
    document.getElementById("txtL").value=objs[4].innerHTML;
    document.getElementById("txtCT").value=objs[5].innerHTML;
    
          
        
    alert(objs[0].innerHTML);
    
    
  
}
function xuly_ThemDeTai(){
    document.getElementById("myDIV").style.display = "block";
    document.getElementById("myCapNhap").style.display = "none";
    document.getElementById("myThem").style.display = "block";
    document.getElementById("txtMD").value="";
    document.getElementById("txtTD").value="";
    document.getElementById("txtND").value="";
    document.getElementById("txtTG").value="";
    document.getElementById("txtL").value="";
    document.getElementById("txtCT").value="";
}