
#include <iostream>


using namespace std;

int main() 
{
	int *puntero, x;
	puntero = NULL;
	cout << "Ingrese tamano del vector: " << endl;
	cin >> x;
	puntero = new int[x];
	for (int i = 1; i <= x; i++)
	{
		cout << "Ingrese el " << i << "Numero " << endl;
		cin >> puntero[i];
	}
	cout << "Vector numeros " << endl;
	for (int y = 1; y <= x; y++)
	{
		cout <<y<<" Vector " << puntero[y]<<endl;
	}
	

	system("PAUSE");
}
