#include <iostream>
#include <stdlib.h>
using namespace std;
int main()
{   
    int piv;
    double a,count,f,operacion;
    
        
    MENU:
    cout<<"*************** MENU *****************"<<endl;
    cout<<"Ingrese numero para escojer la opcion :"<<endl;
    cout<<"1. Tablas de multiplicar"<<endl;
    cout<<"2. Calcular aceleración"<<endl;
    cout<<"3. Salir"<<endl;
    cin >> piv;
    if (piv==3)
    {
       exit;
    }
    else
    {
 switch (piv)
    {
    case 1:
    count=11;
        cout<<"Ingrese numero para calcular tabla de multiplicar"<<endl;
    cin >> a;
    cout<< "Tabla de multiplicar del numero " << a <<" "<< endl;
       for (size_t i = 0; i < count; i++)
    {
        cout << i <<" x "<< a << " = " << a*i<< endl;
        
    }

    cout<<"Pulse ENTER para continuar volver al MENU"<<endl;
    goto MENU;
        break;
    case 2:
    cout<<"Ingrese la velocidad inicial en metros "<< endl;
    cin>>a;
    cout<<"Ingrese la velocidad final en metros  "<< endl;
    cin>>f;
    cout<<"Ingrese el tiempo en segundos"<< endl;
    cin>>count;
    operacion=(f-a)/count;
    cout<<"La aceleración es:  "<< operacion << " m/s" << endl;
    goto MENU;
    break;
    default:
    cout<<"Opcion invalida. Pulse ENTER para continuar"<< endl;
    goto MENU;
        break;
    }

    }

system("pause");
return EXIT_SUCCESS;
}