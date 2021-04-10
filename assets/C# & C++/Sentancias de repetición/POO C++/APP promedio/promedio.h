
class promedio
{
public:
	promedio();
	promedio(int nNotas, float y);
	float getpromedio();
	int getNotas();
	void setvectorNotas(int i);
	void valoresVectorNotas(int i, float val);
	float calcularPromedio(float valor);
	virtual ~promedio();

private:

	float *punteroNotas;
	int NumNotas;
	float suPromedio;


};

