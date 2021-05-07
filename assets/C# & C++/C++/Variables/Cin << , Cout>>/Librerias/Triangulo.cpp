#include <iostream>
#include <stdlib.h>
#include "Area.cpp"

using namespace std;


class Triangulo: public Area{

private:
double base,altura;

public:
Triangulo();
double CalcularArea();
};

double Triangulo::Triangulo():area(){
int x;
cout<<"Ingrese la base: "<<endl;
cin>>x;
base= _x;

altura= _y;
}
double Triangulo::CalcularArea(){
    int x =getResultado();
    cout<< "ingrese e"
}