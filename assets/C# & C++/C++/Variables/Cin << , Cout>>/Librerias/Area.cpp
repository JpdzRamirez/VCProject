#include <iostream>
#include <stdlib.h>



class area

{
    //variables privadas
private:

double resultado;
const double pi=3.14159;

    //variables publicas
public:
area(){resultado=0;};
double CalcularArea ();
double getResultado(){return resultado};
};