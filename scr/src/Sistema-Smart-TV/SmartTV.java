public class SmartTV {
    //      CRIANDO UMA SMART TV
    //1: Características: Ligada ou Desligada(BOOLEAN), Canal(INT), Volume(INT)
    //2: A TV poderá ligar e desligar e assim mudar o estado de ligada
    //3: A TV aumentará e diminuirá o volume sempre em +1 ou -1
    //4: A TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("");
    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume Para: " + volume);

    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume Para: " + volume);

    }


    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}


