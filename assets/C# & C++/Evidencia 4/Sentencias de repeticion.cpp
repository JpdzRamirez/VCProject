#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>

        
using namespace std;


//DEFINIMOS LA CLASE PROMEDIO
class promedio
{
// Metodos de clase
public:
    float getpromedio();
    float getNotas();
    void cantidadNotas (int notas);
    void calcularPromedio(float valor);

private:
    float vectorNotas[50];
    int NumNotas;
    float *dir_notas= verctorNotas;
    float suPromedio;

};
                //RETORNADORES
                float promedio::getpromedio()
                {
                return suPromedio; 
                }
                float promedio::getNotas()
                {
                    return NumNotas;
                }
// SET VARIABLES Y CALCULOS                
        void promedio::cantidadNotas (int notas)
        {
            NumNotas=notas;
            *dir_notas= vectorNotas;
        };
//DEFINIMOS EL METODO PARA OBTENER EL PROMEDIO
        void promedio::calcularPromedio(float valor)
        {
            suPromedio=valor/NumNotas;
        }


void main(){

int entrada;

cout<< " Cunatas notas ingresará ? (Digite el numero)"<<endl;
cin>>entrada;

promedio resultados;
resultados.cantidadNotas(entrada);

for (size_t i = 1; i <= resultados.getNotas(); i++)
{
    cout<<"Ingrese la nota: "<<i<<" "<<endl;
        cin>>notas[n];

}

        

promedio=promedio/n;
cout<<"El promedio de las notas es: "<< promedio <<endl;

    return EXIT_SUCCESS;
}