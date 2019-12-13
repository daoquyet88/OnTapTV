var so=60;
var soCauDung=0;
var soCauHoi=10;
var cout=0;

function hamdautien(chuoi,z,i){
    cout++;
    if(cout==10){
        var tg =document.getElementById("dongHo");
        so=0;
        alert(tg.innerHTML);
    }
    
   // alert("id la="+chuoi+"z="+z);
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
   var data=document.getElementsByName(i);
    //alert(data.length+"so pt");
    for(var x=0;x<data.length;x++){
        data[x].disabled=true;
    }
   
}
// goi ham DONG HO 

function  demNguoc(){
    
    so--;
   
    if(so>=0){
       
        document.getElementById("dongHo").innerHTML="Còn Lại :"+so+"s";
        setTimeout("demNguoc()",1000);
        
    }else{
        var htg=document.getElementById("htg");
        
        //xu ly clock all
        for(var a=1;a<=10;a++){
            var data=document.getElementsByName(""+a);
           // alert(data.length+"so pt");
            for(var x=0;x<data.length;x++){
            data[x].disabled=true;
        }
        var yyy =document.getElementById("kq");
         yyy.innerHTML="so dap an dung tren tong so cau la "+soCauDung+"/"+soCauHoi;
    }
    }
    
    
}
function xyly_An(){
    alert("ok chay");
    //document.getElementById("vd1").disabled=true;
    var obj=document.getElementsByName("xxx");
    obj[0].disabled=true;
}