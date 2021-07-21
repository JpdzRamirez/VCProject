#ifndef ListaGenerica_HEADER
#define ListaGenerica_HEADER

#include <iostream>
#include"Zapato.h"
using namespace std;

class ListaGenerica {
private:
    class Nodo {
    public:
        Zapato info;
        Nodo *sig;
    };

    Nodo *raiz;
public:
    ListaGenerica();
    ~ListaGenerica();
    int cantidad();
    void insertar(int pos, Zapato x);
    string extraer(int pos);
    void borrar(int pos);
    void intercambiar(int pos1, int pos2);
    bool vacia();
    void imprimir();
    void imprimirCompleto();
    void modificarItem(string _codigo);
};

#endif