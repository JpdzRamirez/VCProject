# Desarrollo WEB en PHP🐘 + Apache 🕊 + MYSQL🐬 + Tomcat 🐱

> En este repositorio trataremos todos los conceptos y fundamentos para desarrollar 

<body>

<p>
✔ En primera instancia vamos a configurar el entorno de desarrollo para PHP  
 </p>
 
https://user-images.githubusercontent.com/66846214/126926685-abd2be38-2572-44a1-aa21-ae28edee6522.mp4

> Video explicativo -> Como configurar PHP🎬
</div>

## Proyecto 2 Colectores  

  <p>
   ✔ Inicializamos con asignación de variables , uso de collectores tipo arrays e impreción de datos con PHP puro👌<br/>
  </p>
   <details>
   <summary>
    Ver Codigo 📑 (Dar click🖱 en la imagen para máximizar)
   </summary>
    

```       
 echo '<br/>'.'<a align="center">'."Tabla de listado".'</a>'.'<br/>';
  // ENCABEZADOS
 $b= [  [   //FILA ENCABEZADO
                'Nombre',
                'Direccion',
                'Tel&eacute;fono',
                'Fecha de Cumpleaños',
                'Color Favorito',
                'Significado',
        ]
     ];
 // COMPONENTES
 $a = [
        [ //FILA 1
                'Nombre' => 'Juan P&eacute;rez',
                'Direccion' => 'Cra. 45 #45-56',
                'Telefono' => '3456789',
                'Fecha de Cumpleaños' => '23/12/1997',
                'Color Favorito' => 'Amarillo',
                'Significado' => 'Riqueza y alegría',
        ],
        [  //FILA 2
                'Nombre' => 'Alberto',
                'Direccion' => 'Calle.23 #12-19 Sur',
                'Telefono' => '3214567',
                'Fecha de Cumpleaños' => '12/10/1980',
                'Color Favorito' => 'Verde',
                'Significado' => 'No se encuentra el significado',
        ],
        [ //FILA 3
                'Nombre' => 'Foo',
                'Direccion' => 'Av. 34 # 16-12',
                'Telefono' => '2135423',
                'Fecha de Cumpleaños' => '07/06/2000',
                'Color Favorito' => 'Rojo',
                'Significado' => 'No se encuentra el significado',
        ]
     ];
 
 $s = '<table border="1">';
 foreach ($b as $r){
     $s .= '<tr>';
     foreach ( $r as $v ) {
                $s .= '<th>'.$v.'</th>';
        }
     $s .= '</tr>';
 }
 // SECCION CUERPO
 $s .='<tbody>';
foreach ( $a as $r ) {
        $s .= '<tr>';
        foreach ( $r as $v ) {
                $s .= '<td>'.$v.'</td>';
        }
        $s .= '</tr>';
}
$s .='</tbody>';
$s .= '</table>';
//IMPRIMIMOS LA VARIABLE
echo $s;
?>
```      

<p align="center" id="Code_1">
        <img  src="https://user-images.githubusercontent.com/66846214/127171923-e2a5ff47-023c-4fe3-bf1c-3d46a8e8d280.png">
</p>
</details>
  </p>
  
  
  ## Poyecto 3 GET - POST - REQUEST // FORMS // FUNCTION  
 <div>
  <p>
   ✔ Inicializamos con la elaboración de un formulario basico en HTML PURO y asignamos la accion de envio al archivo php <code>Funciones.php</code> y el metodo en el form <code>POST</cod>👌<br/>
 </p>
   <details>
   <summary>
    Ver Codigo 📑 (Dar click🖱 en la imagen para máximizar)
   </summary>
    
## Codigo HTML PURO📑
```       
<html>
    <head>
        <title>DESARROLLO WEB PHP</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type"
              content="text/html; charset=ISO-8859-
              1" />
    </head>
    <body>

        <form action="Funciones.php" method="POST">
            <label>Primer numero</label>
            <input type="text" name="numero1"/>
            <br/>
            <label>Segundo numero</label>
            <input type="text" name="numero2"/>
            <br/>
            <!-- Lista de selección -->
            Selecciona la opción deseada:
            <select name="combo">
                <!-- Opciones de la lista -->
                <option value="sumar">Sumar</option>
                <option value="restar" selected>Restar</option> <!-- Opción por defecto -->
                <option value="multiplicar">Dividir</option>
                <option value="dividir">Multiplicar</option>
            </select>
            <input type="submit" value="Enviar">
        </form>



    </body>
</html>

```      
### Codigo PHP🐘 puro , archivo de funcion action="Funciones.php"
✔ Continuamos con la creación del codigo php para la recepción de los valores enviados en el formulario, en este caso creamos una función para recibir los valores enviados en por el metodo <code>POST</cod> y finalmente imprimimos el resultado con <code>echo</cod> 
```
<?php

            function operaciones( $x, $y,$opcion){
                $resultado;
                switch ($opcion){
                    
                    case "sumar":
                        $resultado=$x+$y;
                        break;
                    case "restar":
                        $resultado=$x-$y;
                        break;
                    case "dividir":
                        $resultado=$x/$y;
                        break;
                    case"multiplicar":
                        $resultado=$x*$y;
                        break;
                    default:
                       $resultado=$x+$y; 
                   
                }
                return $resultado;
            }
            
            //Envio de valores por REQUEST
            $primerNumero=$_POST['numero1'];
            $segundoNumero=$_POST['numero2'];
            $seleccion=$_POST['combo'];
           $resultado= operaciones($primerNumero, $segundoNumero, $seleccion);
           echo $resultado. "<br/>"
?>
```     
<p align="center" id="Code_1">
        <img  src="https://user-images.githubusercontent.com/66846214/127929263-22d94dd2-e732-4f0e-b22a-6a632f0ee4d9.png">
</p>
</details>
</p> 
</div>
</body>

# Proyecto 4  POST AND AJAX REQUEST, MYSQL WITH CREATE, UPDATE, READ AND DELETE , something .css and .js
En esta seccion conectaremos nuestro proyecto en PHP con la base de datos del servidor, en este caso <code>MYSQL</code> previamente configurada en nuestro servidor local.

<details>
 <summary>
   Ver Codigo 📑 (Dar click🖱 en la imagen para máximizar)
 </summary>
 <p>
  ``` 
<!DOCTYPE html>

<html>

    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="formato.css" />
        <title> Metropolis Registro</title>
    </head>
    <body>

        <?php
        include("conexion.php");

        //CREAMOS LA TABLA
        $solicitud = "CREATE TABLE tablaFilas( FILA int NOT NULL AUTO_INCREMENT, Columna_1 varchar(10),Columna_2 varchar(10),Columna_3 varchar(10),Columna_4 varchar(10),Columna_5 varchar(10), PRIMARY KEY(FILA))";
        $resultadoCreate = mysqli_query($conexion, $solicitud);
        // PARA PROXIMAS EJECUCIONES, VERIFICAMOS SI HAY INSTANCIAS
        $solicitudConteo = "SELECT COUNT(*) total FROM tablafilas ";
        $resultadoConteo = mysqli_query($conexion, $solicitudConteo);

        // CASO SI NO, creamos instancias por primera vez
        if ($resultadoConteo == null) {
            for ($i = 0; $i < 5; $i++) {

                $solicitud = "INSERT INTO tablaFilas(Columna_1,Columna_2,Columna_3,Columna_4,Columna_5) VALUES('L','L','L','L','L')";
                $resultado = mysqli_query($conexion, $solicitud);
            }
        }
        ?>
        <?php
        // imprimir tabla
        $first = 1;
        $solicitudImpresion = "SELECT * FROM tablaFilas";
        $resultadoImpresion = mysqli_query($conexion, $solicitudImpresion);
        echo "
            <table align='center' border='1'> 
            <thead>
            <tr>
            <th colspan='2' rowspan='2'>CINE <br>METROPOLIS<br></th>
            <th colspan='5'>ESCENARIO</th>
            </tr>
            </thead>
            <tbody>
              <tr>
                <td colspan='2'></td>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
              </tr>";

        while ($fila = mysqli_fetch_array($resultadoImpresion)) {
            if ($first === 1) {
                echo "
            <tr>
            <td rowspan='5'>FILAS</td>";
                echo "<td>" . $fila['FILA'] . "</td>";
                echo "<td>" . $fila['Columna_1'] . "</td>";
                echo "<td>" . $fila['Columna_2'] . "</td>";
                echo "<td>" . $fila['Columna_3'] . "</td>";
                echo "<td>" . $fila['Columna_4'] . "</td>";
                echo "<td>" . $fila['Columna_5'] . "</td>";
                echo "</tr>";
                $first = 0;
            } else {
                echo "<tr>";
                echo "<td>" . $fila['FILA'] . "</td>";
                echo "<td>" . $fila['Columna_1'] . "</td>";
                echo "<td>" . $fila['Columna_2'] . "</td>";
                echo "<td>" . $fila['Columna_3'] . "</td>";
                echo "<td>" . $fila['Columna_4'] . "</td>";
                echo "<td>" . $fila['Columna_5'] . "</td>";
                echo "</tr>";
            }
        }
        echo "</tbody>";
        echo "</table>";
        ?>
        <div> 
            <form align="center" method="POST" action="InsertarDatos.php" class="form">
                <label>Fila: </label>
                <input type="text" name="fila"> <br>
                <label>Puesto: </label>
                <input type="text" name="puesto"> <br>

                <select name="opcion">

                    <option value="reservar">Reservar</option>

                    <option value="comprar">Comprar</option>

                    <option value="liberar">Liberar</option>

                </select>
                <input type="submit" value="Enviar">
            </form>       
        </div>
        
        <input type="text" id="valor">
        <button onclick="Enviar();">Enviar</button>
        <div id="resultado"></div>
        <script type="text/javascript">
            function objetoAjax() {
                var xmlhttp = false;
                try {
                    xmlhttp = new ActiveXObject("Msxml2.XMLHTTP");
                } catch (e) {

                    try {
                        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
                    } catch (E) {
                        xmlhttp = false;
                    }
                }

                if (!xmlhttp && typeof XMLHttpRequest !== 'undefined') {
                    xmlhttp = new XMLHttpRequest();
                }
                return xmlhttp;
            }

            function Enviar() {
                valor = document.getElementById('valor').value;
                //alert(valor);
                ajax = objetoAjax();
                ajax.open("POST", "pagina2.php", true);
                ajax.onreadystatechange = function () {
                    
                    if (ajax.readyState === 4) {
                        document.getElementById("resultado").innerHTML = ajax.responseText;
                    }
                };
                ajax.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
                alert(valor);
                ajax.send("varp2=" + valor);
            }

        </script>
    </body>
</html>
``` 
  
# Conexion al servidor conexion.php
  
``` 
<?php

$host="localhost";
$user="root";
$pass="";
$db="cinemetropolis";
        
        global $conexion;
        $conexion= mysqli_connect($host,$user,$pass,$db);
        mysqli_set_charset($conexion,"utf8");
 
``` 
# Codigo de inserión de los datos en base de datos MYSQL UPDATE, READ


``` 
<?php
include("conexion.php");
$puesto=filter_input(INPUT_POST, 'puesto');
$fila=filter_input(INPUT_POST, 'fila');
$opcionFiltro= filter_input(INPUT_POST, 'opcion');
$puestos=["Columna_1","Columna_2","Columna_3","Columna_4","Columna_5"];
$puestoReal=$puesto-1;
if($puesto!=null&&$fila!=null){
    switch ($opcionFiltro){
    
    case "reservar": //CASO UPDATE
        $puestoEncontrado=$puestos[$puestoReal];
        
        $solicitud= "SELECT ". $puestoEncontrado. " FROM tablafilas where FILA=".$fila;
        $resultado= mysqli_query($conexion, $solicitud);
        $comparacion = mysqli_fetch_array($resultado);
        if($comparacion[0]!='L'){
          echo "<script language='JavaScript' src='alerta.js'>alert();</script> ";
        }else{
            echo $comparacion[0];
            $solicitudUpdate="UPDATE tablafilas SET ".$puestoEncontrado. "='R' WHERE FILA=".$fila;
            echo $solicitudUpdate;
            $resultado= mysqli_query($conexion, $solicitudUpdate);
            echo "<script language='JavaScript' src='alerta.js'>succes();</script> ";
        }
       break;
    case "comprar" ://CASO UPDATE
        $puestoEncontrado=$puestos[$puestoReal];
        $solicitud= "SELECT ". $puestoEncontrado. " FROM tablafilas where FILA=".$fila;
        $resultado= mysqli_query($conexion, $solicitud);
        $comparacion = mysqli_fetch_array($resultado);
        
        if($comparacion[0]==='L'){
           $solicitudUpdate="UPDATE tablafilas SET ".$puestoEncontrado. "='C' WHERE FILA=".$fila;
            $resultado= mysqli_query($conexion, $solicitudUpdate);
            echo "<script language='JavaScript' src='alertas.js'>succes()</script> ";
        }else{
            echo "<script language='JavaScript' src='alertas.js'>alert()</script> ";
        }
        break;
    case  "liberar"://CASO UPDATE
        $puestoEncontrado=$puestos[$puestoReal];
        $solicitud= "SELECT ". $puestoEncontrado. " FROM tablafilas where FILA=".$fila;
        $resultado= mysqli_query($conexion, $solicitud);
        $comparacion = mysqli_fetch_array($resultado);
        if($comparacion[0]==='C'||$comparacion[0]==='R'){
           $solicitudUpdate="UPDATE tablafilas SET ".$puestoEncontrado. "='L' WHERE FILA=".$fila;
            $resultado= mysqli_query($conexion, $solicitudUpdate);
            echo "<script language='JavaScript' src='alerta.js'>succes();</script> ";
        }else{
            echo "<script language='JavaScript' src='alerta.js'>alert();</script> ";
        }
        break;
    }
    
    
}

header("location: index.php");   
``` 
# alertas en JAVASCRIPT

```
function alert(){
	 document.write('No es posible reservar');
}
function succes(){
    
    document.write("Operación exitosa");
}
```
 </p>
</details>


 

