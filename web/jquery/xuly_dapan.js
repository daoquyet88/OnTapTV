function xuLy_DapAn(id){
    document.getElementById("myDIV").style.display = "block";
    document.getElementById("myCapNhap").style.display = "block";
    document.getElementById("myThem").style.display = "none";

    var objs=document.getElementsByClassName(id);
    document.getElementById("txtMD").value=objs[0].innerHTML;
    document.getElementById("txtMDA").value=objs[1].innerHTML;
    document.getElementById("txtCH").value=objs[2].innerHTML;
    document.getElementById("txtTL1").value=objs[3].innerHTML;
    document.getElementById("txtTL2").value=objs[4].innerHTML;
    document.getElementById("txtTL3").value=objs[5].innerHTML;
    document.getElementById("txtDA").value=objs[6].innerHTML;
          
        
   
    
    
  
}
function xuly_ThemDeTai(){
    document.getElementById("myDIV").style.display = "block";
    document.getElementById("myCapNhap").style.display = "none";
    document.getElementById("myThem").style.display = "block";
    document.getElementById("txtMD").value="";
    document.getElementById("txtMDA").value="";
    document.getElementById("txtCH").value="";
    document.getElementById("txtTL1").value="";
    document.getElementById("txtTL2").value="";
    document.getElementById("txtTL3").value="";
    document.getElementById("txtDA").value="";
}