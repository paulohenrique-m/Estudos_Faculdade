#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
int contaAno(int ano){
    int aux=0;
    scanf("%d", &ano);
    if(ano!=0&&ano>=2020&&ano<=3000){ 
        //passar o num para int para desconsiderar o restante
        //30,1203103 ira ficar 30
	    aux = (int) (ano - 10) / 76;
  	    aux++;
  	    printf("%d\n", aux * 76 + 10);
        return ano;
    }else{
        return 0;
  }
}
int main() {
    int ano=-1;
    while(ano!=0){
        ano=contaAno(ano);
    }
return 0;
}