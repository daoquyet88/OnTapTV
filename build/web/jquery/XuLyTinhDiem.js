var so=60;
var soCauDung=0;
var soCauHoi=10;
var cout=0;

function hamdautien(chuoi,z,i){
    cout++;
    if(cout==10){
        var tg =document.getElementById("dongHo");
        so=0;
        alert("Đã làm xong bài ôn tập:"+tg.innerHTML);
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
        xxx.innerHTML="Đáp Án Đúng Là :"+da2;
        soCauDung++;
    }else{
        //alert("co chay hay ko"+da2);       
     
        xxx.innerHTML="Đáp Án Đúng Là :"+da2;
    }
   yyy.innerHTML="Số Đáp Án Đúng Trên Tổng Số Câu :"+soCauDung+"/"+soCauHoi;
   var data=document.getElementsByName(i);
    //alert(data.length+"so pt");
    for(var x=0;x<data.length;x++){
        data[x].disabled=true;
    }
   
}
// goi ham DONG HO 

function  demNguoc(){
    moClick();
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
         yyy.innerHTML="Số Đáp Án Đúng Trên Tổng Số Cầu Là : "+soCauDung+"/"+soCauHoi;
    }
    }
    
    
}
function tatClick(){
    for(var a=1;a<=10;a++){
            var data=document.getElementsByName(""+a);
           // alert(data.length+"so pt");
            for(var x=0;x<data.length;x++){
            data[x].disabled=true;
        }
    }
}
function moClick(){
    for(var a=1;a<=10;a++){
            var data=document.getElementsByName(""+a);
           // alert(data.length+"so pt");
            for(var x=0;x<data.length;x++){
            data[x].disabled=false;
        }
    }
}
function xyly_An(){
    alert("ok chay");
    //document.getElementById("vd1").disabled=true;
    var obj=document.getElementsByName("xxx");
    obj[0].disabled=true;
}