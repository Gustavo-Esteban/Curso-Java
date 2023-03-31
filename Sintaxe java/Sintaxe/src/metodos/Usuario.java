package metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - : Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status - : Tv Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo status - : Volume Atual : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo status - : Canal Atual : " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo status - : Canal Atual : " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo status - : Canal Atual : " + smartTv.canal);




    }
}
