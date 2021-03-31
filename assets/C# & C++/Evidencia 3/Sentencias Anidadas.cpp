#include <iostream>
#include <stdlib.h>

using namespace std;
//Funcion obtener tamano del Arreglo
float get_array_size(float arr[]){
    return sizeof (arr) /sizeof (arr);
}

int main()
{
    // DECLARAR VARIABLES
float notas[4],count,promedio;
//******************
// INICIALIZAR VARIABLES
promedio,count=0;
//******************
    for (size_t i =1 ; i < 5; i++)
    {
        cout<<"Ingrese la nota  "<<i<<endl;
        cin>> notas[i];
        promedio=promedio+notas[i];
        count=count +1;
    }
    promedio=promedio/count;
    cout<<"RESULTADOS"<<endl;
    if (promedio>=0 && promedio<3)
    { 
        cout<<"Promedio : "<<promedio<<"No aprobado"<<endl;
        cout<<endl;
    }
        else if (promedio>=3 && promedio<3.5)
        {
        cout <<"Promedio : "<<promedio<<endl;
        cout<<" En este momento no tiene aprobada la materia de tecnología, pero tiene la oportunidad de recuperar"<<endl;
        }
            else
                {

                    cout<<"Promedio : "<<promedio<<" Aprobado"<<endl;;
                }
    cout<<" Elaborado por : Jeremy Ivan Pedraza Hernandez"<<endl;
return EXIT_SUCCESS;


}