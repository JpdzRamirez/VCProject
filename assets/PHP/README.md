# Desarrollo WEB en PHP🐘 + Apache 🕊 + MYSQL🐬 + Tomcat 🐱

> En este repositorio trataremos todos los conceptos y fundamentos para desarrollar 

<body>
<div>
<p>
✔ En primera instancia vamos a configurar el entorno de desarrollo para PHP  
 </p>
 
https://user-images.githubusercontent.com/66846214/126926685-abd2be38-2572-44a1-aa21-ae28edee6522.mp4

> Video explicativo -> Como configurar PHP🎬
</div>

## Actividad 2 Colectores  
 <div>
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
 <div>
  
  
  ## Actividad 3 GET - POST - REQUEST // FORMS // FUNCTION  
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
 <div>
 

 </body>

