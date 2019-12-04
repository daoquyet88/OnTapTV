var so=31;
var soCauDung=0;
var soCauHoi=10;

function hamdautien(chuoi,z){
    alert("id la="+chuoi+"z="+z);
    var obj =document.getElementById(chuoi);
    var content =obj.value;
    var da=content.split(',');
    da1=da[0];
    da2=da[1]; //dap an
    var xxx =document.getElementById(z);
    var yyy =document.getElementById("kq");
    if(da1==da2){
        
        var noidung=xxx.innerHTML;
        //alert("dap an ="+noidung);
        xxx.innerHTML="dap an dung la"+da2;
        soCauDung++;
    }else{
        //alert("co chay hay ko"+da2);       
     
        xxx.innerHTML="dap an dung la"+da2;
    }
   yyy.innerHTML="so dap an dung tren tong so cau la "+soCauDung+"/"+soCauHoi;
}
// goi ham DONG HO 

function  demNguoc(){
    so--;
   
    if(so>=0){
       
        document.getElementById("dongHo").innerHTML=so;
        setTimeout("demNguoc()",1000);
        
    }else{
        var htg=document.getElementById("htg");
        htg.innerHTML="het thoi gian";
    }
    
    
}
