<?php
include "commons/util/conexion.php";
$no=filter_input(INPUT_POST, 'no');

$identificacion=filter_input(INPUT_POST, 'id');
$nombre=filter_input(INPUT_POST, 'name');
$apellido=filter_input(INPUT_POST, 'last_name');
$email=filter_input(INPUT_POST, 'email');
$contraseña=filter_input(INPUT_POST, 'password');
$usuario=filter_input(INPUT_POST, 'user_name');

$solicitud= "SELECT * FROM listusers  where no=".$no;
$resultadoBusqueda= mysqli_query($conexion, $solicitud);//se pide el objeto 
$columnas = ["id_user", "name", "last_name", "user_name", "email","password"];

$solicitudUpdate="UPDATE listusers SET "
        .$columnas[1]. " = ".$nombre. " , "
        .$columnas[0]. " = ".$identificacion. " , "
        .$columnas[2]. " = ".$apellido. " , "
        .$columnas[3]. " = ".$usuario. " , "
        .$columnas[4]. " = ".$email. " , "
        .$columnas[5]. " = ".$contraseña. " WHERE no= ".$no
        ;
echo $solicitudUpdate;
$resultado= mysqli_query($conexion, $solicitudUpdate);
