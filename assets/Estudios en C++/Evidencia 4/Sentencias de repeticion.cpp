#include <iostream>
#include <stdlib.h>
#include <string>

using namespace std;
//DEFINIMOS LA CLASE PROMEDIO
class promedio
{
public:
float getpromedio();
void IngresarNotas (float notas);


private:
int NumNotas;
float *dir_notas=NULL;
float suPromedio;

};

float promedio::getpromedio()
{
return suPromedio; 
}
//DEFINIMOS EL METODO PARA OBTENER EL PROMEDIO

int main(){


cout<<" Cunatas notas ingresará ? (Digite el numero)"<<endl;
cin>>entrada;


dir_notas = new int[entrada];

for (size_t i = 0; i < entrada; i++)
{
    cout<<"Ingrese la nota: "<<n<<" "<<endl;
        cin>>notas[n];

}

        
} while (dir_notas!=0);

promedio=promedio/n;
cout<<"El promedio de las notas es: "<< promedio <<endl;

    return EXIT_SUCCESS;
}