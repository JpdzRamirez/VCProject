
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

    <head>
        <!--Meta-->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Crud In PHP with Bootstrap</title>


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
    <body>
   
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
window.onload=function(){
    
    var contenedor=document.getElementById('goo');
    contenedor.style.visibility='hidden';
};
</script>

    <center>
        <img src="resources/logo.png">
    </center>
    <div class="container">
        <div class=" main-section" id="myTab" role="tablist">
            <ul class="nav nav-tabs justify-content-end">
                <li class="nav-item">
                    <a class="nav-link active" id="list-tab" data-toggle="tab" href="#list" role="tab" aria-controls="list" aria-selected="false">List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="form-tab" data-toggle="tab" href="#form" role="tab" aria-controls="form" aria-selected="true">Form</a>				   	
                </li>
            </ul>
            <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade show active" id="list" role="tabpanel" aria-labelledby="list-tab">
                    <div class="card">
                        <div class="card-header">
                            <h4>User List</h4>
                        </div>
                        <div class="card-body">

                            <?php
                            // Util
                            include "commons/util/conexion.php";
                            include "commons/util/backend.php";
                            include "entities/tableTools.php";


                            //CREAMOS LA TABLA , PARTE CREATE DEL ->CRUD

                            $solicitud = "CREATE TABLE listusers( no int NOT NULL AUTO_INCREMENT, id_user varchar(80),name varchar(80),last_name varchar(80),user_name varchar(80),email varchar(100),password varchar(50), PRIMARY KEY(no))";
                            $resultadoCreate = mysqli_query($conexion, $solicitud);


                            // PARA PROXIMAS EJECUCIONES, VERIFICAMOS SI HAY INSTANCIAS
                            $solicitudConteo = "SELECT COUNT(*) total FROM listusers ";
                            $resultadoConteo = mysqli_query($conexion, $solicitudConteo);
                            $variable = mysqli_fetch_array($resultadoConteo); //guardamos al estilo cast en un array
                            // CASO SI, NO, creamos instancias por primera vez, con Infor por defecto
                            if ($variable[0] === '0') {
                                $solicitudInsert = "INSERT INTO listusers(id_user, name, last_name, user_name, email, password) VALUES ( '1098797436','Jeremy Ivan','Pedraza Hernandez','jeremy.pedraza','jeremyivanpedraza@gmail.com','JpdzRamirez')";
                                $resultado = mysqli_query($conexion, $solicitudInsert);
                            }
                            // Solicitud de respuesta al servidor
                            $solicitudImpresion = "SELECT * FROM listusers";
                            $resultadoImpresion = mysqli_query($conexion, $solicitudImpresion);
                            //Impresion de cabeceras

                            echo "
                                <div class='table-responsive'>
                                <table id='userlist' class='table table-bordered table-hover table-striped'>
                                        <thead class='thead-light'>
                                        <tr>
                                                <th scope='col'>#</th>
                                                <th scope='col'>Id</th>
                                                <th scope='col'>First</th>
                                                <th scope='col'>Last</th>
                                                <th scope='col'>Username</th>
                                                <th scope='col'>E-mail</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        ";
                            // ciclo de contenido ESTE SERÍA EL READ DEL ->CRUD
                            while ($fila = mysqli_fetch_array($resultadoImpresion)) {

                                echo "<tr>";
                                echo "<td>" . $fila['no'] . "</td>";
                                echo "<td>" . $fila['id_user'] . "</td>";
                                echo "<td>" . $fila['name'] . "</td>";
                                echo "<td>" . $fila['last_name'] . "</td>";
                                echo "<td>" . $fila['user_name'] . "</td>";
                                echo "<td>" . $fila['email'] . "</td>";
                                echo "</tr>";
                            }
                            echo"   
                                </tbody>
                                </table>
                                </div>";
                            ?>
                            <div> 
                            <form align="center" method="POST" action="logingBackend.php" class="form">
                                <label>Id: </label>
                                <input type="text" name="id"> <br>
                                <select name="opcion">

                                    <option value="editar">Editar</option>

                                    <option value="eliminar">Eliminar</option>
                                    

                                </select>
                                <input type="submit" value="Editar">
                            </form>       
                        </div>

                        </div>
                    </div>
                </div>
                <div class="tab-pane fade" id="form" role="tabpanel" aria-labelledby="form-tab">
                    <div class="card">
                        <div class="card-header">
                            <h4>Formulario</h4>
                        </div>
                        <div class="card-body">





                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>







</body>
</html>