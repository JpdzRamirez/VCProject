<header>
<H1 align="center"><Strong>ESTRUCTURA DEL LENGUAJE DE PROGRAMACION  <img src="https://art.pixilart.com/0d92ea76c0f540a.gif" width="80px"></H1>
<br>
</header>
	
# Conocimientos implementados 🧐🤓 Estructuras dinámicas en C++: Listas genéricas sencillamente enlazadas
✔ En el siguiente sistema de información se han implementado el uso de <code>Pointers</code> y estructuras de tipo <code>*Nodo</code>. <br>
✔ En el siguiente sistema de informacion se ha instanciado Listas de tipo Generica, como estructura de dato relacionado para guardar ordenadamente objetos.<br>
	
### Esquema grafico 👀
<a align="center">
<img   src="https://user-images.githubusercontent.com/66846214/126549934-0eadb038-8c5f-42e8-85c1-c0b95537624b.png" />
</a>

```
class ListaGenerica {
private:
    class Nodo {
    public:
        Zapato info;
        Nodo *sig;
    };

    Nodo *raiz;
```
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

>Actividad 2 - Evidencia 1: Taller "Aplicando expresiones y funciones matemáticas"	
	
<br>		
<p align="left"> En esta sección trabajamos la entrada y salida de datos, utilizando la funciones personalizadas, en este caso utilizamos la constante <code>M_PI</code>  de la libreria importada <code>#include "math.h". </p>

```
void AdministradorProductos::imprimirFactura(string codigo, int cantidad)
{
	double total=this->listaProductos->calcularPrecio(codigo,cantidad);

	cout << "***********************************************" << endl;
	cout << "                FACTURA DE COMPRA             " << endl;
	this->imprimirFecha();
	cout <<"Producto: " << this->listaProductos->extraer(codigo)<<endl;
	cout << "TOTAL........................................ "<<total<<"X Unit" << cantidad<<endl;
	
	
}
 ```
>Codigo utilizando funciones para Imprimir la factura
	
```	
double ListaGenerica::calcularPrecio(string _codigo, int _cantidad)
{
    Nodo* reco = raiz;
    bool existe = false;
    int opcionModificar = 0;
    int salir = 1;
    string varTempString = "";
    float varTempFloat = 0;
    string optionEXIT = "";
    double resultado = 0;

    while (reco != NULL) //VERIFICAMOS SI EXISTE EL ITEM EN LA LISTA
    {
        if (reco->info.getCodigo() == _codigo)
        {
            existe = true;
            break; //guardamos la posicion del apuntador reco que obtiene la posicion de memoria actual 
        }
        else
        {
            reco = reco->sig;
        }

    }

    if (existe) //SI EXISTE
    {
        resultado = reco->info.getPrecio()*_cantidad;
    }
    return resultado;
}
```	
>Codigo utilizado para calcular el total de la compra accediento a la lista por medio de la estructura nodo 
<code>class Nodo {
    public:
        Zapato info;
        Nodo *sig;
    };</code>
<br>
<details>
	<summary>Ver imagen👀❗</summary>
<a align="center">
<img   src="https://user-images.githubusercontent.com/66846214/126550181-16a5ad8c-ffd3-477a-8ad4-dc7890df5f71.png" />
</a>
</details>



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

