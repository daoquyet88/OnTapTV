function xuLyCapNhap(id){
    alert(id);
    var objs=document.getElementsByClassName(id);
    document.getElementById("txtUse").value=objs[0].innerHTML;
    document.getElementById("txtPass").value=objs[1].innerHTML;
    document.getElementById("txtID").value=objs[2].innerHTML;
    document.getElementById("txtHT").value=objs[3].innerHTML;
    document.getElementById("txtDC").value=objs[4].innerHTML;
    document.getElementById("txtNS").value=objs[5].innerHTML;
    document.getElementById("txtGT").value=objs[6].innerHTML;
    document.getElementById("txtEM").value=objs[7].innerHTML;
          
        
    alert(objs[0].innerHTML);
    
    
  
}