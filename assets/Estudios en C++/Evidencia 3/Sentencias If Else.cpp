#include <iostream>
#include <stdlib.h>

using namespace std;

int main()
{
    int edad;
    cout<<"Ingrese la edad de su hijo "<<endl;
    cin>> edad;
    if (edad>=0 && edad<6)
    {
        cout<<"el niño pertenece al grupo de la primera infancia"<<endl;
    }
        else if (edad>=6 && edad<12)
        {
        cout<<" el niño pertenece al grupo de la segunda infancia"<<endl;
        }
            else
                {
                    cout<<"el niño pertenece al grupo de los adolescentes"<<endl;
                }
return EXIT_SUCCESS;
}
