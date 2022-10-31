public class Cometaharley {
    //func para verificar se o numero 0 foi digitado pelo usuario
    //para encerrar a func
    public static boolean isFinal(int num){
		if(num==0){
			return true;
		}else{
			return false;
		}
	}
    public static void printAno(int num){
        MyIO.println(num);
    }
    //func para calcular o ano que o cometa passara dado o ano
    //digitado para frente de 2020 ate 3000
    public static int calculaAno(int num){
        int antigoAno=0;
        int novoAno=0;
        //calculo usando desde a "primeira" vez que o cometa
        //passou no calendario (começando em 0)e utilizando 
        //o numero que leva para ele dar a volta como divisor para
        //descobrir a quantade de vezes que ja passou, podendo assim
        //multiplicar pelo ano dado para resultar o novo ano de passagem
        antigoAno = (num-10)/76;
        antigoAno++;
        novoAno= 10+(76*antigoAno);
        return novoAno;
    }

    public static void main(String[] args) {
        int num = -1;
        int ano = 0;
        do {
            num = MyIO.readInt();
            if(isFinal(num)==false&&num>=2020&&num<=3000){
                ano=calculaAno(num);
                printAno(ano);
            }else{
                break;
            }
        } while (isFinal(num)==false);
    }
}
