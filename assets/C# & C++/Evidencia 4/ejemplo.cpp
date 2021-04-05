# include <iostream.h>
main ( )
{
int tabla[10], minimo (int *a, int n);
cout << "Introduzca 10 enteros: \n";
for (int i=0,i<10,i++) cin>>tabla[i];
cout<<"\n el valor minimo es"
<<minimo (tabla,10)<<end;
}
int minimo (int *a, int n)
{ int menor;
menor=*a;
for (int i=1;i<n;i++) if (*(a+1)<menor)
menor=*(a+i);
return menor;
}
