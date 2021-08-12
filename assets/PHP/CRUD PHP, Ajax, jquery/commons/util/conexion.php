<?php

$host="localhost";
$user="root";
$pass="";
$db="dentoscrud";
        
        global $conexion;
        $conexion= mysqli_connect($host,$user,$pass,$db);
        mysqli_set_charset($conexion,"utf8");


