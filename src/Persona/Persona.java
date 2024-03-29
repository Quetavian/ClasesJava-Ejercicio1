package Persona;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;

    //Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = generaDNI();
        this.sexo = 'H';
    }

    //Constructor con nombre, edad y sexo, resto por defecto
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = "";
        this.sexo = sexo;
    }

    //Constructor con todos los atributos como parámetros
    public Persona(String nombre, int edad, String DNI, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
    }

    //Método para calcular IMC. Calculará si la persona está en su peso ideal. Devuelve -1 para infrapeso, 0 para peso ideal y 1 para sobrepeso.
    public void calcularIMC(double peso, double altura) {
        double imc;
        imc = peso / (altura*altura);
        final int infrapeso = -1;
        final int peso_ideal = 0;
        final int sobrepeso = 1;
        if(imc < 18.5) {
            System.out.println(infrapeso);
        } else if(imc >= 18.5 && imc < 25) {
            System.out.println(peso_ideal);
        } else if(imc > 25 ) {
            System.out.println(sobrepeso);
        }
    }

    //Método para indicar si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad() {
        if(edad<18) {
            return false;
        } else {
            return true;
        }
    }

    //Método para comprobar el sexo introducido.
    public void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        }
    }

    //Método para devolver toda la información del objeto.
    public String toString() {
        String personaString = "Nombre: " + getNombre() + " Edad: " + getEdad() + " DNI:" + getDNI() + " Sexo: " + getSexo();
        return personaString;
    }

    //Método para generar un DNI aleatorio. Genera un número aleatorio de 8 cifras, genera a partir de este su letra correspondiente.
    public String generaDNI() {
        int num = (int) (Math.random() * 99999999) + 1;
        int restoLetra = num % 23;
        char letra = 'ñ';
        switch(restoLetra) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
        }
        return String.valueOf(num) + String.valueOf(letra);
    }

    //Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
