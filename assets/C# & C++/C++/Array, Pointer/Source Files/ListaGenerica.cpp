
#include<iostream>
#include"ListaGenerica.h"

ListaGenerica::ListaGenerica()
{
    this->raiz=nullptr;
    
}

ListaGenerica::~ListaGenerica()
{
    Nodo* reco = this->raiz;
    
    Nodo* bor;
    while (reco != NULL)
    {
        bor = reco;
        reco = reco->sig;
        delete bor;
    }
}

int ListaGenerica::cantidad()
{
    Nodo* reco = raiz;
    int cant = 0;
        while (reco != NULL)
    {
        cant++;
        reco = reco->sig;
    }
    return cant;
}

void ListaGenerica::insertar(int pos, Zapato x)
{
    if (pos <= cantidad() + 1)
    {
        Nodo* nuevo = new Nodo();
        nuevo->info = x;
        if (pos == 1)
        {
            nuevo->sig = raiz;
            raiz = nuevo;
        }
        else
            if (pos == cantidad() + 1)
            {
                Nodo* reco = raiz;
                while (reco->sig != NULL)
                {
                    reco = reco->sig;
                }
                reco->sig = nuevo;
                nuevo->sig = NULL;
            }
            else
            {
                Nodo* reco = raiz;
                for (int f = 1; f <= pos - 2; f++)
                {
                    reco = reco->sig;
                }
                Nodo* siguiente  = reco->sig;
                reco->sig = nuevo;
                nuevo->sig = siguiente;
            }
    }
}


string ListaGenerica::extraer(int posicion)
{
    int pos = posicion;
    Nodo* devolver;
    if (pos <= cantidad())
    {
        string informacion;
        Nodo* bor;
        if (pos == 1)
        {
            informacion ="Producto: " + raiz->info.getNombre() +"\n Tipo: " + raiz->info.getTipo()+"\n Codigo: "+ raiz->info.getCodigo()+"\n Precio: "+ raiz->info.getTalla()+"\n";
            bor = raiz;
            raiz = raiz->sig;
        }
     else
        {
            Nodo* reco;
            reco = raiz;
            for (int f = 1; f <= pos - 2; f++)
            {
                reco = reco->sig;
            }
            Nodo* prox = reco->sig;
            reco->sig = prox->sig;
            informacion = "Producto: " + raiz->info.getNombre() + "\n Tipo: " + raiz->info.getTipo() + "\n Codigo: " + raiz->info.getCodigo() + "\n Precio: " + raiz->info.getTalla() + "\n";
            bor = prox;
        }
        delete bor;
        return informacion;
    }
    else
        return "\0";
}

void ListaGenerica::borrar(int pos)
{
    if (pos <= cantidad())
    {
        Nodo* bor;
        if (pos == 1)
        {
            bor = raiz;
            raiz = raiz->sig;
        }
        else {
            Nodo* reco;
            reco = raiz;
            for (int f = 1; f <= pos - 2; f++)
            {
                reco = reco->sig;
            }
            Nodo* prox = reco->sig;
            reco->sig = prox->sig;
            bor = prox;
        }
        delete bor;
    }
}

void ListaGenerica::intercambiar(int pos1, int pos2)
{
    if (pos1 <= cantidad() && pos2 <= cantidad())
    {
        Nodo* reco1 = raiz;
        for (int f = 1; f < pos1; f++)
        {
            reco1 = reco1->sig;
        }
        Nodo* reco2 = raiz;
        for (int f = 1; f < pos2; f++)
        {
            reco2 = reco2->sig;
        }
        string aux = reco1->info.getNombre();
        reco1->info.setNombre(reco2->info.getNombre()) ;
        reco2->info.setNombre(aux) ;
    }
}

bool ListaGenerica::vacia()
{
    if (raiz == NULL)
        return true;
    else
        return false;
}


void ListaGenerica::imprimirCompleto()
{
    Nodo* reco = raiz;
    int item = 1;
    cout << "Listado completo.\n";
    while (reco != NULL)
    {
        cout << item << " COD. " << reco->info.getCodigo() << " | NOMBRE: " << reco->info.getNombre() << " | PRECIO: "<<reco->info.getPrecio()<<" |TALLA: "<<reco->info.getTalla() << " | TIPO: " << reco->info.getTipo() << endl;
        reco = reco->sig;
        item++;
    }
    cout << "\n";
}
void ListaGenerica::imprimir()
{
    Nodo* reco = raiz;
    int item=1;
    cout << "Listado completo.\n";
    while (reco != NULL)
    {
        cout <<item<<" COD. " <<reco->info.getCodigo()<<" NOMBRE: " << reco->info.getNombre() << " -";
        reco = reco->sig;
        item++;
    }
    cout << "\n";
}

 void ListaGenerica::modificarItem(string _codigo)
{
    Nodo* reco =raiz;
    bool existe = false;
    int opcionModificar = 0;
    int salir = 1;
    string varTempString = "";
    float varTempFloat = 0;
    string optionEXIT = "";
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
        do
        {
            cout << "Seleccione la opcion para modificar" << endl;
            cout << "Por favor ingrese los datos:" << endl;
            cout << "1. Modificar nombre del producto: " << endl;
            cout << "2. Modificar talla:" << endl;
            cout << "3. Modificar el precio:" << endl;
            cout << "4. Modificar el tipo de calzado: " << endl;
            cout << "5. Modificar el codigo del producto" << endl;
            cout << "6. Regresar al menu principal" << endl;
            while (true)
            {
                cin >> opcionModificar; //En este caso la variable es de tipo integer
                if (!std::cin.good())
                {
                    cout << "¡ERROR:Debe ingresar un numero!\n";
                    cin.clear();
                    cin.ignore(numeric_limits<streamsize>::max(), '\n');
                }
                else
                    break;
            }
            switch (opcionModificar)
            {
            case 1:
                        cout << "Ingrese el nuevo nombre: " << endl;
                        cin >> varTempString;
                        reco->info.setNombre(varTempString);
                break;
            case 2:
                        cout << "Ingrese la nueva talla: " << endl;
                        cin >> varTempString;
                        reco->info.setTalla(varTempString);
                break;
            case 3:
                        cout << "Ingrese el nuevo precio: " << endl;
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
                        reco->info.setPrecio(varTempFloat);
                break;
            case 4:
                        cout << "Ingrese el Nuevo tipo de calzado: " << endl;
                        cin >> varTempString;
                        reco->info.setTalla(varTempString);
                break;
            case 5:
                cout << "Ingrese el Nuevo codigo: " << endl;
                cin >> varTempString;
                reco->info.setCodigo(varTempString);
            case 6:
                cout << "Regresando al menu principal" << endl;
                salir = 0;
            default:
                cout << "La opcion seleccionada no es la correcta" << endl;
                cout << "¿Desea salir del programa?" << "Y/N" << endl;
                        cin >> optionEXIT;
                        if (optionEXIT == "Y" || optionEXIT == "y")
                        {
                            salir=0;
                        }
                        else if (optionEXIT == "N" || optionEXIT == "n")
                        {
                            cout << "Regresando al menu de edicion" << endl;
                        }
                        else
                        {
                            cout << "Ninguna opción es correcta" << endl;
                        }

                break;
            }
            system("pause");
            system("cls");
        } while (salir!=0);
       
    }else {
        cout << "Codigo incorrecto o no existe  \n" << endl;
    }
    
}

