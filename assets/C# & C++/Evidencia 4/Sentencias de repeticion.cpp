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
    promedio(int nNotas, int y, int z)
    {
        NumNotas= nNotas; 

    };
    float getpromedio();
    float getNotas();
    float setvectorNotas(int i , int x);
    void cantidadNotas (int notas);
    void calcularPromedio(float valor);
    ~promedio();

private:
    
    float vectorNotas[50];
    int NumNotas;
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
                float promedio::setvectorNotas(int i,int x)
                {
                    vectorNotas[i]=x;
                }
// SET VARIABLES Y CALCULOS                
        void promedio::cantidadNotas (int notas)
        {
            NumNotas=notas;
            
        };
//DEFINIMOS EL METODO PARA OBTENER EL PROMEDIO
        void promedio::calcularPromedio(float valor)
        {
            suPromedio=valor/NumNotas;
        }


void main(){

// INDICAMOS EL TAMAÑO DEL ARREGLO
int entrada;
cout<< " Cunatas notas ingresará ? (Digite el numero)"<<endl;
cin>>entrada;
float *dir_notas= new promedio->setvectorNotas[entrada];
promedio resultados;
resultados.cantidadNotas(entrada);

for (size_t i = 1; i <= resultados.getNotas(); i++)
{
    cout<<"Ingrese la nota: "<<i<<" "<<endl;
        cin>>resultados];

}

        

promedio=promedio/n;
cout<<"El promedio de las notas es: "<< promedio <<endl;

    return EXIT_SUCCESS;
}