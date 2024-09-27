public class App {
    public static void main(String[] args) throws Exception {
        int ika = 100;
        // Tulostusehdot
        if (ika >= 0 && ika < 18)
        {
            // Tulostaa jos alaikäinen
            System.out.println("Olet alaikäinen");
            if (ika >= 15){
                System.out.println("Saat ajaa mopoa");
            }
            if (ika == 16 || ika == 17){
                System.out.println("Saat ajaa kevarilla");
            }
        
        }
        else if (ika >= 65)
        {
            System.out.println("Olet eläkeläinen");
    }
    else if (ika == 10 ||ika == 20 ||ika == 30 ||ika == 40){
        System.out.println("Paljon onnea tasavuosikymmenistä!!");
    }
    if (ika == 100){
        System.out.println("Paljon Onnea vaan!");
        System.out.println("Paljon Onnea vaan!");
        System.out.println("Paljon Onnea vaan!");
    }
    if (ika == 18){
        System.out.println("Olet juuri täyttänyt 18v ja saat ajaa autoa");
    }
        else 
        {
            System.out.println("Olet aikuinen");
        }
    
    
    }
}
