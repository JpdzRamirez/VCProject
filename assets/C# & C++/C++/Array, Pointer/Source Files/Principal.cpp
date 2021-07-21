#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <stdlib.h>
#include <list>
#include <stdio.h>
#include <conio.h>
#include <string>

#include "MenuHeader.h"
#include "Producto.h"
#include "Zapato.h"
#include "AdministradorProductos.h"



using namespace std;





int main() {

	//list<Zapato> listaProductos ;
	Menu menu;
	
	string optionEXIT; //Respuesta de tipo caracter
	int optionMenu, llavePrincipal, llaveSecundaria, llaveTerciaria;

	// Creación del administrador
	AdministradorProductos admin;
	//Variable temporal de zapato
	Zapato temp;
	
	//variable temporal para string
	char varTempString[50];
	//variable temporal para enteros
	//variable temporal para dobles
	float varTempFloat;

	llavePrincipal = 1;
	llaveSecundaria = 1;
	llaveTerciaria = 0;
	optionMenu = 0;
	varTempFloat = 0.0;
	optionEXIT.clear();
	memset(varTempString, 0, 50);
	
	
	do
	{	
		// INICIADORES DE LLAVES SECUNDARIAS Y OBJETO DE SELECCION
		llavePrincipal = 1;
		llaveSecundaria = 1;
		llaveTerciaria = 0;
		optionMenu=0;
		varTempFloat = 0.0;
		optionEXIT.clear();
		memset(varTempString,0,50);
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
		switch (optionMenu) {

		case 1:
			
				do
				{
					menu.limpiar();
					optionMenu = 0;
					menu.showTitle();
					admin.imprimirProductos_Header();
					menu.showOption_1();
					while (true)
					{
						cin >> optionMenu; //En este caso optionMenu es entero y debe recibir un entero
						if (!std::cin.good())
						{
							cout << "¡ERROR:Debe ingresar un numero!\n";
							cin.clear();
							cin.ignore(numeric_limits<streamsize>::max(), '\n');
						}
						else
							break;
					}
					
					switch (optionMenu)
					{
					case 1:		 ////////////////////////CASO AGREGAR NOMBRE//////////////////////////////////////////////
							if (temp.getNombre()=="")
							{
								//Caso cuando no hay instancia de nombre
								cout << "Ingrese el nombre: " << endl;
								cin >> varTempString;
								temp.setNombre(varTempString);
								cout << "Nombre agregado exitosamente" << endl;
							}
							else
							{
								cout << "¿Desea remplazar el nombre? Y/N" << endl;
										cin >> optionEXIT;
										if (optionEXIT=="Y" || optionEXIT=="y")
										{
											cout << "Ingrese el nuevo nombre: " << endl;
											cin >> varTempString;
											temp.setNombre(varTempString);
											cout << "Nombre agregado exitosamente" << endl;
											break;
										}
										else if (optionEXIT == "N" || optionEXIT == "n")
										{
											cout << "Regresando al menu principal" << endl;
											break;
										}
										else
										{
											cout << "Ninguna opción es correcta" << endl;
											break;
										}
							}
						

						break;  ////////////////////////CASO AGREGAR TALLA//////////////////////////////////////////////
					case 2:                     //Caso agregar talla
						if (temp.getTalla()=="")
						{
							//Caso cuando no hay instancia de talla
							cout << "Ingrese la talla: " << endl;
							cin >> varTempString;
							temp.setTalla(varTempString);
							cout << "Talla agregada exitosamente" << endl;
						}
						else
						{
							cout << "¿Desea remplazar la talla? Y/N" << endl;
							cin >> optionEXIT;
							if (optionEXIT == "Y" || optionEXIT == "y")
							{
								cout << "Ingrese la nueva talla: " << endl;
								cin >> varTempString;
								temp.setTalla(varTempString);
								cout << "Talla agregada exitosamente" << endl;
								break;
							}
							else if (optionEXIT == "N" || optionEXIT == "n")
							{
								cout << "Regresando al menu principal" << endl;
								break;
							}
							else
							{
								cout << "Ninguna opción es correcta" << endl;
								break;
							}
						}
						break;
						//////////////////////////Caso agregar Precio//////////////////////////
					case 3:						// Caso agregar precio
						if (temp.getPrecio() == 0)
						{
							//Caso cuando no hay instancia de precio
							cout << "Ingrese el precio: " << endl;
							while (true)
							{
								cin >> varTempFloat; //En este caso la variable es de tipo float
								if (!std::cin.good())
								{
									cout << "¡ERROR:Debe ingresar un numero!\n";
									cin.clear();
									cin.ignore(numeric_limits<streamsize>::max(), '\n');
								}
								else
									break;
							}
							temp.setPrecio(varTempFloat);
							cout << "Precio agregado exitosamente" << endl;
						}
						else
						{
							cout << "¿Desea remplazar el precio? Y/N" << endl;
							cin >> optionEXIT;
							if (optionEXIT == "Y" || optionEXIT == "y")
							{
								cout << "Ingrese el nuevo Precio: " << endl;
								cin >> varTempFloat;
								while (true)
								{
									cin >> varTempFloat; //En este caso la variable es de tipo float
									if (!std::cin.good())
									{
										cout << "¡ERROR:Debe ingresar un numero!\n";
										cin.clear();
										cin.ignore(numeric_limits<streamsize>::max(), '\n');
									}
									else
										break;
								}
								temp.setPrecio(varTempFloat);
								cout << "Precio agregado exitosamente" << endl;
							}
							else if (optionEXIT == "N" || optionEXIT == "n")
							{
								cout << "Regresando al menu principal" << endl;
							}
							else
							{
								cout << "Ninguna opción es correcta" << endl;
							}
						}
						break;
					case 4: //////////////////////////////////CASO AGREGAR TIPO DE CALZADO//////////////////////////////////
						if (temp.getTipo()=="")
						{
							//Caso cuando no hay instancia de talla
							cout << "Ingrese el tipo de calzado: " << endl;
							cin >> varTempString;
							temp.setTipo(varTempString);
							cout << "Tipo de calzado agregado exitosamente" << endl;
						}
						else
						{
							cout << "¿Desea remplazar el tipo? Y/N" << endl;
							cin >> optionEXIT;
							if (optionEXIT == "Y" || optionEXIT == "y")
							{
								cout << "Ingrese el nuevo tipo: " << endl;
								cin >> varTempString;
								temp.setTipo(varTempString);
								cout << "Tipo de calzado agregado exitosamente" << endl;
							}
							else if (optionEXIT == "N" || optionEXIT == "n")
							{
								cout << "Regresando al menu principal" << endl;
							}
							else
							{
								cout << "Ninguna opción es correcta" << endl;
							}
						}
						break;
					case 5: ////////////////////////////Agregar CODIGO//////////////////////////////////
						if (temp.getCodigo() == "")
						{
							//Caso cuando no hay instancia de talla
							cout << "Ingrese el codigo del calzado: " << endl;
							cin >> varTempString;
							temp.setCodigo(varTempString);
							cout << "Codigo de calzado agregado exitosamente" << endl;
						}
						else
						{
							cout << "¿Desea remplazar el codigo? Y/N" << endl;
							cin >> optionEXIT;
							if (optionEXIT == "Y" || optionEXIT == "y")
							{
								cout << "Ingrese el nuevo codigo: " << endl;
								cin >> varTempString;
								temp.setCodigo(varTempString);
								cout << "Codigo de calzado agregado exitosamente" << endl;
							}
							else if (optionEXIT == "N" || optionEXIT == "n")
							{
								cout << "Regresando al menu principal" << endl;
							}
							else
							{
								cout << "Ninguna opción es correcta" << endl;
							}
						}
						break;
					case 6:
						cout << "Regresando al menu principal " << endl;
						llaveSecundaria = 0;
						break;
					default:
						cout << "El sistema no reconoce la entrada" << endl;
						break;

					}
					system("PAUSE");
				} while (llaveSecundaria != 0); //cierre while en agregando items de objeto en lista
				
				
				if (temp.validarContenido()!=true)
				{
					cout << "Ningún artigulo agregado, favor llenar todos los conceptos del producto" << endl;
				}
				else
				{
					admin.agregarProducto(admin.getContadorProductos(), temp);
				}
				
			
					break; //break del caso 1 principal
					
		case 2:
			menu.limpiar();
			menu.showOption_2();
			admin.imprimirProductos_Header();
			admin.imprimirListaProductos();
			break;

		case 3:
			menu.limpiar();
			admin.imprimirListaCodigos();
			cout << "Ingrese el codigo del producto a modificar" << endl;
			cin >> varTempString;
			admin.modificarProducto(varTempString);
		default: // CASO OPCION ERRONEA
				menu.showOption_Default();
				cin>>optionEXIT;
						if (optionEXIT == "Y" || optionEXIT == "y")
						{
							llavePrincipal = 0;
						}
						else if (optionEXIT == "N" || optionEXIT == "n")
						{
							cout << "Regresando al menu principal" << endl;
						}
						else
						{
							cout << "Ninguna opción es correcta" << endl;
						}
			break;
		}
		system("pause");
		menu.~Menu();
		temp.~Zapato();
		menu.limpiar();
	} while (llavePrincipal!=0);
	
	
	system("pause");
	return EXIT_SUCCESS;
}

