public class App {
    public static void main(String[] args) throws Exception {
        
        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("bmw serie 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque( 6.39));



        Carro carro2 = new Carro( "cinza", "mercedes-benz classe c", 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque( 6.46));


    }
}
