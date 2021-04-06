package com.miranda.ejercicio2;

public class TestEjercicio2 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("34443025", "Carlos", "Miranda", "Miranda@gmail.com", "arenales",
                2020, 3000, "TUP");
        Alumno alumno2 = new Alumno("202023232", "Nacho", "Menndez", "mendez@mail.com", "laFacu salon 2",
                2019, 3000,"tusi");
        Alumno alumno3 = new Alumno("12021322", "Daiana", "Cataldo", "Cataldo@mail.com","san martin",
                2010, 200, "Interiorismo");
        Alumno alumno4 = new Alumno("124545666", "lola", "Lolanesio", "Lucyloles@mail.com", "Avenidad siempre viva",
                2021,3200, "COsas de pescados");


        Staff staff1 = new Staff("50524553", "Stefi", "ramirez", "@mail.com",
                "Direccion", 250000, "noche");
        Staff staff2 = new Staff("1552545", "pedro", "ramos", "@mail.com",
                "Direccion", 25326, "noche");
        Staff staff3 = new Staff("6564325", "Roman", "ramas", "@mail.com",
                "Direccion", 2500, "noche");
        Staff staff4 = new Staff("78546252", "ingrid", "ramir", "@mail.com",
                "Direccion", 75000, "noche");


        Persona[] personas = new Persona[]{alumno1,alumno2,alumno3,alumno4,staff1,staff2,staff3,staff4};
        int auxA=0;
        int auxS=0;
        for (Persona persona: personas) {

            if(persona instanceof Alumno){
                auxA++;
            }else if(persona instanceof Staff){
                auxS++;
            }

        }

        System.out.println("La cantidad de alumnos es " + auxA + " y la cantidad de miembros del staff es de " + auxS);
        int totalCuotas=0;
        for (Persona persona: personas) {
            if(persona instanceof Alumno){
                totalCuotas+=((Alumno) persona).getCuota();
            }
        }

        System.out.println("La cantidad toal de los pagos de los alumnos " + totalCuotas);
    }
}
