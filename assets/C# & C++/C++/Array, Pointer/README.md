<header>
<H1 align="center"><Strong>ESTRUCTURA DEL LENGUAJE DE PROGRAMACION  <img src="https://art.pixilart.com/0d92ea76c0f540a.gif" width="80px"></H1>
<br>
</header>
	
## Actividad 1

>ACTIVIDAD 1  EVIDENCIA 2: ESTUDIO DE CASO "DEFINICIÓN DE VARIABLES, PRUEBA DE ENTRADA Y SALIDA DE DATOS. DESARROLLO DE APLICACIÓN EN C++ PARTE I"

<br>

<body>
	
<p align="left"> En esta sección trabajamos la entrada y salida de datos, utilizando la funcion <code>CIN y COUT</code>  de la libreria importada <code>#include "iostream". </code>En este ejemplo utilizamos limpieza de buffer para correjir la excepción producida al ingresar un numero en una variable de tipo <code>string</code></p>

```
menu.showTitle();
		menu.showOptions();
		while (true) // DESCARGAMOS LOS DATOS ERRONEOS DEL BUFFER DE ENTRADA Y SE PIDE UN DATO CORRECTO
		{
			cin >> optionMenu;
			if (!std::cin.good())
			{
				cout << "¡ERROR:Debe ingresar un numero!\n";
				cin.clear();
				cin.ignore(numeric_limits<streamsize>::max(), '\n');
			}
			else
				break;
		}
 ```
>Codigo utilizando cin y cout en UncheckedException
<br>
<details>
	<summary>Ver imagen👀❗</summary>
<a align="center">
<img   src="https://user-images.githubusercontent.com/66846214/126503238-55825956-7f23-48c6-a934-894fb5587ed1.png" />
</a>
</details>
	
	
## Actividad 2

>ACTIVIDAD 2 EVIDENCIA 2: ESTUDIO DE CASO "DEFINICIÓN DE VARIABLES, PRUEBA DE ENTRADA Y SALIDA DE DATOS. DESARROLLO DE APLICACIÓN EN C++ PARTE II	
	
<br>		
<p align="left"> En esta sección trabajamos la entrada y salida de datos, utilizando la funciones personalizadas, en este caso utilizamos la constante <code>M_PI</code>  de la libreria importada <code>#include "math.h". </p>

```
double calcularAreaTriangulo(double x, double y) {

	double area;
	area = (x * y) / 2;
	return area;
}
double calcularAreaRectangulo(double ancho, double alto) {

	double area;
	area = (ancho * alto);
	return area;
}
double calcularAreaRombo(double diagMayor, double diagMenor) {

	double area;
	area = (diagMayor * diagMenor)/2;
	return area;
}
double calcularAreaParalelogramo(double base, double altura) {

	double area;
	area = (base * altura);
	return area;
}
double calcularAreaTrapecio(double baseMayor, double baseMenor, double altura) {

	double area;
	area = ((baseMayor + baseMenor)/2)*altura;
	return area;
}

double calcularAreaCirculo(double radio) {

	double area;
	area = radio* M_PI;
	return area;
}


int main() {}
 ```
>Codigo utilizando funciones para calcular area
<br>
<details>
	<summary>Ver imagen👀❗</summary>
<a align="center">
<img   src="https://user-images.githubusercontent.com/66846214/126524171-32451034-d121-4a87-8510-2f54225c1c80.png" />
</a>
</details>

</body>

