package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Universo principal = new Universo();
        //Probando con un incidente real

        ArrayList<Entidad> entidadesSa = new ArrayList<Entidad>();

        Entidad rh = new Humano("Reimu Hakurei");
        Entidad k = new Youkai("Kisume", "Tsurube-Otoshi");
        Entidad yk = new Youkai("Yamame Kurodani", "Tsuchigumo");
        Entidad pm = new Youkai("Parsee Mizuhashi", "Hashihime");
        Entidad yh = new Oni("Yuugi Hoshiguma", 70);
        Entidad sk = new Youkai("Satori Komeiji", "Satori");
        Entidad rk = new Youkai("Rin Kaenbyou", "Kasha");
        Entidad ur = new Youkai("Utsuho Reiuji", "Cuervo infernal/Yatagarasu");
        Entidad sak = new Humano("Sanae Kochiya");
        Entidad kk = new Youkai("Koishi Komeiji", "Satori");

        Habilidad incon = new Habilidad("Manipualción del inconsciente");
        Habilidad sell = new Habilidad("Capacidad de usar sellos de fantasias");
        Habilidad caer = new Habilidad("Capacidad de caer desde su cubeta y matar");
        Habilidad fuerza = new Habilidad("Fuerza increiblemente alta");
        Habilidad celos = new Habilidad("Inducir celos a las personas");
        Habilidad lectu = new Habilidad("Poder las mentes de los seres vivos");
        Habilidad cad = new Habilidad("Poder manejar cadaveres y espiritus vengativos");
        Habilidad nuc = new Habilidad("Poderes de fusion nuclear");
        Habilidad pes = new Habilidad("Controlas plagas y enfermedades");

        entidadesSa.add(rh);
        entidadesSa.add(k);
        entidadesSa.add(yk);
        entidadesSa.add(pm);
        entidadesSa.add(yh);
        entidadesSa.add(sk);
        entidadesSa.add(rk);
        entidadesSa.add(ur);
        entidadesSa.add(sak);


        
        kk.entrenarHabilidad(incon);
        rh.entrenarHabilidad(sell);
        k.entrenarHabilidad(caer);
        yk.entrenarHabilidad(pes);
        pm.entrenarHabilidad(celos);
        yh.entrenarHabilidad(fuerza);
        sk.entrenarHabilidad(lectu);
        rk.entrenarHabilidad(cad);
        ur.entrenarHabilidad(nuc);


        Incidente subAn = new Incidente("Subterranean Animism");

        principal.agregarIncidente(subAn);

        for(Entidad aux: entidadesSa) {
            subAn.añadirPersonaje(aux);
            principal.agregarPersonaje(aux);
        }

        List<Lugar> lugaresSa = new ArrayList<Lugar>();

        Lugar sub = new Lugar("Tunel subterraneo");
        Lugar pueC = new Lugar("Puente");
        Lugar cap = new Lugar("Capital del antiguo infierno");
        Lugar chi = new Lugar("Palacio de los espiritus terrenales");
        Lugar infAr = new Lugar("Infierno de las llamas ardientes");
        Lugar nInfAr = new Lugar("Nucleo del infierno de las llamas ardientes");
        Lugar temMo = new Lugar("Templo Moriya");

        lugaresSa.add(sub);
        lugaresSa.add(pueC);
        lugaresSa.add(cap);
        lugaresSa.add(chi);
        lugaresSa.add(infAr);
        lugaresSa.add(nInfAr);
        lugaresSa.add(temMo);

        for(Lugar aux: lugaresSa) {
            subAn.añadirLugar(aux);
            principal.agregarLugar(aux);
        }

        // Personajes y lugares al azar
         List<Entidad> personajesX = new ArrayList<>();
         List<Lugar> lugaresX = new ArrayList<>();

         Entidad as = new Tengu("Aya Shameimaru", TipoTengu.KARASU_TENGU);
         Entidad cw = new Hada("Clownpiece", "Infierno");
         Entidad eSY = new Yama("Eiki Shiki, Yamaxanadu");
         Entidad kh = new Lunarian("Kaguya Houraisen", "Princesa de la luna");
         Entidad sm = new Dios("Suwako Moriya", "Las montañas");

         Lugar thak = new Lugar("Templo Hakurei");
         Lugar monY = new Lugar("Montaña Youkai");
         Lugar aldH = new Lugar("Aldea humana");

         personajesX.add(as);
         personajesX.add(cw);
         personajesX.add(eSY);
         personajesX.add(kh);
         personajesX.add(sm);

         lugaresX.add(thak);
         lugaresX.add(monY);
         lugaresX.add(aldH);

         for(Entidad aux: personajesX) {
             principal.agregarPersonaje(aux);
         }

         for(Lugar aux: lugaresX) {
             principal.agregarLugar(aux);
         }

         System.out.println(principal.toString());
         System.out.println(sub.toString());
         System.out.println(kk.mostrarInfo());
    }
}