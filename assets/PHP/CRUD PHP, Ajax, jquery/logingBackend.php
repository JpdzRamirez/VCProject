
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

    <head>
        <!--Meta-->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Fomulario</title>


        <script
            src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
        crossorigin="anonymous"></script>

        <!-- FRAMEWORK BOOTSTRAP para el estilo de la pagina-->
        <link rel="stylesheet"
              href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">


        <script
        src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script 
        src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script 
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

        <script src="https://kit.fontawesome.com/a09b017c30.js" crossorigin="anonymous"></script>
        <!-- Los iconos tipo Solid de Fontawesome-->
        <link rel="stylesheet"
              href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
        <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>

        <!-- Referencia HMTL5 para incluir .css-->
        <link rel="stylesheet" type="text/css" href="static/css/estilos.css"
              th:href="@{/css/estilos.css}">

    </head>


    <div class="cssload-dots">
        <div class="cssload-dot"></div>
        <div class="cssload-dot"></div>
        <div class="cssload-dot"></div>
        <div class="cssload-dot"></div>
        <div class="cssload-dot"></div>
    </div>

    <svg version="1.1" xmlns="http://www.w3.org/2000/svg">
    <defs>
    <filter id="goo">
        <feGaussianBlur in="SourceGraphic" result="blur" stdDeviation="12" ></feGaussianBlur>
        <feColorMatrix in="blur" mode="matrix" values="1 0 0 0 0	0 1 0 0 0	0 0 1 0 0	0 0 0 18 -7" result="goo" ></feColorMatrix>
        <!--<feBlend in2="goo" in="SourceGraphic" result="mix" ></feBlend>-->
    </filter>
    </defs>
    </svg>

    <script>
        window.onload = function () {

            var contenedor = document.getElementById('goo');
            contenedor.style.visibility = 'hidden';
        };
    </script>

    <center>
        <img src="resources/logo.png">
    </center>

    <div class="container">
        <div class="mx-auto col-sm-8 main-section" id="myTab" role="tablist">
            <ul class="nav nav-tabs justify-content-end">
                <li class="nav-item">
                    <a class="nav-link " id="list-tab" data-toggle="tab" href="#list" role="tab" aria-controls="list" aria-selected="false">List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" id="form-tab" data-toggle="tab" href="#form" role="tab" aria-controls="form" aria-selected="true">Form</a>				   	
                </li>
            </ul>
            <div class="tab-content" id="myTabContent">
                
                <div class="tab-pane fade show active" id="form" role="tabpanel" aria-labelledby="form-tab">
                    <?php
                    include "commons/util/conexion.php";
                    $id_recibida = filter_input(INPUT_POST, 'id');
                    $opcion = filter_input(INPUT_POST, 'opcion');

                    $columnas = ["id_user", "name", "last_name", "user_name", "email","password"];
                    if ($id_recibida != null) {
                        
                      
                        
                        
                    }
                    switch ($opcion){
                        
                        case "eliminar":
                            $solicitud= "DELETE FROM listusers  where id_user=".$id_recibida;
                            $resultado= mysqli_query($conexion, $solicitud);//SE ENVIA A BORRAR LA FILA bajo id
                           
                        break;
                        
                        case "editar": //imprimo formularo con valores
                            $solicitud= "SELECT * FROM listusers  where id_user=".$id_recibida;
                            $resultado= mysqli_query($conexion, $solicitud);//se pide el objeto 
                            $arregloUsuario = mysqli_fetch_array($resultado); // se guarda en un arreglo
                            echo "Usuario:".$arregloUsuario[0] . " Datos actuales son: ". "</br>";
                            echo"'<form class='form' method='POST' role='form' action='logicaBackend.php' > 
                            <div class='form-group row'>
                            <label  class='col-lg-3 col-form-label form-control-label'>N°: $arregloUsuario[0]</label>
                                <div class='col-lg-9'>
                                <input name='no'class='form-control' type='text' value='$arregloUsuario[0]'>
                            </div>
                            </div>
                            <div class='form-group row'>
                            <label class='col-lg-3 col-form-label form-control-label'>Id:</label>
                            <div class='col-lg-9'>
                                <input name='id'class='form-control' type='text' value='$arregloUsuario[1]'>
                            </div>
                        </div>
                        <div class='form-group row'>
                            <label class='col-lg-3 col-form-label form-control-label'>First name</label>
                            <div class='col-lg-9'>
                                <input name='name' class='form-control' type='text' value='$arregloUsuario[2]'>
                            </div>
                        </div>
                        <div class='form-group row'>
                            <label class='col-lg-3 col-form-label form-control-label'>Last
                                name</label>
                            <div class='col-lg-9'>
                                <input name='last_name' class='form-control' type='text' value='$arregloUsuario[3]' >
                            </div>
                        </div>
                        <div class='form-group row'>
                            <label class='col-lg-3 col-form-label form-control-label'>Email</label>
                            <div class='col-lg-9'>
                                <input name='email' class='form-control' type='email' value='$arregloUsuario[5]'>
                            </div>
                        </div>
                        <div class='form-group row'>
                            <label class='col-lg-3 col-form-label form-control-label'>Username</label>
                            <div class='col-lg-9'>
                                <input  name='user_name' class='form-control' type='text' value='$arregloUsuario[4]'>
                            </div>
                        </div>
                        <div class='form-group row'>
                            <label class='col-lg-3 col-form-label form-control-label'>Password</label>
                            <div class='col-lg-9'>
                                <input name='password' class='form-control' type='password'>
                            </div>
                        </div>
                        <div class='form-group row'>
                            <label class='col-lg-3 col-form-label form-control-label'>Confirm</label>
                            <div class='col-lg-9'>
                                <input class='form-control' type='password' >
                            </div>
                        </div>
                        <div class='form-group row'>
                            <div class='col-lg-12 text-center'>
                                <input type='submit' value='Save Changes'>
                            </div>
                        </div>
                    </form>
                    ";
                        break;
                    }
                    
                    ?>
                    
                    
                </div> 
            </div>
        </div>
    </div>


</html>



