#include <iostream>

using namespace std;

int main(void){
    int A, B, soma, subt, mult, div, resto;
    cout << "Digite um valor: ";
    cin >> A;
    cout << "Digite outro valor: ";
    cin >> B;
    soma = A + B;
    cout << "Soma = " << soma;
    subt = A - B;
    cout << "\nSubtração = " << subt;
    mult = A * B;
    cout << "\nMultiplicação = " << mult;
    div = A / B;
    cout << "\nDivisão = " << div;
    resto = A % B;
    cout << "\nResto = " << resto;
    cout << endl;

    return 0;
}