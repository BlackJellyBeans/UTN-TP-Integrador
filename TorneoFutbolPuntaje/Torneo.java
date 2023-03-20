import java.util.Scanner;

public class Torneo {

    public static void main (String[] args) {


        Equipo equipos[] = new Equipo[2];
        String nombre1 = "Argentina";
        String descripcion1 = "3 veces campeon del mundo";

        String nombre2 = "Francia";
        String descripcion2 = "Segundos";

        boolean existe = false;
        int indice = 0;

        Equipo equipo1  = new Equipo(nombre1, descripcion1);
        Equipo equipo2  = new Equipo(nombre2, descripcion2);


        equipos[0] = equipo1;
        equipos[1] = equipo2;

        Partido partidos[] = new Partido[2];
        partidos[0] = new Partido(equipo1, equipo2, (int)(Math.random()*5),(int)( Math.random()*5));

        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa tu equipo");
        String no1 = teclado.nextLine();
        System.out.println("ingresa tu segundo equipo");
        String no2 = teclado.nextLine();



        for(int i = 0; i < 1; i++) {
            if ((partidos[i].getEquipo1().getNombre().equals(no1)) && partidos[i].getEquipo2().
                    getNombre().equals(no2)) {
                existe  = true;
                indice = i;
            }
        }

        System.out.println("Goles metidos por "+ no1+ ": "+partidos[indice].getGolesEquipo1());

        System.out.println("Goles metidos por "+ no2+ ": "+partidos[indice].getGolesEquipo2());

        if(existe) {
            partidos[indice].Resultado();
        } else {
            System.out.println("No hubo un partido entre estos 2 equipos");
        }


            }
      }