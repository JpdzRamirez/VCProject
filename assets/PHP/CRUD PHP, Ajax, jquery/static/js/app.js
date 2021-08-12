$(document).ready(function(){
    
   $("#enviar").ready(function(){
       $.post("logingBackend.php",function(datos){
           $("#resultado").html(datos);
       });
   });
});

$.ajax({
   url:'logingBackend.php',
   type: 'POST',
   async: true,
   data: {action:action,producto:producto},
   success: function(response){
        console.log(response);
    },
    error:function(error){
        console.log(error);
    }
});
//Model form ADD Edit
 $('.edit_user').click(function(e){
        e.preventDefault();
        var producto =$(this).attr()
    });