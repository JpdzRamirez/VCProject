<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8"> 
        <title>Primer Proyecto</title>
        <meta http-equiv="Content-Type"
            content="text/html; charset=ISO-8859-
           1" />
        
    </head>
    <body>
        <p>Colecciones PHP</p> <br/>
        <a href="https://github.com/JpdzRamirez"> JEREMY IVAN PEDRAZA HERNANDEZ</a><br/>
        <?php
 echo "Esta es la Actividad de colectores"."<br/>";
 echo "Cedula de ciudadan&iacute;a" . " \n 1098797436" . "<br/>";
 echo "Saludos profesor " .'<br/>';
 
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
        
    </body>
</html>