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
 </body>

