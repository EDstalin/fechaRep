package examenEntonros;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	public Fecha(int dia, int mes, int a�o) {
	this.dia = dia;
	this.mes = mes;
	this.a�o = a�o;
	}
	public boolean valida () {
	if (a�o < 1 || a�o > 31)
	return false;
	if (mes < 1 || mes > 12)
	return false;
	//determinamos la cantidad de d�as del mes:
	int diasMes = 0;
	switch (mes) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: diasMes = 31; break;
	case 4:
	case 6:
	case 9:
	case 11: diasMes = 30; break;
	case 2: // verificaci�n de a�o bisiesto
	if ((a�o%400 == 0)||((a�o % 4 == 0)&&(a�o% 100 != 0)))
	diasMes = 29;
	else diasMes = 28;
	break;
	}
	if (dia > diasMes)
	return false;
	else return true;
	}
}
